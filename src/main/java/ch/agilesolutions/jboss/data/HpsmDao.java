package ch.agilesolutions.jboss.data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;

@Stateless
public class HpsmDao {

	@Inject
	private Logger logger;

	/**
	 * List all available server CI's from HP CMDB.
	 * 
	 * @return
	 */
	public List<String> getHosts() {

		List<String> hosts = Stream.of("hostA", "hostB", "hostD", "hostD", "hostE").collect(Collectors.toList());
		
		logger.info("List of server CI's retrieved from HP ITSM");


		return hosts;

	}

}
