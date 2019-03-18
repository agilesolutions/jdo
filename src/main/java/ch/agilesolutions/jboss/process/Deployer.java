package ch.agilesolutions.jboss.process;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.inject.Inject;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

import ch.agilesolutions.jboss.data.NexusDao;
import ch.agilesolutions.jboss.dto.DeploymentTaskRequest;
import ch.agilesolutions.jboss.model.Artefact;
import ch.agilesolutions.jboss.model.Profile;
import ch.agilesolutions.jboss.ssh.SSHService;

/**
 * https://www.javacodegeeks.com/2014/07/java-ee-concurrency-api-tutorial.html
 * 
 * <dependency> <groupId>org.jboss.spec.javax.enterprise.concurrent</groupId>
 * <artifactId>jboss-concurrency-api_1.0_spec</artifactId>
 * <version>1.0.0.Final</version> </dependency>
 */
@Stateless
public class Deployer {

	private static final String STAGING_DIR = System.getProperty("jboss.server.data.dir") + "/staging";

	private static final String SERVER_ROOT = "/opt/jdo";
	// private static final String SERVER_ROOT = "/u01/data/admrun/jdo";

	@Inject
	NexusDao nexusDao;

	@Inject
	private Logger logger;

	@Inject
	SSHService sshService;

	@Resource(name = "DefaultManagedScheduledExecutorService")
	ManagedScheduledExecutorService executor;

	public String deploy(String host, Profile profile, Artefact artefact) {

		String filename = "";

		StringBuilder returned = new StringBuilder();

		try {

			if (!sshService.checkDirectory(host, String.format("%s/java/%s", SERVER_ROOT, profile.getJdk()))) {

				filename = downloadBinary(profile, "java", profile.getJdk().split("-")[0],
						profile.getJdk().split("-")[1]);

				returned.append(sshService.execCommand(host, String.format("mkdir -p %s", SERVER_ROOT)));

				returned.append(sshService.execCommand(host, String.format("mkdir -p %s/java", SERVER_ROOT)));

				returned.append(sshService.copyArtefact(host, filename,
						String.format("%s/java/%s.gz", SERVER_ROOT, profile.getJdk())));
			}

			if (!sshService.checkDirectory(host, String.format("%s/jboss/%s", SERVER_ROOT, profile.getName()))) {

				filename = downloadBinary(profile, "jboss", profile.getJboss().split("-")[0],
						profile.getJboss().split("-")[1]);

				returned.append(sshService.execCommand(host, String.format("mkdir -p %s", SERVER_ROOT)));

				returned.append(sshService.execCommand(host, String.format("mkdir -p %s/jboss", SERVER_ROOT)));

				returned.append(sshService.execCommand(host, String.format("mkdir -p %s/jboss/%s", SERVER_ROOT, profile.getName())));

				returned.append(sshService.copyArtefact(host, filename,
						String.format("%s/jboss/%s/%s.gz", SERVER_ROOT, profile.getName(), profile.getJboss())));
			}

			filename = downloadArtefacts(artefact, profile);

			returned.append(sshService.execCommand(host, String.format("mkdir -p %s/staging", SERVER_ROOT)));

			// create artefact specific staging directory

			returned.append(sshService.execCommand(host,
					String.format("rm -rf %s/staging/%s", SERVER_ROOT, artefact.getArtifactId())));

			returned.append(sshService.execCommand(host,
					String.format("mkdir -p %s/staging/%s", SERVER_ROOT, artefact.getArtifactId())));

			returned.append(sshService.copyArtefact(host, filename, String.format("%s/staging/%s/%s.tar.gz",
					SERVER_ROOT, artefact.getArtifactId(), artefact.getArtifactId())));

			returned.append(sshService.execCommand(host, String.format("cd %s/staging/%s;tar -zxvf %s.tar.gz",
					SERVER_ROOT, artefact.getArtifactId(), artefact.getArtifactId())));

			returned.append(sshService.execCommand(host,
					String.format("cd %s/staging/%s;chmod 775 preinstall.sh;./preinstall.sh", SERVER_ROOT,
							artefact.getArtifactId())));

			returned.append(sshService.execCommand(host, String.format(
					"cd %s/staging/%s;chmod 775 execute.sh;./execute.sh", SERVER_ROOT, artefact.getArtifactId())));

			returned.append(sshService.execCommand(host,
					String.format("cd %s/staging/%s;chmod 775 postinstall.sh;./postinstall.sh", SERVER_ROOT,
							artefact.getArtifactId())));
			
			cleanup(profile);

		} catch (Exception e) {
			returned.append(String.format("Error copying or executing through SSH %s", e.getMessage()));
			logger.error("Error copying or executing through SSH ", e);
		}
		return returned.toString();

	}

	public String schedule(String host, Profile profile, Artefact artefact, Date date) {

		LocalDateTime fromDateTime = toLocalDate(new Date());
		LocalDateTime toDateTime = toLocalDate(date);

		Duration duration = Duration.between(fromDateTime, toDateTime);

		long seconds = duration.getSeconds();

		DeploymentTaskRequest request = new DeploymentTaskRequest(host, profile, artefact);

		ScheduledFuture<String> futureResult = executor.schedule(new DeploymentTask(request), seconds,
				TimeUnit.SECONDS);

		return "done";

	}

	private String downloadArtefacts(Artefact artefact, Profile profile) {

		String profileStagingDirectory = STAGING_DIR + File.separator + profile.getName();

		// build staging folder structure
		File theDir = new File(profileStagingDirectory);

		// if staging directory exists delete content
		if (!theDir.exists()) {

			theDir.mkdir();
		}

		InputStream inputStream = nexusDao.getDeployment(artefact.getGroupId(), artefact.getArtifactId(),
				artefact.getVersion(), artefact.getPackaging());

		FileOutputStream fos = null;

		String fileName = STAGING_DIR + File.separator + artefact.getArtifactId() + File.separator
				+ artefact.getArtifactId() + "." + artefact.getPackaging();

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

		return fileName;

	}

	private LocalDateTime toLocalDate(Date date) {

		GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
		gregorianCalendar.setTime(date);
		ZonedDateTime zonedDateTime = gregorianCalendar.toZonedDateTime();
		return zonedDateTime.toLocalDateTime();

	}

	private String downloadBinary(Profile profile, String group, String artefact, String version) {

		InputStream inputStream = nexusDao.getArtefact(group, artefact, version, "gz", "binaries");

		// build staging folder structure
		File theDir = new File(STAGING_DIR + File.separator + profile.getName());

		// if staging directory exists delete content
		if (!theDir.exists()) {

			theDir.mkdir();
		}

		FileOutputStream fos = null;

		String fileName = STAGING_DIR + File.separator + profile.getName() + File.separator + artefact + "-" + version
				+ ".gz";

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

		return fileName;

	}

	private void cleanup(Profile profile) {

		String profileStagingDirectory = STAGING_DIR + File.separator + profile.getName();

		File theDir = new File(profileStagingDirectory);

		// if staging directory exists delete content
		if (theDir.exists()) {
			try {
				FileUtils.deleteDirectory(theDir);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
