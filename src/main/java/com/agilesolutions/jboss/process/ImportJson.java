package com.agilesolutions.jboss.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.json.JSONObject;
import org.json.XML;

import com.google.gson.Gson;
import com.agilesolutions.jboss.data.ProfileDao;
import com.agilesolutions.jboss.model.Datasource;
import com.agilesolutions.jboss.model.Handler;
import com.agilesolutions.jboss.model.Logger;
import com.agilesolutions.jboss.model.Profile;
import com.agilesolutions.jboss.model.QueueFactory;
import com.agilesolutions.jboss.weblogic.ConnectionFactories;
import com.agilesolutions.jboss.weblogic.ConnectionFactory;
import com.agilesolutions.jboss.weblogic.DatasourceRoot;
import com.agilesolutions.jboss.weblogic.JdbcDataSource;
import com.agilesolutions.jboss.weblogic.Server;
import com.agilesolutions.jboss.weblogic.WeblogicJson;

@Stateless
public class ImportJson {

	private static final int PRETTY_PRINT_INDENT_FACTOR = 4;

	@Inject
	private ProfileDao profileDao;

	private List<Profile> profiles = new ArrayList<>();

	public void generateProfiles(InputStream is, String domainName) {

		Gson gson = new Gson();

		try {

			String XML_STRING = getStringFromInputStream(is);

			JSONObject xmlJSONObj = XML.toJSONObject(XML_STRING);

			String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);

			// convert the json string back to object
			WeblogicJson obj = gson.fromJson(jsonPrettyPrintString, WeblogicJson.class);

			// map to profiles
			for (Server server : obj.getDomain().getServer()) {

				Profile profile = new Profile();

				profiles.add(profile);

				profile.setDomain(domainName);
				profile.setName(String.format("%s-%s", domainName, server.getName()));
				profile.setDescription(server.getName());
				profile.setHostName(server.getListenAddress());
				profile.getSocketBindings().put("http", server.getListenPort());

				Logger logger = new Logger();
				logger.setId(1);
				logger.setLogLevel(server.getLog().getLoggerSeverity());
				logger.setName(String.format("%s-logger", server.getName()));
				profile.getLoggers().add(logger);

				Handler handler = new Handler();
				handler.setId(1);
				handler.setName(String.format("%s-handler", server.getName()));
				handler.setPath(server.getLog().getFileName());
				handler.getLoggers().add(logger);
				profile.getHandlers().add(handler);

				profileDao.save(profile);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void generateResource(InputStream is, Profile profile) {

		Gson gson = new Gson();

		try {

			String XML_STRING = getStringFromInputStream(is);

			JSONObject xmlJSONObj = XML.toJSONObject(XML_STRING);

			String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);

			if (gson.fromJson(jsonPrettyPrintString, DatasourceRoot.class).getJdbcDataSource() != null) {
				importDatasource(gson.fromJson(jsonPrettyPrintString, DatasourceRoot.class).getJdbcDataSource(), profile);
			}

			if (gson.fromJson(jsonPrettyPrintString, ConnectionFactories.class).getWeblogicJms() != null) {
				importQueueFactory(gson.fromJson(jsonPrettyPrintString, ConnectionFactories.class).getWeblogicJms().getConnectionFactory(),
				                profile);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void importDatasource(JdbcDataSource jds, Profile profile) {

		Datasource ds = new Datasource();

		ds.setId(1);
		ds.setName(jds.getName());
		ds.setUrl(jds.getJdbcDriverParams().getUrl());
		ds.setJndiName(jds.getJdbcDataSourceParams().getJndiName());
		ds.setDriver(jds.getJdbcDriverParams().getDriverName());
		jds.getJdbcDriverParams().getProperties().getProperty().stream().forEach(p -> {

			if (p.getName().equals("user")) {
				ds.setUserName(p.getName());
			}

			if (p.getName().equals("javax.net.ssl.trustStorePassword")) {
				ds.setPassword("changeme");
			}

		});

		profile.getDatasources().add(ds);
		
		profileDao.save(profile);


	}

	private void importQueueFactory(ConnectionFactory cf, Profile profile) {
		
		QueueFactory qf = new QueueFactory();

		qf.setId(1);
		qf.setName(cf.getName());
		qf.setDescription(cf.getName());
		qf.setJndiName(cf.getJndiName());

		profile.getQueueFactories().add(qf);
		
		profileDao.save(profile);

	}

	/**
	 * Transform input stream to String.
	 * 
	 * @param is
	 *            input stream to be converted to String.
	 * @return resulting string objet.
	 */
	private String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}

}
