package ch.agilesolutions.jboss.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ListBranchCommand.ListMode;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Ref;
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

	public void pullTemplates(String branch) {

		Git git = getConnection();

		try {

			git.branchCreate().setForce(true).setName(branch).setStartPoint("origin/" + branch).call();
			git.checkout().setName(branch).call();
			git.pull().call();
		} catch (GitAPIException e) {
			logger.error("Error synchronizing GIT repository ", e);
			throw new IllegalStateException(e);

		}

	}

	/**
	 * List all available branches
	 * 
	 * @return list of GIT remote branches
	 */
	public List<String> listBranches() {

		List<String> branches = new ArrayList<String>();

		List<Ref> branchCommand;

		try {

			Git git = getConnection();

			git.fetch().call();

			branchCommand = git.branchList().setListMode(ListMode.REMOTE).call();

			for (Ref ref : branchCommand) {
				if (ref.getName().indexOf("origin/") != -1) {
					String shortName = ref.getName().substring(ref.getName().indexOf("origin/") + 7);
					branches.add(shortName);
				}
			}

		} catch (Exception e) {
			logger.error("Error listing branched from template repository " + e.getMessage());
			throw new IllegalStateException(e);
		}

		return branches;

	}

	public Git getConnection() {

		Git git = null;

		File theDir = new File(System.getProperty("jboss.server.data.dir") + "/templates");

		// if the directory does not exist, create it
		if (!theDir.exists()) {

			theDir.mkdir();

			try {
				git = Git.cloneRepository().setURI(templateUrl).setDirectory(theDir).call();

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
