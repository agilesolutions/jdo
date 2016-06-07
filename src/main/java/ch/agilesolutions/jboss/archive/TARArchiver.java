package ch.agilesolutions.jboss.archive;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.GZIPOutputStream;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.FileUtils;
import org.apache.tools.tar.TarOutputStream;
import org.slf4j.Logger;

import ch.agilesolutions.jboss.model.Profile;
import ch.agilesolutions.jboss.ssh.SSHService;

@Stateless
public class TARArchiver {

	private static final String STAGING_DIR = System.getProperty("jboss.server.data.dir") + "/staging";

	@Inject
	private Logger logger;

	public String build(Profile profile) {

		String stagingDirectory = STAGING_DIR + File.separator + profile.getName();

 		String tarPath = stagingDirectory + "/tgz/";

		String tmpPath = stagingDirectory + "/tmp/";

		String prefix = profile.getPrefix();
		
		File theDir = new File(tarPath);
		
		if (!theDir.exists()) {
			theDir.mkdir();
		}

		String fileName = String.format("%s/%s.tgz", tarPath, profile.getName());


		try {

			final TarArchiveOutputStream out = new TarArchiveOutputStream(new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(fileName))));

			Arrays.stream(new File(stagingDirectory).listFiles()).forEach(((file) -> {
				if (!file.isDirectory()) {

					try {
						File toFile = new File(tmpPath + file.separator + file.getName());
						FileUtils.copyFile(file, toFile);
						addFile(prefix, "ext", toFile, out);
					} catch (Exception e) {
						logger.error("Error generating RPM package ", e);
						throw new IllegalStateException(e);
					}

				}
			}));
			// // life-cycle listeners go here
			// File toFile = new File(tarPath + "/preInstall.sh");
			// FileUtils.copyFile(new File(stagingDirectory + "/preInstall.sh"), toFile);
			// addFile(prefix, "ext", toFile, out);
			//
			// toFile = new File(tarPath + "/postInstall.sh");
			// FileUtils.copyFile(new File(stagingDirectory + "/postInstall.sh"), toFile);
			// addFile(prefix, "ext", toFile, out);
			//
			// toFile = new File(tarPath + "/preInstall.sh");
			// FileUtils.copyFile(new File(stagingDirectory + "/preInstall.sh"), toFile);
			// addFile(prefix, "ext", toFile, out);

			out.flush();

			out.close();

		} catch (Exception e) {
			logger.error("Error generating RPM package ", e);
			throw new IllegalStateException(e);
		}

		return fileName;

	}

	private static void addFile(String prefix, String token, File file, TarArchiveOutputStream taos) throws IOException {
		String filename = null;
		filename = file.getAbsolutePath();
		file.setWritable(true, false);
		String entryName = null;
		try {
			file.setExecutable(true, false);
			entryName = filename.substring(filename.lastIndexOf(file.separator + "tmp" + file.separator) + 5);
			// if (token == null) {
			// entryName = String.format("%s/%s", prefix, filename.substring(filename.lastIndexOf("/tgz/") + 5));
			// } else {
			// entryName = String.format("%s/%s/%s", prefix, token, filename.substring(filename.lastIndexOf("/tgz/") + 5));
			//
			// }
			TarArchiveEntry tae = new TarArchiveEntry(entryName);
			tae.setSize(file.length());
			taos.setLongFileMode(TarOutputStream.LONGFILE_GNU);
			taos.putArchiveEntry(tae);
			FileInputStream fis = new FileInputStream(file);
			IOUtils.copy(fis, taos);
			taos.closeArchiveEntry();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
