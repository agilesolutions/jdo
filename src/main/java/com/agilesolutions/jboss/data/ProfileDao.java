package com.agilesolutions.jboss.data;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.slf4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.agilesolutions.jboss.cdi.SystemProperty;
import com.agilesolutions.jboss.model.Profile;

@Stateless
public class ProfileDao {

	private static final String DATABASE_DIR = System.getProperty("jboss.server.data.dir") + "/database";

	@Inject
	private Logger logger;

	@Inject
	private Git git;

	@Inject
	@SystemProperty("git.url")
	String gitUrl;

	@Inject
	@SystemProperty("git.user")
	String gitUser;

	@Inject
	@SystemProperty("git.password")
	String gitPassword;

	public Profile save(Profile profile) {

		GsonBuilder gsonBuilder = new GsonBuilder();

		Gson gson = gsonBuilder.excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();

		String filename = DATABASE_DIR + File.separator + profile.getName() + ".json";

		try {

			String jsonString = gson.toJson((Profile) profile);

			// write converted json data to a file.
			FileWriter writer = new FileWriter(filename);
			writer.write(jsonString);
			writer.close();

			git.add().addFilepattern(".").call();

			git.commit().setCommitter(gitUser, "robert.rong@agilesolutions.com")
					.setMessage(String.format("Changed configuration for profile %s", profile.getName())).call();

			git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider(gitUser, gitPassword)).call();

		} catch (Exception e) {
			logger.error("Error saving profile ", e);
			throw new IllegalStateException(e);
		}

		return profile;

	}

	public Profile delete(Profile profile) {

		try {
			File file = new File(DATABASE_DIR + File.separator + profile.getName() + ".json");

			if (!file.delete()) {
				throw new IllegalStateException("Delete operation is failed.");
			}

			git.add().addFilepattern(".").call();

			git.commit().setCommitter(gitUser, "jenkins@agilesolutions.com")
					.setMessage(String.format("Profile %s deleted!", profile.getName())).call();

			git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider(gitUser, gitPassword)).call();

		} catch (Exception e) {
			logger.error("Error deleting profile ", e);
			throw new IllegalStateException(e);
		}

		return profile;

	}

	/**
	 * 
	 * http://www.leveluplunch.com/java/examples/read-file-into-string/
	 */
	public List<Profile> findAll() {

		try {
			git.checkout().setName("master").call();
			git.pull().call();
		} catch (GitAPIException e) {
			logger.error("Error synchronizing GIT repository ", e);
			throw new IllegalStateException(e);

		}

		Gson gson = new Gson();

		List<Profile> profiles = new ArrayList<>();

		Arrays.stream(new File(DATABASE_DIR).listFiles()).forEach(((file) -> {
			if (!file.isDirectory()) {

				Path path;
				try {
					path = Paths.get(file.getCanonicalPath());

					String stringFromFile = java.nio.file.Files.lines(path).collect(Collectors.joining());

					Profile importProfile = gson.fromJson(stringFromFile, Profile.class);

					profiles.add(importProfile);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}));

		return profiles;

	}

	/**
	 * 
	 * http://www.leveluplunch.com/java/examples/read-file-into-string/
	 */
	public List<Profile> findByDomain(final String id) {

		try {
			git.pull().call();
		} catch (GitAPIException e) {
			logger.error("Error synchronizing GIT repository ", e);
			throw new IllegalStateException(e);

		}

		Gson gson = new Gson();

		List<Profile> profiles = new ArrayList<>();

		Arrays.stream(new File(DATABASE_DIR).listFiles()).forEach(((file) -> {
			if (!file.isDirectory()) {

				Path path;
				try {
					path = Paths.get(file.getCanonicalPath());

					String stringFromFile = java.nio.file.Files.lines(path).collect(Collectors.joining());

					Profile importProfile = gson.fromJson(stringFromFile, Profile.class);

					if (importProfile.getDomain().equalsIgnoreCase(id)) {
						profiles.add(importProfile);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}));

		return profiles;

	}
}
