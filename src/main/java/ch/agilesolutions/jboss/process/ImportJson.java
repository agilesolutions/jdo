package ch.agilesolutions.jboss.process;

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

import ch.agilesolutions.jboss.data.ProfileDao;
import ch.agilesolutions.jboss.model.Datasource;
import ch.agilesolutions.jboss.model.Handler;
import ch.agilesolutions.jboss.model.Logger;
import ch.agilesolutions.jboss.model.Profile;
import ch.agilesolutions.jboss.model.QueueFactory;
import ch.agilesolutions.jboss.platform.jboss.JBossJson;
import ch.agilesolutions.jboss.platform.jboss.Server;
import ch.agilesolutions.jboss.platform.weblogic.ConnectionFactories;
import ch.agilesolutions.jboss.platform.weblogic.ConnectionFactory;
import ch.agilesolutions.jboss.platform.weblogic.DatasourceRoot;
import ch.agilesolutions.jboss.platform.weblogic.Domain;
import ch.agilesolutions.jboss.platform.weblogic.JdbcDataSource;
import ch.agilesolutions.jboss.platform.weblogic.WeblogicJson;

@Stateless
public class ImportJson {

	private static final int PRETTY_PRINT_INDENT_FACTOR = 4;

	@Inject
	private ProfileDao profileDao;

	private List<Profile> profiles = new ArrayList<>();

	public void generateProfiles(InputStream is, String domainName, String host) {

		Gson gson = new Gson();

		try {

			String XML_STRING = getStringFromInputStream(is);

			JSONObject xmlJSONObj = XML.toJSONObject(XML_STRING);

			String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
			
			jsonPrettyPrintString = jsonPrettyPrintString.replaceAll("\\$\\{.*\\}", "");

			if (gson.fromJson(jsonPrettyPrintString, WeblogicJson.class).getDomain() != null) {
				importWeblogic(gson.fromJson(jsonPrettyPrintString, WeblogicJson.class).getDomain(), domainName, host);
			}

			if (gson.fromJson(jsonPrettyPrintString, JBossJson.class).getServer() != null) {
				importJBoss(gson.fromJson(jsonPrettyPrintString, JBossJson.class).getServer(), domainName, host);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void importJBoss(Server server, String domainName, String host) {

		// map to profiles

		Profile profile = new Profile();

		profiles.add(profile);

		profile.setDomain(domainName);
		profile.setName(String.format("%s-%s", domainName, "imported"));
		profile.setDescription(String.format("%s-%s", domainName, "imported"));
		profile.setHostName(host);

		server.getSocketBindingGroup().getSocketBinding().stream().forEach(s -> {
			profile.getSocketBindings().put(s.getName(), s.getPort());
		});

		server.getProfile().getSubsystem().stream().forEach(s -> {

//			for (ch.agilesolutions.jboss.platform.jboss.Datasource ds : s.getDatasources().getDatasource()) {
//				Datasource datasource = new Datasource();
//				datasource.setName(ds.getPoolName());
//				datasource.setDescription(ds.getPoolName());
//				datasource.setDriver(ds.getDriver());
//				datasource.setJndiName(ds.getJndiName());
//				datasource.setUrl(ds.getConnectionUrl());
//				profile.getDatasources().add(datasource);
//			}

			for (ch.agilesolutions.jboss.platform.jboss.XaDatasource ds : s.getDatasources().getXaDatasource()) {
				Datasource datasource = new Datasource();
				datasource.setName(ds.getPoolName());
				datasource.setDriver(ds.getDriver());
				datasource.setJndiName(ds.getJndiName());
				datasource.setUrl(ds.getXaDatasourceProperty().withName("URL").getContent());
				
				profile.getDatasources().add(datasource);
			}
			
			s.getLogger().stream().forEach(l->{
				
				Logger logger = new Logger();

				logger.setName(l.getCategory());
				logger.setLogLevel(l.getLevel().getName());
				logger.setParent(l.getUseParentHandlers());
				profile.getLoggers().add(logger);
				
			});
			
			s.getPeriodicRotatingFileHandler().stream().forEach(h->{
				
				Handler handler = new Handler();
				handler.setName(h.getName());
				handler.setDescription(h.getName());
				handler.setFormatter(h.getFormatter().getPatternFormatter().getPattern());
				handler.setLogLevel(h.getLevel().getName());
				handler.setPath(h.getFile().getPath());
				handler.setSuffix(h.getSuffix().getValue());
				profile.getHandlers().add(handler);
					
				
			});


		});


		profileDao.save(profile, String.format("New profile %s imported through standalone.xml", profile.getName()));

	}

	private void importWeblogic(Domain dom, String domainName, String host) {

		// map to profiles
		for (ch.agilesolutions.jboss.platform.weblogic.Server server : dom.getServer()) {

			Profile profile = new Profile();

			profiles.add(profile);

			profile.setDomain(domainName);
			profile.setName(String.format("%s-%s", domainName, server.getName()));
			profile.setDescription(server.getName());
			profile.setHostName(host);
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

			profileDao.save(profile, String.format("New profile %s imported through Weblogic config descriptor", profile.getName()));

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

		profileDao.save(profile, String.format("Weblogic datasource %s imported on profile %s", ds.getName(), profile.getName()));

	}

	private void importQueueFactory(ConnectionFactory cf, Profile profile) {

		QueueFactory qf = new QueueFactory();

		qf.setId(1);
		qf.setName(cf.getName());
		qf.setDescription(cf.getName());
		qf.setJndiName(cf.getJndiName());

		profile.getQueueFactories().add(qf);

		profileDao.save(profile, String.format("Queuefactor %s imported on profile %s", qf.getName(), profile.getName()));

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
