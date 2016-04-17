package com.agilesolutions.jboss.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.agilesolutions.jboss.annotations.Attribute;
import com.agilesolutions.jboss.annotations.GUIType;

public class Handler {
	@Expose(serialize = true)
	private Integer id;
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private String description;
	@Expose(serialize = true)
	private String formatter;
	@Expose(serialize = true)
	private String path;
	@Expose(serialize = true)
	private String logLevel;
	@Expose(serialize = true)
	private List<Logger> loggers = new ArrayList<>();
	@Expose(serialize = true)
	private String type;
	@Expose(serialize = true)
	private String suffix;
	@Expose(serialize = true)
	private Integer version;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Attribute(order = 1, length = 30, type = GUIType.INPUT)	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Attribute(order = 2, length = 60, type = GUIType.INPUT)	
	public String getFormatter() {
		return formatter;
	}
	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
	public List<Logger> getLoggers() {
		return loggers;
	}
	public void setLoggers(List<Logger> loggers) {
		this.loggers = loggers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
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
	@Override
	public String toString() {
		return this.name;
	}

}


