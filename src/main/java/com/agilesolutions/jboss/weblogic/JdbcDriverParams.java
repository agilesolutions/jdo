package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class JdbcDriverParams {

	@SerializedName("driver-name")
	@Expose
	private String driverName;
	@SerializedName("password-encrypted")
	@Expose
	private String passwordEncrypted;
	@SerializedName("url")
	@Expose
	private String url;
	@SerializedName("properties")
	@Expose
	private Properties properties;

	/**
	 * 
	 * @return The driverName
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * 
	 * @param driverName
	 *            The driver-name
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	/**
	 * 
	 * @return The passwordEncrypted
	 */
	public String getPasswordEncrypted() {
		return passwordEncrypted;
	}

	/**
	 * 
	 * @param passwordEncrypted
	 *            The password-encrypted
	 */
	public void setPasswordEncrypted(String passwordEncrypted) {
		this.passwordEncrypted = passwordEncrypted;
	}

	/**
	 * 
	 * @return The url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 
	 * @param url
	 *            The url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 
	 * @return The properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * 
	 * @param properties
	 *            The properties
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
