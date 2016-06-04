package ch.agilesolutions.jboss.data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;

@Stateless
public class GitDao {

	@Inject
	private Logger logger;

	/**
	 * List available jboss binaries on GIT.
	 * 
	 * @return
	 */
	public List<String> getJBossBinaries() {

		List<String> binaries = Stream.of("eap6.4.0", "eap6.4.4", "eap6.4.5").collect(Collectors.toList());

		logger.info("List of all available JBoss binaries from GIT");

		return binaries;

	}

	/**
	 * List available jboss binaries on GIT.
	 * 
	 * @return
	 */
	public List<String> getJDKBinaries() {

		List<String> binaries = Stream.of("jdk1.7.0:45", "jdk1.7.0:65", "jdk1.8.0:11", "jdk1.8.0:45").collect(Collectors.toList());

		logger.info("List of all available JBoss binaries from GIT");

		return binaries;

	}

}
