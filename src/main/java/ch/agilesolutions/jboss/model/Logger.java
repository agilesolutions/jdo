package ch.agilesolutions.jboss.model;

import com.google.gson.annotations.Expose;
import ch.agilesolutions.jboss.annotations.Attribute;
import ch.agilesolutions.jboss.annotations.WidgetType;

public class Logger {
	@Expose(serialize = true)
	private Boolean parent;
	@Expose(serialize = true)
	private String logLevel;
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private String handler;
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

	@Attribute(order = 2, length = 10, required = true, type = WidgetType.INPUT)
	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	@Attribute(order = 1, length = 30, required = true, type = WidgetType.INPUT)
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

	@Attribute(order = 3, length = 25, required = true, type = WidgetType.LIST)
	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;

	}

	public String getDescription() {
		return String.format("%s mapped to handler %s", name, handler);
	}

	@Override
	public String toString() {
		return this.name;
	}

}
