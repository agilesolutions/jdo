package com.agilesolutions.jboss.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.slf4j.Logger;

import com.agilesolutions.jboss.model.Domains;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Stateless
public class DomainDao {

	private static final String DATABASE_DIR = System.getProperty("jboss.server.data.dir") + "/database";

	@Inject
	private Logger logger;

	@Inject
	private Git git;

	public void save(Domains domains) {

		GsonBuilder gsonBuilder = new GsonBuilder();

		Gson gson = gsonBuilder.excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();

		String filename = DATABASE_DIR + File.separator + "meta" + File.separator + "domains.json";

		try {

			String jsonString = gson.toJson((Domains) domains);

			File theDir = new File(DATABASE_DIR + File.separator + "meta");

			// if the directory does not exist, create it
			if (!theDir.exists()) {

				theDir.mkdir();
			}

			// write converted json data to a file.
			FileWriter writer = new FileWriter(filename);
			writer.write(jsonString);
			writer.close();

			git.add().addFilepattern(".").call();

			git.commit().setCommitter("jenkins", "jenkins@agilesolutions.com").setMessage("Domains configuration changed").call();

			git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider("robertrong", "amsterdam2016")).call();

		} catch (Exception e) {
			logger.error("Error saving profile ", e);
			throw new IllegalStateException(e);
		}

	}

	/**
	 * 
	 * http://www.leveluplunch.com/java/examples/read-file-into-string/
	 */
	public Domains get() {

		try {
			git.checkout().setName("master").call();
			git.pull().call();
		} catch (GitAPIException e) {
			logger.error("Error synchronizing GIT repository ", e);
			throw new IllegalStateException(e);

		}

		Gson gson = new Gson();

		Domains domains = null;

		String filename = DATABASE_DIR + File.separator + "meta" + File.separator + "domains.json";

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			domains = gson.fromJson(br, Domains.class);

		} catch (FileNotFoundException e) {
			save(new Domains());
			logger.error("Error retrieving domains ", e);
			throw new IllegalStateException(e);
		}

		return domains;

	}

}
