package ch.agilesolutions.jboss.archive;

import static org.freecompany.redline.header.Architecture.NOARCH;
import static org.freecompany.redline.header.Os.LINUX;
import static org.freecompany.redline.header.RpmType.BINARY;

import java.io.File;
import java.util.Arrays;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.freecompany.redline.Builder;
import org.freecompany.redline.payload.Directive;
import org.slf4j.Logger;

import ch.agilesolutions.jboss.model.Profile;

@Stateless
public class RPMArchiver {

	private static final String STAGING_DIR = System.getProperty("jboss.server.data.dir") + "/staging";

	private static final String TEMPLATE_VERSION = "1.0";

	@Inject
	private Logger logger;

	public String build(Profile profile) {

		Builder builder = new Builder();
		
		String packageName = null;

		// in case you need to add RPM dependencies
		// builder.addDependencyMore(null, null);

		try {
			// Set required fields for the RPM package on headers
			builder.setSourceRpm((String) profile.getHostName() + "-" + profile.getName());
			builder.setPackage((CharSequence) String.format("jdo-%s", profile.getName()), profile.getBuildNumber().toString(),
			                TEMPLATE_VERSION);
			builder.setType(BINARY);
			builder.setPlatform(NOARCH, LINUX);
			builder.setSummary(String.format("JDO generated RPM package for profile %s-%s buildNumber %s-%s ", profile.getHostName(),
			                profile.getName(), profile.getBuildNumber(), TEMPLATE_VERSION));
			builder.setDescription(String.format("JDO generated RPM package for profile %s-%s buildNumber %s-%s ", profile.getHostName(),
			                profile.getName(), profile.getBuildNumber(), TEMPLATE_VERSION));
			builder.setBuildHost((CharSequence) profile.getHostName());
			builder.setLicense("NoCom");
			builder.setGroup("NC");
			builder.setDistribution("NoCom");
			builder.setVendor("Redline RPM Repository http://redline-rpm.org/rpms");
			builder.setPackager("JBoss DevOps deployers");
			builder.setUrl("http://nocom.com");
			String stagingDirectory = STAGING_DIR + File.separator + profile.getName();
			Arrays.stream(new File(stagingDirectory).listFiles()).forEach(((file) -> {
				if (!file.isDirectory()) {

					try {
						builder.addFile("/u01/app/admrun/" + file.getName(), file, 777, Directive.CONFIG, "admrun", "admjas");
					} catch (Exception e) {
						logger.error("Error generating RPM package ", e);
						throw new IllegalStateException(e);
					}

				}
			}));
			// life-cycle listeners go here
			builder.setPreInstallScript(new File(stagingDirectory + "/preInstall.sh"));
			builder.setPostInstallScript(new File(stagingDirectory + "/postInstall.sh"));
			builder.setPreUninstallScript(new File(stagingDirectory + "/preUninstall.sh"));
			builder.setPostUninstallScript(new File(stagingDirectory + "/postUninstall.sh"));
			
			packageName = builder.build(new File(stagingDirectory));
			
		} catch (Exception e2) 

		{
			logger.error("Error generating RPM package ", e2);
			throw new IllegalStateException(e2);
		}
		
		return packageName;

	}

}
