package ch.agilesolutions.jboss.cdi;

import java.net.URI;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import com.atlassian.jira.rest.client.JiraRestClient;
import com.atlassian.jira.rest.client.internal.jersey.JerseyJiraRestClientFactory;

public class JiraProvider {
	
	@Inject
	@SystemProperty("jira.url")
	String jiraUrl;

	@Inject
	@SystemProperty("jira.user")
	String jiraUser;

	@Inject
	@SystemProperty("jira.password")
	String jiraPassword;
	

	@Produces
	JiraRestClient createJIRAConnection(InjectionPoint injectionPoint) {

		JerseyJiraRestClientFactory f = new JerseyJiraRestClientFactory();
		JiraRestClient jc;
		try {
			System.out.println("*************JIRA CONNET******" + jiraUser + " pass " + jiraPassword );
			jc = f.createWithBasicHttpAuthentication(new URI(jiraUrl), jiraUser, jiraPassword);
			System.out.println("*************JIRA DONE******" + jiraUser + " pass " + jiraPassword );
		} catch (Exception e) {
			System.out.println("*************JIRA FAIL******" + jiraUser + " pass " + jiraPassword );
			throw new IllegalStateException("Error establising JIRA REST connection.", e);
		}

		return jc;
	}

	public void closeJIRAConnection(@Disposes JiraRestClient jc) {
		if (jc != null)
			try {
				// do not know exactly how to close down this session.
				jc = null;
			} catch (IllegalStateException e) {
				throw new IllegalStateException("Error closing JIRA REST connection.", e);
			}

	}

}
