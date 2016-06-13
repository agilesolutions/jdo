package ch.agilesolutions.jboss.model;

import com.google.gson.annotations.Expose;

import ch.agilesolutions.jboss.annotations.Attribute;
import ch.agilesolutions.jboss.annotations.WidgetType;

public class SocketBinding {

	@Expose(serialize = true)
	private String portOffset;
	@Expose(serialize = true)
	private String http;
	@Expose(serialize = true)
	private String https;
	@Expose(serialize = true)
	private String ajp;
	@Expose(serialize = true)
	private String remoting;
	@Expose(serialize = true)
	private String managementNative;
	@Expose(serialize = true)
	private String managementHttp;
	@Expose(serialize = true)
	private String managementHttps;

	@Attribute(order = 1, length = 4, required = true, type = WidgetType.INPUT)
	public String getPortOffset() {
		return portOffset;
	}

	@Attribute(order = 2, length = 4, required = true, type = WidgetType.INPUT)
	public String getHttp() {
		return http;
	}

	@Attribute(order = 3, length = 4, required = true, type = WidgetType.INPUT)
	public String getHttps() {
		return https;
	}

	@Attribute(order = 4, length = 4, required = true, type = WidgetType.INPUT)
	public String getAjp() {
		return ajp;
	}

	@Attribute(order = 5, length = 4, required = true, type = WidgetType.INPUT)
	public String getRemoting() {
		return remoting;
	}

	@Attribute(order = 6, length = 4, required = true, type = WidgetType.INPUT)
	public String getManagementHttp() {
		return managementHttp;
	}

	@Attribute(order = 7, length = 4, required = true, type = WidgetType.INPUT)
	public String getManagementHttps() {
		return managementHttps;
	}

	public String getManagementNative() {
		return managementNative;
	}

	public void setPortOffset(String portOffset) {
		this.portOffset = portOffset;
	}

	public void setHttp(String http) {
		this.http = http;
	}

	public void setHttps(String https) {
		this.https = https;
	}

	public void setAjp(String ajp) {
		this.ajp = ajp;
	}

	public void setRemoting(String remoting) {
		this.remoting = remoting;
	}

	public void setManagementNative(String managementNative) {
		this.managementNative = managementNative;
	}

	public void setManagementHttp(String managementHttp) {
		this.managementHttp = managementHttp;
	}

	public void setManagementHttps(String managementHttps) {
		this.managementHttps = managementHttps;
	}

	public String getName() {
		return (String.format("Bindings for offset %s", portOffset));

	}

	public String getDescription() {
		return (String.format("HTTP %s and HTTPS %s", http, https));

	}

	@Override
	public String toString() {
		return String.format("Bindings for offset %s", portOffset);
	}

}
