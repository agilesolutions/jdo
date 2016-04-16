package com.agilesolutions.jboss.model;

import com.google.gson.annotations.Expose;
import com.agilesolutions.jboss.annotations.Attribute;
import com.agilesolutions.jboss.annotations.Type;

public class Deployment {
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private String description;
	@Expose(serialize = true)
	private String artifact;
	@Expose(serialize = true)
	private String groupIdentification;
	@Expose(serialize = true)
	private Integer id;
	@Expose(serialize = true)
	private Integer versionnumber;
	@Expose(serialize = true)
	private String type;
	@Expose(serialize = true)
	private String version;

	@Attribute(order = 2, length = 40, type = Type.INPUT)
	public String getArtifact() {
		return artifact;
	}

	public void setArtifact(String artifact) {
		this.artifact = artifact;
	}

	@Attribute(order = 1, length = 80, type = Type.INPUT)
	public String getGroupIdentification() {
		return groupIdentification;
	}

	public void setGroupIdentification(String groupIdentification) {
		this.groupIdentification = groupIdentification;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersionnumber() {
		return versionnumber;
	}

	public void setVersionnumber(Integer versionnumber) {
		this.versionnumber = versionnumber;
	}

	@Attribute(order = 3, length = 4, type = Type.INPUT)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Attribute(order = 4, length = 10, type = Type.INPUT)
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return this.artifact;
	}

	
	
}
