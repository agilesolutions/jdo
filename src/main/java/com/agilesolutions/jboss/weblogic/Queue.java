package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Queue {

	@SerializedName("sub-deployment-name")
	@Expose
	private String subDeploymentName;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("jndi-name")
	@Expose
	private String jndiName;

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
