package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class JdbcDataSourceParams {

	@SerializedName("global-transactions-protocol")
	@Expose
	private String globalTransactionsProtocol;
	@SerializedName("jndi-name")
	@Expose
	private String jndiName;

	/**
	 * 
	 * @return The globalTransactionsProtocol
	 */
	public String getGlobalTransactionsProtocol() {
		return globalTransactionsProtocol;
	}

	/**
	 * 
	 * @param globalTransactionsProtocol
	 *            The global-transactions-protocol
	 */
	public void setGlobalTransactionsProtocol(String globalTransactionsProtocol) {
		this.globalTransactionsProtocol = globalTransactionsProtocol;
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
