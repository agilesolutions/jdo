package ch.agilesolutions.jboss.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
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

import ch.agilesolutions.jboss.cdi.SystemProperty;
import ch.agilesolutions.jboss.model.Profile;

@Stateless
public class ProfileDao {

	private static final String PROFILE_DIR = System.getProperty("jboss.server.data.dir") + "/database/profiles";

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

	public Profile save(Profile profile, String comment) {

		GsonBuilder gsonBuilder = new GsonBuilder();

		Gson gson = gsonBuilder.excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();

		String filename = PROFILE_DIR + File.separator + profile.getDomain() + File.separator + profile.getName() + ".json";

		try {

			String jsonString = gson.toJson((Profile) profile);


			File theDir = new File(PROFILE_DIR);

			// if the directory does not exist, create it
			if (!theDir.exists()) {

				theDir.mkdir();
			}

			theDir = new File(PROFILE_DIR + File.separator + profile.getDomain());

			// if the directory does not exist, create it
			if (!theDir.exists()) {

				theDir.mkdir();
			}

			// write converted json data to a file.
			FileWriter writer = new FileWriter(filename);
			writer.write(jsonString);
			writer.close();

			git.add().addFilepattern(".").call();

			git.commit().setCommitter(gitUser, "robert.rong@agile-solutions.com").setMessage(comment).call();

			git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider(gitUser, gitPassword)).call();

		} catch (Exception e) {
			logger.error("Error saving profile ", e);
			throw new IllegalStateException(e);
		}

		return profile;

	}

	public Profile delete(Profile profile) {
		
		String fileName = PROFILE_DIR + File.separator + profile.getDomain() + File.separator + profile.getName() + ".json";

		try {
			File file = new File(fileName);

			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			raf.close();

			if (file.delete()) {
				//git.rm().addFilepattern(fileName).call();
				
				git.add().setUpdate(true).addFilepattern(".").call();

				git.commit().setCommitter(gitUser, "robert.rong@agile-solutions.com").setMessage(String.format("Profile %s deleted!", profile.getName())).call();

				git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider(gitUser, gitPassword)).call();
			} else {
				throw new IllegalStateException("Delete operation is failed.");

			}

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

		try {
			Files.walk(Paths.get(PROFILE_DIR)).filter(Files::isRegularFile).forEach(((path) -> {
				try {

					String stringFromFile = java.nio.file.Files.lines(path).collect(Collectors.joining());

					Profile importProfile = gson.fromJson(stringFromFile, Profile.class);

					profiles.add(importProfile);
				} catch (Exception e) {
					logger.error("Error reading profile files ", e);
					throw new IllegalStateException(e);
				}
			}));
		} catch (IOException e) {
			logger.error("Error reading profile files ", e);
			throw new IllegalStateException(e);
		}

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

		try {
			Files.walk(Paths.get(PROFILE_DIR)).filter(Files::isRegularFile).forEach(((path) -> {
				try {

					String stringFromFile = java.nio.file.Files.lines(path).collect(Collectors.joining());

					Profile importProfile = gson.fromJson(stringFromFile, Profile.class);

					if (importProfile.getDomain().equalsIgnoreCase(id)) {
						profiles.add(importProfile);
					}
				} catch (Exception e) {
					logger.error("Error reading profile files ", e);
					throw new IllegalStateException(e);
				}
			}));
		} catch (IOException e) {
			logger.error("Error reading profile files ", e);
			throw new IllegalStateException(e);
		}

		return profiles;

	}
}
