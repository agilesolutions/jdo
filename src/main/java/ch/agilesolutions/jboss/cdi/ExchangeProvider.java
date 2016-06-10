package ch.agilesolutions.jboss.cdi;

import java.net.URI;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;

/**
 * <dependency> <groupId>com.microsoft.ews-java-api</groupId> <artifactId>ews-java-api</artifactId> <version>2.0</version> </dependency>
 */
public class ExchangeProvider {
	
	@Inject
	@SystemProperty("mail.url")
	String mailUrl;

	@Inject
	@SystemProperty("mail.user")
	String mailUser;

	@Inject
	@SystemProperty("mail.password")
	String mailPassword;
	

	@Produces
	ExchangeService createExchangeConnection(InjectionPoint injectionPoint) {

		ExchangeService service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);
		try {
			service.setUrl(new URI(mailUrl));
			ExchangeCredentials credentials = new WebCredentials(mailUser, mailPassword, "nocom.com");
			service.setCredentials(credentials);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return service;
	}

}
