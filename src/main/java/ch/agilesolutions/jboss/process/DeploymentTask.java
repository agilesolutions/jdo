package ch.agilesolutions.jboss.process;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import javax.enterprise.concurrent.ManagedExecutorService;
import javax.enterprise.concurrent.ManagedTaskListener;
import javax.inject.Inject;

import org.slf4j.Logger;

import ch.agilesolutions.jboss.data.NexusDao;
import ch.agilesolutions.jboss.dto.DeploymentTaskRequest;
import ch.agilesolutions.jboss.model.Artefact;
import ch.agilesolutions.jboss.ssh.SSHService;

public class DeploymentTask implements Callable<String>, ManagedTaskListener {

	private static final String STAGING_DIR = System.getProperty("jboss.server.data.dir") + "/staging";
	
	@Inject
	private Logger logger;

	@Inject
	SSHService sshService;

	@Inject
	NexusDao nexusDao;

	private DeploymentTaskRequest request;

	public DeploymentTask(DeploymentTaskRequest request) {
		this.request = request;
	}

	@Override
	public String call() throws Exception {
		System.out.println(String.format("Profile %s deployed", request.getProfile().getName()));
		return "success";
	}

	@Override
	public void taskAborted(Future<?> f, ManagedExecutorService es, Object obj, Throwable ex) {
		System.out.println("Task Aborted! " + f);

	}

	@Override
	public void taskDone(Future<?> f, ManagedExecutorService es, Object obj, Throwable ex) {
		System.out.println("Task DONE! " + f);

	}

	@Override
	public void taskStarting(Future<?> f, ManagedExecutorService es, Object obj) {
		System.out.println("Task Starting! " + f);

	}

	@Override
	public void taskSubmitted(Future<?> f, ManagedExecutorService es, Object obj) {
		System.out.println("Task Submitted! " + f);

	}

	private String downloadArtefacts(Artefact artefact) {

		InputStream inputStream = nexusDao.getDeployment(artefact.getGroupId(), artefact.getArtifactId(), artefact.getVersion(), artefact.getPackaging());

		FileOutputStream fos = null;

		String fileName = STAGING_DIR + File.separator + artefact.getArtifactId() + File.separator + artefact.getArtifactId() + "." + artefact.getPackaging();

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

}
