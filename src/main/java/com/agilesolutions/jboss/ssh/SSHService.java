package com.agilesolutions.jboss.ssh;

import java.io.IOException;
import java.io.InputStream;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

@Stateless
public class SSHService {

	@Inject
	Logger logger;

	@Inject
	SSHConnection connection;

	public void copyArtefact(String fileName, InputStream is) throws Exception {
		Session session = connection.getSession();
		ChannelSftp channel = null;

		try {

			channel = (ChannelSftp) session.openChannel("sftp");
			logger.debug("openChannel connected");
			channel.connect();
			logger.debug("channel connected.");

			channel.put(is, fileName);

			channel.quit();
			channel.exit();
			channel.disconnect();

		} catch (SftpException e) {
			logger.error("SSHService: error during sftp copy ", e);
			throw new Exception(e);
		} catch (JSchException e) {
			logger.error("SSHService: error during sftp copy ", e);
			throw new Exception(e);
		}
	}

	public String execCommand(String command) throws Exception {
		Session session = connection.getSession();
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

		} catch (JSchException e) {
			logger.error("SSHService: error during sftp copy ", e);
			throw new Exception(e);
		} catch (IOException ee) {
			logger.error("SSHService: error during sftp copy ", ee);
			throw new Exception(ee);
		}
	}

}
