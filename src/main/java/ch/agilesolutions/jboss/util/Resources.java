package ch.agilesolutions.jboss.util;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.atlassian.jira.rest.client.JiraRestClient;
import com.atlassian.jira.rest.client.internal.jersey.JerseyJiraRestClientFactory;

import ch.agilesolutions.jboss.cdi.SystemProperty;

/**
 * This class uses CDI to alias Java EE resources, such as the persistence
 * context, to CDI beans
 * 
 * <p>
 * Example injection on a managed bean field:
 * </p>
 * 
 * <pre>
 * &#064;Inject
 * private EntityManager em;
 * </pre>
 */
public class Resources {

	@Inject
	@SystemProperty("git.url")
	String gitUrl;

	@Produces
	public Git produceGIT(InjectionPoint injectionPoint) {

		Git git = null;
		
		System.out.println("START GIT DATABASE ****************************************************");

		File theDir = new File(System.getProperty("jboss.server.data.dir") + "/database");

		// if the directory does not exist, create it
		if (!theDir.exists()) {

			System.out.println("CREATE DIRECTORY ****************************************************");
			
			theDir.mkdir();

			try {
				System.out.println("CLONE GIT ****************************************************");
				git = Git.cloneRepository()
						.setURI(gitUrl)
						.setDirectory(theDir).call();
				System.out.println("CLONE DONE ****************************************************");

			} catch (Exception e) {
				System.out.println("CLONE FAILED ****************************************************");
				e.printStackTrace();
			}

		} else {

			FileRepositoryBuilder builder = new FileRepositoryBuilder();
			try {
				
				System.out.println("CONNECT GIT ****************************************************");

				Repository repository = builder.setGitDir(new File(theDir + File.separator + ".git")).readEnvironment()
						.findGitDir().build();

				git = new Git(repository);
				System.out.println("CONNECT DONE ****************************************************");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return git;

	}
	

	@Produces
	public Logger produceLog(InjectionPoint injectionPoint) {
		return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}

	@Produces
	@RequestScoped
	public FacesContext produceFacesContext() {
		return FacesContext.getCurrentInstance();
	}



}
