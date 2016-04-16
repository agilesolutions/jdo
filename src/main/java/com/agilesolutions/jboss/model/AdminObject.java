package com.agilesolutions.jboss.model;

import com.agilesolutions.jboss.annotations.Attribute;
import com.agilesolutions.jboss.annotations.Type;
import com.google.gson.annotations.Expose;


public class AdminObject {
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private String className;
	@Expose(serialize = true)
	private Boolean mdb;
	@Expose(serialize = true)
	private Integer id;
	@Expose(serialize = true)
	private String configProperty;
	@Expose(serialize = true)
	private String jndiName;
	@Expose(serialize = true)
	private String description;

	@Attribute(order = 1, length = 20, type = Type.INPUT)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Attribute(order = 2, length = 60, type = Type.INPUT)
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Boolean getMdb() {
		return mdb;
	}
	public void setMdb(Boolean mdb) {
		this.mdb = mdb;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Attribute(order = 3, length = 80, type = Type.INPUT)
	public String getConfigProperty() {
		return configProperty;
	}
	public void setConfigProperty(String configProperty) {
		this.configProperty = configProperty;
	}
	@Attribute(order = 4, length = 60, type = Type.INPUT)
	public String getJndiName() {
		return jndiName;
	}
	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
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
