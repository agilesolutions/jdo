package ch.agilesolutions.jboss.data;

import java.io.File;
import java.io.IOException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.slf4j.Logger;

import ch.agilesolutions.jboss.cdi.SystemProperty;

@Stateless
public class TemplateDao {

	@Inject
	private Logger logger;
	
	@Inject
	@SystemProperty("template.url")
	String templateUrl;
	
	
	public void pullTemplates() {
		
		Git git = getConnection();
		
		try {
			git.checkout().setName("master").call();
			git.pull().call();
		} catch (GitAPIException e) {
			logger.error("Error synchronizing GIT repository ", e);
			throw new IllegalStateException(e);

		}
		
	}
	
	
	
	public Git getConnection() {

		Git git = null;

		File theDir = new File(System.getProperty("jboss.server.data.dir") + "/templates");

		// if the directory does not exist, create it
		if (!theDir.exists()) {

			theDir.mkdir();

			try {
				git = Git.cloneRepository()
						.setURI(templateUrl)
						.setDirectory(theDir).call();

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {

			FileRepositoryBuilder builder = new FileRepositoryBuilder();
			try {
				Repository repository = builder.setGitDir(new File(theDir + File.separator + ".git")).readEnvironment()
						.findGitDir().build();

				git = new Git(repository);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return git;

	}




}
