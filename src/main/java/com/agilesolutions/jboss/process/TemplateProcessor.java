package com.agilesolutions.jboss.process;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.RuntimeSingleton;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.slf4j.Logger;

import com.agilesolutions.jboss.model.Profile;

@Stateless
public class TemplateProcessor {
	
	private static final String TEMPLATE_DIR = System.getProperty("jboss.server.data.dir") + "/database/template";
	
	private static final String GENERATED_DIR = System.getProperty("jboss.server.data.dir") + "/database/generated";

	@Inject
	private Logger logger;
	
	@Inject
	private Git git;

	public String renderTemplate(Profile profile) {

		VelocityEngine ve = new VelocityEngine();
		
		Properties properties = new Properties();

		properties.setProperty("runtime.log.logsystem.class", "org.apache.velocity.runtime.log.NullLogSystem");
		//properties.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
		properties.setProperty("file.resource.loader.path", TEMPLATE_DIR);
		

		ve.init(properties);

		VelocityContext context = new VelocityContext();

		renderAttributes(context, profile);
		
		StringWriter writer = new StringWriter();
		
		File theDir = new File(GENERATED_DIR);

		// if the directory does not exist, create it
		if (!theDir.exists()) {

			theDir.mkdir();
		}
		
		try {
			Template template = ve.getTemplate("initial.cli.vm");
			
			template.merge(context, writer);

			// write converted json data to a file.
			FileWriter fileWriter = new FileWriter(GENERATED_DIR + File.separator + profile.getName() + ".cli");
			fileWriter.write(writer.toString());
			fileWriter.close();
			
//			git.add().addFilepattern(".").call();
//			
//			git.commit().setCommitter("jenkins", "jenkins@agilesolutions.com").setMessage(String.format("Generated JBoss CLI batch for profile %s", profile.getName())).call();
//			
//			git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider("jenkins", "jenkins")).call();

		} catch (Exception e) {
			//logger.error("Error saving Docker file ", e);
			throw new IllegalStateException(e);
		}

		

		return writer.toString();

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
