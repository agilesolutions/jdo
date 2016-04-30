package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ConnectionFactory {

	@SerializedName("default-targeting-enabled")
	@Expose
	private Boolean defaultTargetingEnabled;
	@SerializedName("sub-deployment-name")
	@Expose
	private String subDeploymentName;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("security-params")
	@Expose
	private SecurityParams securityParams;
	@SerializedName("jndi-name")
	@Expose
	private String jndiName;

	/**
	 * 
	 * @return The defaultTargetingEnabled
	 */
	public Boolean getDefaultTargetingEnabled() {
		return defaultTargetingEnabled;
	}

	/**
	 * 
	 * @param defaultTargetingEnabled
	 *            The default-targeting-enabled
	 */
	public void setDefaultTargetingEnabled(Boolean defaultTargetingEnabled) {
		this.defaultTargetingEnabled = defaultTargetingEnabled;
	}

	/**
	 * 
	 * @return The subDeploymentName
	 */
	public String getSubDeploymentName() {
		return subDeploymentName;
	}

	/**
	 * 
	 * @param subDeploymentName
	 *            The sub-deployment-name
	 */
	public void setSubDeploymentName(String subDeploymentName) {
		this.subDeploymentName = subDeploymentName;
	}

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The securityParams
	 */
	public SecurityParams getSecurityParams() {
		return securityParams;
	}

	/**
	 * 
	 * @param securityParams
	 *            The security-params
	 */
	public void setSecurityParams(SecurityParams securityParams) {
		this.securityParams = securityParams;
	}

	/**
	 * 
	 * @return The jndiName
	 */
	public String getJndiName() {
		return jndiName;
	}

	/**
	 * 
	 * @param jndiName
	 *            The jndi-name
	 */
	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}

}
