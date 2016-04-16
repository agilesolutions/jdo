package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SecurityParams {

	@SerializedName("attach-jmsx-user-id")
	@Expose
	private Boolean attachJmsxUserId;

	/**
	 * 
	 * @return The attachJmsxUserId
	 */
	public Boolean getAttachJmsxUserId() {
		return attachJmsxUserId;
	}

	/**
	 * 
	 * @param attachJmsxUserId
	 *            The attach-jmsx-user-id
	 */
	public void setAttachJmsxUserId(Boolean attachJmsxUserId) {
		this.attachJmsxUserId = attachJmsxUserId;
	}

}
