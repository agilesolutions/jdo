package ch.agilesolutions.jboss.ssh;

import java.io.IOException;
import java.io.InputStream;

import javax.ejb.Stateless;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.slf4j.Logger;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

@Stateless
public class SSHService {

	@Inject
	Logger logger;
	
	@Inject
	FacesContext facesContext;

	@Inject
	SSHConnection connection;

	public void copyArtefact(String host, String sourceFileName, String targetFileName)  {
		Session session = createSSHConnection(host);
		ChannelSftp channel = null;

		try {

			channel = (ChannelSftp) session.openChannel("sftp");
			logger.debug("openChannel connected");
			channel.connect();
			logger.debug("channel connected.");

			channel.put(sourceFileName, targetFileName);

			channel.quit();
			channel.exit();
			channel.disconnect();

		} catch (SftpException e) {
			logger.error("SSHService: error during sftp copy ", e);
			e.printStackTrace();
			throw new IllegalStateException(e);
		} catch (JSchException e) {
			logger.error("SSHService: error during sftp copy ", e);
			e.printStackTrace();
			throw new IllegalStateException(e);
		}
	}

	public String execCommand(String host, String command)  {
		Session session = createSSHConnection(host);
		ChannelExec channel = null;
		byte[] tmp = new byte[1024];
		StringBuilder out = new StringBuilder();

		try {
			channel = (ChannelExec) session.openChannel("exec");
			((ChannelExec) channel).setPty(true);
			logger.debug("openChannel connected");

			((ChannelExec) channel).setCommand(command);

			channel.setInputStream(null);

			((ChannelExec) channel).setErrStream(System.err);

			InputStream in = channel.getInputStream();

			channel.connect();
			logger.debug("channel connected.");

			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0) {
						break;
					}
					out.append(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					if (in.available() > 0) {
						int i = in.read(tmp, 0, 1024);
						out.append(new String(tmp, 0, i));
					}
					if (channel.getExitStatus() == 0) {
						out.append("Command has been posted to the server.");
					}
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception ee) {
					logger.error(ee.getMessage());
					throw new Exception(ee);

				}
			}

			channel.disconnect();

			return out.toString();

		} catch (Exception e) {
			logger.error("SSHService: error during sftp copy ", e);
			e.printStackTrace();
			throw new IllegalStateException(e);
		}
	}
	/**
	 * http://stackoverflow.com/questions/4932005/can-we-use-jsch-for-ssh-key-based-communication
	 * @param host
	 * @return
	 */
	private Session createSSHConnection(String host) {
		
		Session session = null;
		
		String privateKey = facesContext.getCurrentInstance().getExternalContext().getRealPath("/rob");

		try {
			JSch jsch = new JSch();

			jsch.addIdentity(privateKey, "");


			session = jsch.getSession("rob", host, 22);

			session.setConfig("StrictHostKeyChecking", "no");
			session.setTimeout(15000);

			session.connect();
		} catch (Exception e) {
			throw new IllegalStateException("Error establising JIRA REST connection.", e);
		}

		return session;
	}

}
