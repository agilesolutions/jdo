package ch.agilesolutions.jboss.process;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;

import ch.agilesolutions.jboss.archive.RPMArchiver;
import ch.agilesolutions.jboss.archive.TARArchiver;
import ch.agilesolutions.jboss.data.NexusDao;
import ch.agilesolutions.jboss.model.Profile;

@Stateless
public class Packager {

	@Inject
	private Logger logger;

	@Inject
	RPMArchiver rpmArchiver;

	@Inject
	TARArchiver tarArchiver;

	@Inject
	NexusDao nexusDao;

	private static final String TEMPLATE_DIR = System.getProperty("jboss.server.data.dir") + "/database/template";

	private static final String STAGING_DIR = System.getProperty("jboss.server.data.dir") + "/staging";

	public String generate(Profile profile) {

		renderFiles(profile);

		//downloadArtefacts(profile);

		//String rpmFile = rpmArchiver.build(profile);

		String tarFile = tarArchiver.build(profile);
		
		return nexusDao.uploadArtefact(tarFile);
		

	}

	private void renderFiles(Profile profile) {

		String stagingDirectory = STAGING_DIR + File.separator + profile.getName();

		VelocityEngine ve = new VelocityEngine();

		Properties properties = new Properties();

		properties.setProperty("runtime.log.logsystem.class", "org.apache.velocity.runtime.log.NullLogSystem");
		// properties.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
		properties.setProperty("file.resource.loader.path", TEMPLATE_DIR);

		ve.init(properties);

		VelocityContext context = new VelocityContext();

		renderAttributes(context, profile);

		// build staging folder structure
		File theDir = new File(STAGING_DIR);

		// if the directory does not exist, create it
		if (!theDir.exists()) {

			theDir.mkdir();
		}

		theDir = new File(stagingDirectory);

		// if the directory does not exist, create it
		if (!theDir.exists()) {

			theDir.mkdir();
		}

		Arrays.stream(new File(TEMPLATE_DIR).listFiles()).filter(file -> file.getName().endsWith(".vm")).forEach(((file) -> {
			if (!file.isDirectory()) {

				try {
					StringWriter writer = new StringWriter();

					Template template = ve.getTemplate(file.getName());

					template.merge(context, writer);

					// write converted json data to a file.
					FileWriter fileWriter = new FileWriter(
		                            stagingDirectory + File.separator + file.getName().substring(0, file.getName().length() - 3));
					fileWriter.write(writer.toString());
					fileWriter.close();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}));

	}

	private void downloadArtefacts(Profile profile) {

		profile.getDeployments().stream().forEach(d -> {
			InputStream inputStream = nexusDao.getArtefact(d.getGroupIdentification(), d.getArtifact(), d.getVersion(), d.getType());

			FileOutputStream fos = null;
			
			String fileName = STAGING_DIR + File.separator + profile.getName() + File.separator + profile.getName() + ".tgz";

			if (inputStream != null) {
				try {
					fos = new FileOutputStream(fileName);
					byte[] tmp = new byte[4096];
					int l;

					while ((l = inputStream.read(tmp)) != -1) {
						fos.write(tmp, 0, l);
					}
					fos.flush();

					if (fos != null) {
						fos.close();
					}
				} catch (Exception e) {
					logger.error("Error retrieving artefact from NEXUS", e.getMessage());
					throw new IllegalStateException(e);
				} finally {
					try {
						inputStream.close();
						if (fos != null) {
							fos.close();
						}

					} catch (IOException e) {
						logger.error("Error retrieving artefact from NEXUS", e.getMessage());
						throw new IllegalStateException(e);
					}
				}
			}

		});

	}

	/**
	 * 
	 * Read name and value pairs by traversing though the profile o bject graph, reflectively constructing the names from the Class meta
	 * data and values from the object instance data.
	 * 
	 * @param context
	 *            name value pair map to be filled with reflective data.
	 * @param instance
	 *            the object class to be reflectively parsed.
	 */
	private void renderAttributes(VelocityContext context, Object instance) {

		Class c = null;
		try {
			c = Class.forName(instance.getClass().getName());
			Method[] methods = c.getDeclaredMethods();

			for (Method method : methods) {
				if (method.getName().startsWith("get")) {
					context.put(method.getName().substring(3), method.invoke(instance, new Object[0]));

				}
			}

		} catch (Exception e) {
			logger.error("Error parsing velocity template  ", e);
			throw new IllegalStateException(e);
		}

	}
}
