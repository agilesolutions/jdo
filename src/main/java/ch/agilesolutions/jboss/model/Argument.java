package ch.agilesolutions.jboss.model;

import com.google.gson.annotations.Expose;


public class Argument {
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private Integer id;
	@Expose(serialize = true)
	private Integer version;
	@Expose(serialize = true)
	private String value;

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
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
