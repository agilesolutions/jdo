package com.agilesolutions.jboss.model;

import com.google.gson.annotations.Expose;


public class AlternateName {
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private Integer id;

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
	
	
}
