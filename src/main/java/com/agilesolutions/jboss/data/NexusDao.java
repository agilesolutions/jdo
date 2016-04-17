package com.agilesolutions.jboss.data;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.agilesolutions.jboss.cdi.SystemProperty;
import com.agilesolutions.jboss.model.Artefact;
import com.agilesolutions.jboss.model.SearchResults;

@Stateless
public class NexusDao {

	private static final String NEXUS_URL = "http://nexus.agilesolutions.com";
	
	@Inject
	@SystemProperty("nexus.url")
	String nexusUrl;


	public List<Artefact> listArtefacts(String groupId, String artefact, String version, String type) throws Exception {

		try {

			HttpClient httpclient = new DefaultHttpClient();
			// compose URI for accessing Nexus
			StringBuilder builder = new StringBuilder();
			builder.append(nexusUrl);

			builder.append("/service/local/data_index/repositories/releases/content");
			builder.append("?g=");
			builder.append(groupId);
			builder.append("&a=");
			builder.append(artefact);
			builder.append("&p=");
			builder.append(type);

			HttpGet httpget = new HttpGet(builder.toString());
			HttpResponse response = httpclient.execute(httpget);

			HttpEntity entity = response.getEntity();
			if (entity != null) {

				String responseString = EntityUtils.toString(entity, "UTF-8");

				JAXBContext jaxbContext = JAXBContext.newInstance(SearchResults.class);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

				StringReader reader = new StringReader(responseString);
				SearchResults results = (SearchResults) unmarshaller.unmarshal(reader);
				int i = 1;
				for (Artefact artifact : results.getArtifactsCollection()) {
					artifact.setId(i++);
				}

				return results.getArtifactsCollection();
			}

		} catch (Exception e) {
			throw new Exception(e);
		}
		return null;

	}
	
	/**
	 * 
	 * 
	 * @param groupId
	 *            Maven group identification.
	 * @param artefact
	 *            Maven artefact id.
	 * @param version
	 *            Maven version.
	 * @param type
	 *            deployment type ZIP, EAR, WAR.
	 * @return get artefact as steam.
	 * @throws FileNotFoundException
	 * @throws Exception
	 */
	public InputStream getArtefact(String groupId, String artefact, String version, String type) throws Exception {
		try {


			HttpClient httpclient = new DefaultHttpClient();

			
			// compose URI for accessing Nexus
			StringBuilder builder = new StringBuilder();
			builder.append(NEXUS_URL);
			builder.append("/service/local/artifact/maven/redirect?r=bjb-releases");
			builder.append("&g=");
			builder.append(groupId);
			builder.append("&a=");
			builder.append(artefact);
			builder.append("&v=");
			builder.append(version);
			builder.append("&p=");
			builder.append(type);

			HttpGet httpget = new HttpGet(builder.toString());
			HttpResponse response = httpclient.execute(httpget);

			if (response.getStatusLine().getStatusCode() == 404) {

				// Release connection when nothing is found.

				if (response.getEntity() != null) {
					InputStream is = response.getEntity().getContent();
					is.close();

				}

				throw new Exception(new FileNotFoundException("Deployment artefact" + artefact + " not located!"));
			}

			HttpEntity entity = response.getEntity();
			if (entity != null) {
				return entity.getContent();
			}

		} catch (Exception e) {
			throw new Exception(e);
		}
		return null;
	}


}
