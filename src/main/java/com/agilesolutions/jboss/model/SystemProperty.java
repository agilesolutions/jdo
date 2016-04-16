package com.agilesolutions.jboss.model;

import com.google.gson.annotations.Expose;
import com.agilesolutions.jboss.annotations.Attribute;
import com.agilesolutions.jboss.annotations.Type;


public class SystemProperty {
	@Expose(serialize = true)
	private Integer id;
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private String description;
	@Expose(serialize = true)
	private Integer version;
	@Expose(serialize = true)
	private String value;

	@Attribute(order = 1, length = 30, type = Type.INPUT)	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Attribute(order = 2, length = 60, type = Type.INPUT)	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.name;
	}


}
