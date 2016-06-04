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

		List<String> hosts = Stream
		                .of("srv007489lx", "srv004770lx", "srv006875lx", "srv004386lx", "srv001787lx", "srv005367lx", "srv007829lx", "srv009376lx", "srv001375lx", "srv008365lx", "srv002855lx", "srv008564lx", "srv009975lx", "srv003864lx")
		                .collect(Collectors.toList());

		logger.info("List of server CI's retrieved from HP ITSM");

		return hosts;

	}

}
