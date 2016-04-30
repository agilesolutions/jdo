package ch.agilesolutions.jboss.ssh;

import javax.ejb.Singleton;
import javax.inject.Inject;

import org.slf4j.Logger;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * Connectivity over sftp and SSH
 * 
 * @author u24279
 * 
 */
@Singleton
public class SSHConnection {
	// ---- Fields
	@Inject
	Logger LOGGER;

	private final JSch jsch = new JSch();

	private Session session = null;

	public Session getSession() throws Exception {

		String pubkeyfile = "/root/.ssh/id_dsa";
		String host = "srp03396lx", user = "root";

		try {
			LOGGER.debug("connect...");

			jsch.addIdentity(pubkeyfile);
			jsch.setKnownHosts("/root/.ssh/known_hosts");

			session = jsch.getSession(user, host, 22);

			session.connect();
			LOGGER.debug("session connected");

		} catch (JSchException e) {
			LOGGER.error("SSHConnection: error establishing connection over SSH ", e);
			throw new Exception(e);
		}
		return session;
	}

	public void close() throws Exception {
		session.disconnect();
	}

}
