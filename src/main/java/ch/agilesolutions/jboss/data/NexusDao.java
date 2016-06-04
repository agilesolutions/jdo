package ch.agilesolutions.jboss.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;

import ch.agilesolutions.jboss.cdi.SystemProperty;
import ch.agilesolutions.jboss.model.Artefact;
import ch.agilesolutions.jboss.model.Deployment;
import ch.agilesolutions.jboss.model.Profile;
import ch.agilesolutions.jboss.model.SearchResults;
import ch.agilesolutions.jboss.util.Authenticator;

@Stateless
public class NexusDao {

	@Inject
	private Logger logger;

	@Inject
	@SystemProperty("nexus.url")
	String nexusUrl;

	@Inject
	@SystemProperty("nexus.user")
	String nexusUser;

	@Inject
	@SystemProperty("nexus.password")
	String nexusPassword;

	public List<Artefact> listArtefacts(String groupId, String artefact, String type) {

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
			e.printStackTrace();
			throw new IllegalStateException(e);
		}
		return null;

	}

	public List<Artefact> listPackages(Deployment deployment) {


		try {

			HttpClient httpclient = new DefaultHttpClient();
			// compose URI for accessing Nexus
			StringBuilder builder = new StringBuilder();
			builder.append(nexusUrl);

			builder.append("/service/local/data_index/repositories/deployments/content");
			builder.append("?g=");
			builder.append(deployment.getGroupIdentification());
			builder.append("&a=");
			builder.append(deployment.getArtifact());
			builder.append("&p=");

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
			e.printStackTrace();
			throw new IllegalStateException(e);
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
	public InputStream getArtefact(String groupId, String artefact, String version, String type) {
		try {

			HttpClient httpclient = new DefaultHttpClient();

			// compose URI for accessing Nexus
			StringBuilder builder = new StringBuilder();
			builder.append(nexusUrl);
			builder.append("/service/local/artifact/maven/redirect?r=releases");
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

				throw new IllegalStateException(
						new FileNotFoundException("Deployment artefact" + artefact + " not located!"));
			}

			HttpEntity entity = response.getEntity();
			if (entity != null) {
				return entity.getContent();
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalStateException(e);
		}
		return null;
	}

	/**
	 * 
	 * http://www.baeldung.com/httpclient-multipart-upload
	 * 
	 * @param filePath
	 * @return
	 */
	public String uploadArtefact(String filePath, Profile profile) {

		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(nexusUrl + "/content/repositories");

			String auth = nexusUser + ":" + nexusPassword;
			byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
			String authHeader = "Basic " + new String(encodedAuth);
			post.setHeader(HttpHeaders.AUTHORIZATION, authHeader);

			InputStream inputStream = new FileInputStream(filePath);

			MultipartEntityBuilder builder = MultipartEntityBuilder.create();
			builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
			builder.addBinaryBody("upstream", inputStream, ContentType.create("application/zip"), filePath);
			builder.addPart("r", new StringBody("releases", ContentType.MULTIPART_FORM_DATA));
			builder.addPart("g", new StringBody(String.format("com.%s", profile.getDomain()), ContentType.MULTIPART_FORM_DATA));
			builder.addPart("a", new StringBody(profile.getName(), ContentType.MULTIPART_FORM_DATA));
			builder.addPart("v", new StringBody(String.format("%s.0.0", profile.getVersion()), ContentType.MULTIPART_FORM_DATA));
			builder.addPart("p", new StringBody("tar", ContentType.MULTIPART_FORM_DATA));
			builder.addPart("e", new StringBody("tar", ContentType.MULTIPART_FORM_DATA));
			HttpEntity entity = builder.build();
			post.setEntity(entity);

			HttpResponse response = client.execute(post);

			return response.getStatusLine().toString();

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalStateException(e);
		}

	}

	/**
	 * 
	 * @return JAX-RS client builder interface which trusts all certificates.
	 */
	private Client getClient() {

		SSLContext sc = null;

		try {
			// Create a trust manager that does not validate certificate chains
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };

			// Install the all-trusting trust manager
			sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalStateException(e);
		}
		return ClientBuilder.newBuilder().sslContext(sc).register(new Authenticator(nexusUser, nexusPassword)).build();
	}

}
