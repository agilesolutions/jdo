package com.agilesolutions.jboss.model;

import com.google.gson.annotations.Expose;
import com.agilesolutions.jboss.annotations.Attribute;
import com.agilesolutions.jboss.annotations.Type;


public class Logger {
	@Expose(serialize = true)
	private Boolean parent;
	@Expose(serialize = true)
	private String logLevel;
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private Integer id;
	@Expose(serialize = true)
	private Integer version;

	public Boolean getParent() {
		return parent;
	}
	public void setParent(Boolean parent) {
		this.parent = parent;
	}
	@Attribute(order = 2, length = 10, type = Type.INPUT)	
	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
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
	
	
	@Override
	public String toString() {
		return this.name;
	}

	
}
