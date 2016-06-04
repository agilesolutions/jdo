package ch.agilesolutions.jboss.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;

import ch.agilesolutions.jboss.annotations.Attribute;
import ch.agilesolutions.jboss.annotations.Component;
import ch.agilesolutions.jboss.annotations.Root;
import ch.agilesolutions.jboss.annotations.WidgetType;
	
@Root
public class Profile {
	@Expose(serialize = true)
	private Integer id;
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private String hostName;
	@Expose(serialize = true)
	private String releaseTag;
	@Expose(serialize = true)
	private String domain;
	@Expose(serialize = true)
	private List<Logger> loggers = new ArrayList<>();
	@Expose(serialize = true)
	private String prefix;
	@Expose(serialize = true)
	private String jboss;
	@Expose(serialize = true)
	private String jdk;
	@Expose(serialize = true)
	private String description;
	@Expose(serialize = true)
	private Integer buildNumber;
	@Expose(serialize = true)
	private List<SystemProperty> systemProperties = new ArrayList<>();
	@Expose(serialize = true)
	private List<MailSession> mailSessions = new ArrayList<>();
	@Expose(serialize = true)
	private Host host;
	@Expose(serialize = true)
	private List<Object> securityDomains = new ArrayList<>();
	@Expose(serialize = true)
	private CustomCli customCli;
	@Expose(serialize = true)
	private String jiraKey;
	@Expose(serialize = true)
	private List<QueueFactory> queueFactories = new ArrayList<>();
	@Expose(serialize = true)
	private Integer version;
	@Expose(serialize = true)
	private List<Module> modules = new ArrayList<>();
	@Expose(serialize = true)
	private String component;
	@Expose(serialize = true)
	private String environment;
	@Expose(serialize = true)
	private List<Deployment> deployments = new ArrayList<>();
	@Expose(serialize = true)
	private List<AlternateName> alternateNames = new ArrayList<>();
	@Expose(serialize = true)
	private List<Object> extensions = new ArrayList<>();
	@Expose(serialize = true)
	private List<Datasource> datasources = new ArrayList<>();
	@Expose(serialize = true)
	private List<Handler> handlers = new ArrayList<>();
	@Expose(serialize = true)
	private List<Argument> arguments = new ArrayList<>();
	@Expose(serialize = true)
	private Map<String, Integer> socketBindings = new HashMap<>();
	@Expose(serialize = true)
	private List<Driver> drivers = new ArrayList<>();

	@Attribute(order = 1, length = 30, required=true, type = WidgetType.INPUT)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Attribute(order = 5, length = 70, required=true, type = WidgetType.AUTOCOMPLETE)
	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getReleaseTag() {
		return releaseTag;
	}

	public void setReleaseTag(String releaseTag) {
		this.releaseTag = releaseTag;
	}

	@Attribute(order = 3, length = 40, required=true, type = WidgetType.AUTOCOMPLETE)
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Component(order=7)
	public List<Logger> getLoggers() {
		return loggers;
	}

	public void setLoggers(List<Logger> loggers) {
		this.loggers = loggers;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	
	
	@Attribute(order = 8, length = 60, required=true, type = WidgetType.LIST)
	public String getJboss() {
		return jboss;
	}

	public void setJboss(String jboss) {
		this.jboss = jboss;
	}

	@Attribute(order = 7, length = 60, required=true, type = WidgetType.LIST)
	public String getJdk() {
		return jdk;
	}

	public void setJdk(String jdk) {
		this.jdk = jdk;
	}

	@Attribute(order = 2, length = 90, required=true, type = WidgetType.INPUT)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(Integer buildNumber) {
		this.buildNumber = buildNumber;
	}

	@Component(order=1)
	public List<SystemProperty> getSystemProperties() {
		return systemProperties;
	}

	public void setSystemProperties(List<SystemProperty> systemProperties) {
		this.systemProperties = systemProperties;
	}

	public List<MailSession> getMailSessions() {
		return mailSessions;
	}

	public void setMailSessions(List<MailSession> mailSessions) {
		this.mailSessions = mailSessions;
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Object> getSecurityDomains() {
		return securityDomains;
	}

	public void setSecurityDomains(List<Object> securityDomains) {
		this.securityDomains = securityDomains;
	}

	public CustomCli getCustomCli() {
		return customCli;
	}

	public void setCustomCli(CustomCli customCli) {
		this.customCli = customCli;
	}

	@Attribute(order = 6, length = 30, required=true, type = WidgetType.AUTOCOMPLETE)
	public String getJiraKey() {
		return jiraKey;
	}

	public void setJiraKey(String jiraKey) {
		this.jiraKey = jiraKey;
	}

	@Component(order=4)
	public List<QueueFactory> getQueueFactories() {
		return queueFactories;
	}

	public void setQueueFactories(List<QueueFactory> queueFactories) {
		this.queueFactories = queueFactories;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	@Attribute(order = 4, length = 30, required=true, type = WidgetType.LIST)
	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Component(order=5)
	public List<Deployment> getDeployments() {
		return deployments;
	}

	public void setDeployments(List<Deployment> deployments) {
		this.deployments = deployments;
	}

	public List<AlternateName> getAlternateNames() {
		return alternateNames;
	}

	public void setAlternateNames(List<AlternateName> alternateNames) {
		this.alternateNames = alternateNames;
	}

	public List<Object> getExtensions() {
		return extensions;
	}

	public void setExtensions(List<Object> extensions) {
		this.extensions = extensions;
	}

	@Component(order=2)
	public List<Datasource> getDatasources() {
		return datasources;
	}

	public void setDatasources(List<Datasource> datasources) {
		this.datasources = datasources;
	}

	@Component(order=6)
	public List<Handler> getHandlers() {
		return handlers;
	}

	public void setHandlers(List<Handler> handlers) {
		this.handlers = handlers;
	}


	public List<Argument> getArguments() {
		return arguments;
	}

	public void setArguments(List<Argument> arguments) {
		this.arguments = arguments;
	}

	public Map<String, Integer> getSocketBindings() {
		return socketBindings;
	}

	public void setSocketBindings(Map<String, Integer> socketBindings) {
		this.socketBindings = socketBindings;
	}

	@Component(order=3)
	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

}
