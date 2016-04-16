
package com.agilesolutions.jboss.weblogic;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Domain {

    @SerializedName("domain-version")
    @Expose
    private String domainVersion;
    @SerializedName("server")
    @Expose
    private List<Server> server = new ArrayList<Server>();
    @SerializedName("log")
    @Expose
    private Log_ log;
    @SerializedName("xmlns:sec")
    @Expose
    private String xmlnsSec;
    @SerializedName("xmlns:xsi")
    @Expose
    private String xmlnsXsi;
    @SerializedName("configuration-version")
    @Expose
    private String configurationVersion;
    @SerializedName("jms-server")
    @Expose
    private List<JmsServer> jmsServer = new ArrayList<JmsServer>();
    @SerializedName("xmlns")
    @Expose
    private String xmlns;
    @SerializedName("production-mode-enabled")
    @Expose
    private Boolean productionModeEnabled;
    @SerializedName("app-deployment")
    @Expose
    private List<AppDeployment> appDeployment = new ArrayList<AppDeployment>();
    @SerializedName("jmx")
    @Expose
    private Jmx jmx;
    @SerializedName("jta")
    @Expose
    private Jta jta;
    @SerializedName("xmlns:wls")
    @Expose
    private String xmlnsWls;
    @SerializedName("administration-port")
    @Expose
    private Integer administrationPort;
    @SerializedName("admin-server-name")
    @Expose
    private String adminServerName;
    @SerializedName("jms-system-resource")
    @Expose
    private List<JmsSystemResource> jmsSystemResource = new ArrayList<JmsSystemResource>();
    @SerializedName("xsi:schemaLocation")
    @Expose
    private String xsiSchemaLocation;
    @SerializedName("administration-port-enabled")
    @Expose
    private Boolean administrationPortEnabled;
    @SerializedName("security-configuration")
    @Expose
    private SecurityConfiguration securityConfiguration;
    @SerializedName("jdbc-system-resource")
    @Expose
    private List<JdbcSystemResource> jdbcSystemResource = new ArrayList<JdbcSystemResource>();
    @SerializedName("file-store")
    @Expose
    private List<FileStore> fileStore = new ArrayList<FileStore>();
    @SerializedName("config-backup-enabled")
    @Expose
    private Boolean configBackupEnabled;
    @SerializedName("machine")
    @Expose
    private List<Machine> machine = new ArrayList<Machine>();
    @SerializedName("xml-registry")
    @Expose
    private XmlRegistry xmlRegistry;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("embedded-ldap")
    @Expose
    private EmbeddedLdap embeddedLdap;
    @SerializedName("archive-configuration-count")
    @Expose
    private Integer archiveConfigurationCount;

    /**
     * 
     * @return
     *     The domainVersion
     */
    public String getDomainVersion() {
        return domainVersion;
    }

    /**
     * 
     * @param domainVersion
     *     The domain-version
     */
    public void setDomainVersion(String domainVersion) {
        this.domainVersion = domainVersion;
    }

    public Domain withDomainVersion(String domainVersion) {
        this.domainVersion = domainVersion;
        return this;
    }

    /**
     * 
     * @return
     *     The server
     */
    public List<Server> getServer() {
        return server;
    }

    /**
     * 
     * @param server
     *     The server
     */
    public void setServer(List<Server> server) {
        this.server = server;
    }

    public Domain withServer(List<Server> server) {
        this.server = server;
        return this;
    }

    /**
     * 
     * @return
     *     The log
     */
    public Log_ getLog() {
        return log;
    }

    /**
     * 
     * @param log
     *     The log
     */
    public void setLog(Log_ log) {
        this.log = log;
    }

    public Domain withLog(Log_ log) {
        this.log = log;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlnsSec
     */
    public String getXmlnsSec() {
        return xmlnsSec;
    }

    /**
     * 
     * @param xmlnsSec
     *     The xmlns:sec
     */
    public void setXmlnsSec(String xmlnsSec) {
        this.xmlnsSec = xmlnsSec;
    }

    public Domain withXmlnsSec(String xmlnsSec) {
        this.xmlnsSec = xmlnsSec;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlnsXsi
     */
    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    /**
     * 
     * @param xmlnsXsi
     *     The xmlns:xsi
     */
    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    public Domain withXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
        return this;
    }

    /**
     * 
     * @return
     *     The configurationVersion
     */
    public String getConfigurationVersion() {
        return configurationVersion;
    }

    /**
     * 
     * @param configurationVersion
     *     The configuration-version
     */
    public void setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    public Domain withConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }

    /**
     * 
     * @return
     *     The jmsServer
     */
    public List<JmsServer> getJmsServer() {
        return jmsServer;
    }

    /**
     * 
     * @param jmsServer
     *     The jms-server
     */
    public void setJmsServer(List<JmsServer> jmsServer) {
        this.jmsServer = jmsServer;
    }

    public Domain withJmsServer(List<JmsServer> jmsServer) {
        this.jmsServer = jmsServer;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlns
     */
    public String getXmlns() {
        return xmlns;
    }

    /**
     * 
     * @param xmlns
     *     The xmlns
     */
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public Domain withXmlns(String xmlns) {
        this.xmlns = xmlns;
        return this;
    }

    /**
     * 
     * @return
     *     The productionModeEnabled
     */
    public Boolean getProductionModeEnabled() {
        return productionModeEnabled;
    }

    /**
     * 
     * @param productionModeEnabled
     *     The production-mode-enabled
     */
    public void setProductionModeEnabled(Boolean productionModeEnabled) {
        this.productionModeEnabled = productionModeEnabled;
    }

    public Domain withProductionModeEnabled(Boolean productionModeEnabled) {
        this.productionModeEnabled = productionModeEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The appDeployment
     */
    public List<AppDeployment> getAppDeployment() {
        return appDeployment;
    }

    /**
     * 
     * @param appDeployment
     *     The app-deployment
     */
    public void setAppDeployment(List<AppDeployment> appDeployment) {
        this.appDeployment = appDeployment;
    }

    public Domain withAppDeployment(List<AppDeployment> appDeployment) {
        this.appDeployment = appDeployment;
        return this;
    }

    /**
     * 
     * @return
     *     The jmx
     */
    public Jmx getJmx() {
        return jmx;
    }

    /**
     * 
     * @param jmx
     *     The jmx
     */
    public void setJmx(Jmx jmx) {
        this.jmx = jmx;
    }

    public Domain withJmx(Jmx jmx) {
        this.jmx = jmx;
        return this;
    }

    /**
     * 
     * @return
     *     The jta
     */
    public Jta getJta() {
        return jta;
    }

    /**
     * 
     * @param jta
     *     The jta
     */
    public void setJta(Jta jta) {
        this.jta = jta;
    }

    public Domain withJta(Jta jta) {
        this.jta = jta;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlnsWls
     */
    public String getXmlnsWls() {
        return xmlnsWls;
    }

    /**
     * 
     * @param xmlnsWls
     *     The xmlns:wls
     */
    public void setXmlnsWls(String xmlnsWls) {
        this.xmlnsWls = xmlnsWls;
    }

    public Domain withXmlnsWls(String xmlnsWls) {
        this.xmlnsWls = xmlnsWls;
        return this;
    }

    /**
     * 
     * @return
     *     The administrationPort
     */
    public Integer getAdministrationPort() {
        return administrationPort;
    }

    /**
     * 
     * @param administrationPort
     *     The administration-port
     */
    public void setAdministrationPort(Integer administrationPort) {
        this.administrationPort = administrationPort;
    }

    public Domain withAdministrationPort(Integer administrationPort) {
        this.administrationPort = administrationPort;
        return this;
    }

    /**
     * 
     * @return
     *     The adminServerName
     */
    public String getAdminServerName() {
        return adminServerName;
    }

    /**
     * 
     * @param adminServerName
     *     The admin-server-name
     */
    public void setAdminServerName(String adminServerName) {
        this.adminServerName = adminServerName;
    }

    public Domain withAdminServerName(String adminServerName) {
        this.adminServerName = adminServerName;
        return this;
    }

    /**
     * 
     * @return
     *     The jmsSystemResource
     */
    public List<JmsSystemResource> getJmsSystemResource() {
        return jmsSystemResource;
    }

    /**
     * 
     * @param jmsSystemResource
     *     The jms-system-resource
     */
    public void setJmsSystemResource(List<JmsSystemResource> jmsSystemResource) {
        this.jmsSystemResource = jmsSystemResource;
    }

    public Domain withJmsSystemResource(List<JmsSystemResource> jmsSystemResource) {
        this.jmsSystemResource = jmsSystemResource;
        return this;
    }

    /**
     * 
     * @return
     *     The xsiSchemaLocation
     */
    public String getXsiSchemaLocation() {
        return xsiSchemaLocation;
    }

    /**
     * 
     * @param xsiSchemaLocation
     *     The xsi:schemaLocation
     */
    public void setXsiSchemaLocation(String xsiSchemaLocation) {
        this.xsiSchemaLocation = xsiSchemaLocation;
    }

    public Domain withXsiSchemaLocation(String xsiSchemaLocation) {
        this.xsiSchemaLocation = xsiSchemaLocation;
        return this;
    }

    /**
     * 
     * @return
     *     The administrationPortEnabled
     */
    public Boolean getAdministrationPortEnabled() {
        return administrationPortEnabled;
    }

    /**
     * 
     * @param administrationPortEnabled
     *     The administration-port-enabled
     */
    public void setAdministrationPortEnabled(Boolean administrationPortEnabled) {
        this.administrationPortEnabled = administrationPortEnabled;
    }

    public Domain withAdministrationPortEnabled(Boolean administrationPortEnabled) {
        this.administrationPortEnabled = administrationPortEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The securityConfiguration
     */
    public SecurityConfiguration getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * 
     * @param securityConfiguration
     *     The security-configuration
     */
    public void setSecurityConfiguration(SecurityConfiguration securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    public Domain withSecurityConfiguration(SecurityConfiguration securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * 
     * @return
     *     The jdbcSystemResource
     */
    public List<JdbcSystemResource> getJdbcSystemResource() {
        return jdbcSystemResource;
    }

    /**
     * 
     * @param jdbcSystemResource
     *     The jdbc-system-resource
     */
    public void setJdbcSystemResource(List<JdbcSystemResource> jdbcSystemResource) {
        this.jdbcSystemResource = jdbcSystemResource;
    }

    public Domain withJdbcSystemResource(List<JdbcSystemResource> jdbcSystemResource) {
        this.jdbcSystemResource = jdbcSystemResource;
        return this;
    }

    /**
     * 
     * @return
     *     The fileStore
     */
    public List<FileStore> getFileStore() {
        return fileStore;
    }

    /**
     * 
     * @param fileStore
     *     The file-store
     */
    public void setFileStore(List<FileStore> fileStore) {
        this.fileStore = fileStore;
    }

    public Domain withFileStore(List<FileStore> fileStore) {
        this.fileStore = fileStore;
        return this;
    }

    /**
     * 
     * @return
     *     The configBackupEnabled
     */
    public Boolean getConfigBackupEnabled() {
        return configBackupEnabled;
    }

    /**
     * 
     * @param configBackupEnabled
     *     The config-backup-enabled
     */
    public void setConfigBackupEnabled(Boolean configBackupEnabled) {
        this.configBackupEnabled = configBackupEnabled;
    }

    public Domain withConfigBackupEnabled(Boolean configBackupEnabled) {
        this.configBackupEnabled = configBackupEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The machine
     */
    public List<Machine> getMachine() {
        return machine;
    }

    /**
     * 
     * @param machine
     *     The machine
     */
    public void setMachine(List<Machine> machine) {
        this.machine = machine;
    }

    public Domain withMachine(List<Machine> machine) {
        this.machine = machine;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlRegistry
     */
    public XmlRegistry getXmlRegistry() {
        return xmlRegistry;
    }

    /**
     * 
     * @param xmlRegistry
     *     The xml-registry
     */
    public void setXmlRegistry(XmlRegistry xmlRegistry) {
        this.xmlRegistry = xmlRegistry;
    }

    public Domain withXmlRegistry(XmlRegistry xmlRegistry) {
        this.xmlRegistry = xmlRegistry;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Domain withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The embeddedLdap
     */
    public EmbeddedLdap getEmbeddedLdap() {
        return embeddedLdap;
    }

    /**
     * 
     * @param embeddedLdap
     *     The embedded-ldap
     */
    public void setEmbeddedLdap(EmbeddedLdap embeddedLdap) {
        this.embeddedLdap = embeddedLdap;
    }

    public Domain withEmbeddedLdap(EmbeddedLdap embeddedLdap) {
        this.embeddedLdap = embeddedLdap;
        return this;
    }

    /**
     * 
     * @return
     *     The archiveConfigurationCount
     */
    public Integer getArchiveConfigurationCount() {
        return archiveConfigurationCount;
    }

    /**
     * 
     * @param archiveConfigurationCount
     *     The archive-configuration-count
     */
    public void setArchiveConfigurationCount(Integer archiveConfigurationCount) {
        this.archiveConfigurationCount = archiveConfigurationCount;
    }

    public Domain withArchiveConfigurationCount(Integer archiveConfigurationCount) {
        this.archiveConfigurationCount = archiveConfigurationCount;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(domainVersion).append(server).append(log).append(xmlnsSec).append(xmlnsXsi).append(configurationVersion).append(jmsServer).append(xmlns).append(productionModeEnabled).append(appDeployment).append(jmx).append(jta).append(xmlnsWls).append(administrationPort).append(adminServerName).append(jmsSystemResource).append(xsiSchemaLocation).append(administrationPortEnabled).append(securityConfiguration).append(jdbcSystemResource).append(fileStore).append(configBackupEnabled).append(machine).append(xmlRegistry).append(name).append(embeddedLdap).append(archiveConfigurationCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Domain) == false) {
            return false;
        }
        Domain rhs = ((Domain) other);
        return new EqualsBuilder().append(domainVersion, rhs.domainVersion).append(server, rhs.server).append(log, rhs.log).append(xmlnsSec, rhs.xmlnsSec).append(xmlnsXsi, rhs.xmlnsXsi).append(configurationVersion, rhs.configurationVersion).append(jmsServer, rhs.jmsServer).append(xmlns, rhs.xmlns).append(productionModeEnabled, rhs.productionModeEnabled).append(appDeployment, rhs.appDeployment).append(jmx, rhs.jmx).append(jta, rhs.jta).append(xmlnsWls, rhs.xmlnsWls).append(administrationPort, rhs.administrationPort).append(adminServerName, rhs.adminServerName).append(jmsSystemResource, rhs.jmsSystemResource).append(xsiSchemaLocation, rhs.xsiSchemaLocation).append(administrationPortEnabled, rhs.administrationPortEnabled).append(securityConfiguration, rhs.securityConfiguration).append(jdbcSystemResource, rhs.jdbcSystemResource).append(fileStore, rhs.fileStore).append(configBackupEnabled, rhs.configBackupEnabled).append(machine, rhs.machine).append(xmlRegistry, rhs.xmlRegistry).append(name, rhs.name).append(embeddedLdap, rhs.embeddedLdap).append(archiveConfigurationCount, rhs.archiveConfigurationCount).isEquals();
    }

}
