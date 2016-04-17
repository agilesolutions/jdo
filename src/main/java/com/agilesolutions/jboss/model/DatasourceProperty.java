package com.agilesolutions.jboss.model;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.agilesolutions.jboss.annotations.Attribute;
import com.agilesolutions.jboss.annotations.GUIType;

public class DatasourceProperty implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Expose(serialize = true)
	private String name;

	@Expose(serialize = true)
	private String description;

	@Expose(serialize = true)
	private String value;

	@Attribute(order = 1, length = 30, type = GUIType.INPUT)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Attribute(order = 2, length = 80, type = GUIType.INPUT)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Attribute(order = 3, length = 30, type = GUIType.INPUT)
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
