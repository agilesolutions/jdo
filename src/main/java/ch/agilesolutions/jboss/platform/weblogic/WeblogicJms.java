package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class WeblogicJms {

	@SerializedName("xmlns")
	@Expose
	private String xmlns;
	@SerializedName("connection-factory")
	@Expose
	private ConnectionFactory connectionFactory;
	@SerializedName("xsi:schemaLocation")
	@Expose
	private String xsiSchemaLocation;
	@SerializedName("xmlns:sec")
	@Expose
	private String xmlnsSec;
	@SerializedName("xmlns:xsi")
	@Expose
	private String xmlnsXsi;
	@SerializedName("xmlns:wls")
	@Expose
	private String xmlnsWls;
	@SerializedName("queue")
	@Expose
	private Queue queue;

	/**
	 * 
	 * @return The xmlns
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * 
	 * @param xmlns
	 *            The xmlns
	 */
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	/**
	 * 
	 * @return The connectionFactory
	 */
	public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	/**
	 * 
	 * @param connectionFactory
	 *            The connection-factory
	 */
	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	/**
	 * 
	 * @return The xsiSchemaLocation
	 */
	public String getXsiSchemaLocation() {
		return xsiSchemaLocation;
	}

	/**
	 * 
	 * @param xsiSchemaLocation
	 *            The xsi:schemaLocation
	 */
	public void setXsiSchemaLocation(String xsiSchemaLocation) {
		this.xsiSchemaLocation = xsiSchemaLocation;
	}

	/**
	 * 
	 * @return The xmlnsSec
	 */
	public String getXmlnsSec() {
		return xmlnsSec;
	}

	/**
	 * 
	 * @param xmlnsSec
	 *            The xmlns:sec
	 */
	public void setXmlnsSec(String xmlnsSec) {
		this.xmlnsSec = xmlnsSec;
	}

	/**
	 * 
	 * @return The xmlnsXsi
	 */
	public String getXmlnsXsi() {
		return xmlnsXsi;
	}

	/**
	 * 
	 * @param xmlnsXsi
	 *            The xmlns:xsi
	 */
	public void setXmlnsXsi(String xmlnsXsi) {
		this.xmlnsXsi = xmlnsXsi;
	}

	/**
	 * 
	 * @return The xmlnsWls
	 */
	public String getXmlnsWls() {
		return xmlnsWls;
	}

	/**
	 * 
	 * @param xmlnsWls
	 *            The xmlns:wls
	 */
	public void setXmlnsWls(String xmlnsWls) {
		this.xmlnsWls = xmlnsWls;
	}

	/**
	 * 
	 * @return The queue
	 */
	public Queue getQueue() {
		return queue;
	}

	/**
	 * 
	 * @param queue
	 *            The queue
	 */
	public void setQueue(Queue queue) {
		this.queue = queue;
	}

}
