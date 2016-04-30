
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Server {

    @SerializedName("custom-trust-key-store-type")
    @Expose
    private String customTrustKeyStoreType;
    @SerializedName("server-start")
    @Expose
    private ServerStart serverStart;
    @SerializedName("listen-address")
    @Expose
    private String listenAddress;
    @SerializedName("classpath-servlet-disabled")
    @Expose
    private Boolean classpathServletDisabled;
    @SerializedName("log")
    @Expose
    private Log log;
    @SerializedName("custom-trust-key-store-file-name")
    @Expose
    private String customTrustKeyStoreFileName;
    @SerializedName("jdbcllr-table-name")
    @Expose
    private String jdbcllrTableName;
    @SerializedName("key-stores")
    @Expose
    private String keyStores;
    @SerializedName("ssl")
    @Expose
    private Ssl ssl;
    @SerializedName("web-server")
    @Expose
    private WebServer webServer;
    @SerializedName("tunneling-enabled")
    @Expose
    private Boolean tunnelingEnabled;
    @SerializedName("default-internal-servlets-disabled")
    @Expose
    private Boolean defaultInternalServletsDisabled;
    @SerializedName("custom-identity-key-store-file-name")
    @Expose
    private String customIdentityKeyStoreFileName;
    @SerializedName("staging-mode")
    @Expose
    private String stagingMode;
    @SerializedName("machine")
    @Expose
    private String machine;
    @SerializedName("xml-registry")
    @Expose
    private String xmlRegistry;
    @SerializedName("custom-identity-key-store-pass-phrase-encrypted")
    @Expose
    private String customIdentityKeyStorePassPhraseEncrypted;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("custom-identity-key-store-type")
    @Expose
    private String customIdentityKeyStoreType;
    @SerializedName("listen-port")
    @Expose
    private Integer listenPort;
    @SerializedName("custom-trust-key-store-pass-phrase-encrypted")
    @Expose
    private String customTrustKeyStorePassPhraseEncrypted;
    @SerializedName("network-access-point")
    @Expose
    private NetworkAccessPoint networkAccessPoint;
    @SerializedName("administration-port")
    @Expose
    private Integer administrationPort;
    @SerializedName("java-compiler")
    @Expose
    private String javaCompiler;
    @SerializedName("listen-port-enabled")
    @Expose
    private Boolean listenPortEnabled;
    @SerializedName("client-cert-proxy-enabled")
    @Expose
    private Boolean clientCertProxyEnabled;

    /**
     * 
     * @return
     *     The customTrustKeyStoreType
     */
    public String getCustomTrustKeyStoreType() {
        return customTrustKeyStoreType;
    }

    /**
     * 
     * @param customTrustKeyStoreType
     *     The custom-trust-key-store-type
     */
    public void setCustomTrustKeyStoreType(String customTrustKeyStoreType) {
        this.customTrustKeyStoreType = customTrustKeyStoreType;
    }

    public Server withCustomTrustKeyStoreType(String customTrustKeyStoreType) {
        this.customTrustKeyStoreType = customTrustKeyStoreType;
        return this;
    }

    /**
     * 
     * @return
     *     The serverStart
     */
    public ServerStart getServerStart() {
        return serverStart;
    }

    /**
     * 
     * @param serverStart
     *     The server-start
     */
    public void setServerStart(ServerStart serverStart) {
        this.serverStart = serverStart;
    }

    public Server withServerStart(ServerStart serverStart) {
        this.serverStart = serverStart;
        return this;
    }

    /**
     * 
     * @return
     *     The listenAddress
     */
    public String getListenAddress() {
        return listenAddress;
    }

    /**
     * 
     * @param listenAddress
     *     The listen-address
     */
    public void setListenAddress(String listenAddress) {
        this.listenAddress = listenAddress;
    }

    public Server withListenAddress(String listenAddress) {
        this.listenAddress = listenAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The classpathServletDisabled
     */
    public Boolean getClasspathServletDisabled() {
        return classpathServletDisabled;
    }

    /**
     * 
     * @param classpathServletDisabled
     *     The classpath-servlet-disabled
     */
    public void setClasspathServletDisabled(Boolean classpathServletDisabled) {
        this.classpathServletDisabled = classpathServletDisabled;
    }

    public Server withClasspathServletDisabled(Boolean classpathServletDisabled) {
        this.classpathServletDisabled = classpathServletDisabled;
        return this;
    }

    /**
     * 
     * @return
     *     The log
     */
    public Log getLog() {
        return log;
    }

    /**
     * 
     * @param log
     *     The log
     */
    public void setLog(Log log) {
        this.log = log;
    }

    public Server withLog(Log log) {
        this.log = log;
        return this;
    }

    /**
     * 
     * @return
     *     The customTrustKeyStoreFileName
     */
    public String getCustomTrustKeyStoreFileName() {
        return customTrustKeyStoreFileName;
    }

    /**
     * 
     * @param customTrustKeyStoreFileName
     *     The custom-trust-key-store-file-name
     */
    public void setCustomTrustKeyStoreFileName(String customTrustKeyStoreFileName) {
        this.customTrustKeyStoreFileName = customTrustKeyStoreFileName;
    }

    public Server withCustomTrustKeyStoreFileName(String customTrustKeyStoreFileName) {
        this.customTrustKeyStoreFileName = customTrustKeyStoreFileName;
        return this;
    }

    /**
     * 
     * @return
     *     The jdbcllrTableName
     */
    public String getJdbcllrTableName() {
        return jdbcllrTableName;
    }

    /**
     * 
     * @param jdbcllrTableName
     *     The jdbcllr-table-name
     */
    public void setJdbcllrTableName(String jdbcllrTableName) {
        this.jdbcllrTableName = jdbcllrTableName;
    }

    public Server withJdbcllrTableName(String jdbcllrTableName) {
        this.jdbcllrTableName = jdbcllrTableName;
        return this;
    }

    /**
     * 
     * @return
     *     The keyStores
     */
    public String getKeyStores() {
        return keyStores;
    }

    /**
     * 
     * @param keyStores
     *     The key-stores
     */
    public void setKeyStores(String keyStores) {
        this.keyStores = keyStores;
    }

    public Server withKeyStores(String keyStores) {
        this.keyStores = keyStores;
        return this;
    }

    /**
     * 
     * @return
     *     The ssl
     */
    public Ssl getSsl() {
        return ssl;
    }

    /**
     * 
     * @param ssl
     *     The ssl
     */
    public void setSsl(Ssl ssl) {
        this.ssl = ssl;
    }

    public Server withSsl(Ssl ssl) {
        this.ssl = ssl;
        return this;
    }

    /**
     * 
     * @return
     *     The webServer
     */
    public WebServer getWebServer() {
        return webServer;
    }

    /**
     * 
     * @param webServer
     *     The web-server
     */
    public void setWebServer(WebServer webServer) {
        this.webServer = webServer;
    }

    public Server withWebServer(WebServer webServer) {
        this.webServer = webServer;
        return this;
    }

    /**
     * 
     * @return
     *     The tunnelingEnabled
     */
    public Boolean getTunnelingEnabled() {
        return tunnelingEnabled;
    }

    /**
     * 
     * @param tunnelingEnabled
     *     The tunneling-enabled
     */
    public void setTunnelingEnabled(Boolean tunnelingEnabled) {
        this.tunnelingEnabled = tunnelingEnabled;
    }

    public Server withTunnelingEnabled(Boolean tunnelingEnabled) {
        this.tunnelingEnabled = tunnelingEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultInternalServletsDisabled
     */
    public Boolean getDefaultInternalServletsDisabled() {
        return defaultInternalServletsDisabled;
    }

    /**
     * 
     * @param defaultInternalServletsDisabled
     *     The default-internal-servlets-disabled
     */
    public void setDefaultInternalServletsDisabled(Boolean defaultInternalServletsDisabled) {
        this.defaultInternalServletsDisabled = defaultInternalServletsDisabled;
    }

    public Server withDefaultInternalServletsDisabled(Boolean defaultInternalServletsDisabled) {
        this.defaultInternalServletsDisabled = defaultInternalServletsDisabled;
        return this;
    }

    /**
     * 
     * @return
     *     The customIdentityKeyStoreFileName
     */
    public String getCustomIdentityKeyStoreFileName() {
        return customIdentityKeyStoreFileName;
    }

    /**
     * 
     * @param customIdentityKeyStoreFileName
     *     The custom-identity-key-store-file-name
     */
    public void setCustomIdentityKeyStoreFileName(String customIdentityKeyStoreFileName) {
        this.customIdentityKeyStoreFileName = customIdentityKeyStoreFileName;
    }

    public Server withCustomIdentityKeyStoreFileName(String customIdentityKeyStoreFileName) {
        this.customIdentityKeyStoreFileName = customIdentityKeyStoreFileName;
        return this;
    }

    /**
     * 
     * @return
     *     The stagingMode
     */
    public String getStagingMode() {
        return stagingMode;
    }

    /**
     * 
     * @param stagingMode
     *     The staging-mode
     */
    public void setStagingMode(String stagingMode) {
        this.stagingMode = stagingMode;
    }

    public Server withStagingMode(String stagingMode) {
        this.stagingMode = stagingMode;
        return this;
    }

    /**
     * 
     * @return
     *     The machine
     */
    public String getMachine() {
        return machine;
    }

    /**
     * 
     * @param machine
     *     The machine
     */
    public void setMachine(String machine) {
        this.machine = machine;
    }

    public Server withMachine(String machine) {
        this.machine = machine;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlRegistry
     */
    public String getXmlRegistry() {
        return xmlRegistry;
    }

    /**
     * 
     * @param xmlRegistry
     *     The xml-registry
     */
    public void setXmlRegistry(String xmlRegistry) {
        this.xmlRegistry = xmlRegistry;
    }

    public Server withXmlRegistry(String xmlRegistry) {
        this.xmlRegistry = xmlRegistry;
        return this;
    }

    /**
     * 
     * @return
     *     The customIdentityKeyStorePassPhraseEncrypted
     */
    public String getCustomIdentityKeyStorePassPhraseEncrypted() {
        return customIdentityKeyStorePassPhraseEncrypted;
    }

    /**
     * 
     * @param customIdentityKeyStorePassPhraseEncrypted
     *     The custom-identity-key-store-pass-phrase-encrypted
     */
    public void setCustomIdentityKeyStorePassPhraseEncrypted(String customIdentityKeyStorePassPhraseEncrypted) {
        this.customIdentityKeyStorePassPhraseEncrypted = customIdentityKeyStorePassPhraseEncrypted;
    }

    public Server withCustomIdentityKeyStorePassPhraseEncrypted(String customIdentityKeyStorePassPhraseEncrypted) {
        this.customIdentityKeyStorePassPhraseEncrypted = customIdentityKeyStorePassPhraseEncrypted;
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

    public Server withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The customIdentityKeyStoreType
     */
    public String getCustomIdentityKeyStoreType() {
        return customIdentityKeyStoreType;
    }

    /**
     * 
     * @param customIdentityKeyStoreType
     *     The custom-identity-key-store-type
     */
    public void setCustomIdentityKeyStoreType(String customIdentityKeyStoreType) {
        this.customIdentityKeyStoreType = customIdentityKeyStoreType;
    }

    public Server withCustomIdentityKeyStoreType(String customIdentityKeyStoreType) {
        this.customIdentityKeyStoreType = customIdentityKeyStoreType;
        return this;
    }

    /**
     * 
     * @return
     *     The listenPort
     */
    public Integer getListenPort() {
        return listenPort;
    }

    /**
     * 
     * @param listenPort
     *     The listen-port
     */
    public void setListenPort(Integer listenPort) {
        this.listenPort = listenPort;
    }

    public Server withListenPort(Integer listenPort) {
        this.listenPort = listenPort;
        return this;
    }

    /**
     * 
     * @return
     *     The customTrustKeyStorePassPhraseEncrypted
     */
    public String getCustomTrustKeyStorePassPhraseEncrypted() {
        return customTrustKeyStorePassPhraseEncrypted;
    }

    /**
     * 
     * @param customTrustKeyStorePassPhraseEncrypted
     *     The custom-trust-key-store-pass-phrase-encrypted
     */
    public void setCustomTrustKeyStorePassPhraseEncrypted(String customTrustKeyStorePassPhraseEncrypted) {
        this.customTrustKeyStorePassPhraseEncrypted = customTrustKeyStorePassPhraseEncrypted;
    }

    public Server withCustomTrustKeyStorePassPhraseEncrypted(String customTrustKeyStorePassPhraseEncrypted) {
        this.customTrustKeyStorePassPhraseEncrypted = customTrustKeyStorePassPhraseEncrypted;
        return this;
    }

    /**
     * 
     * @return
     *     The networkAccessPoint
     */
    public NetworkAccessPoint getNetworkAccessPoint() {
        return networkAccessPoint;
    }

    /**
     * 
     * @param networkAccessPoint
     *     The network-access-point
     */
    public void setNetworkAccessPoint(NetworkAccessPoint networkAccessPoint) {
        this.networkAccessPoint = networkAccessPoint;
    }

    public Server withNetworkAccessPoint(NetworkAccessPoint networkAccessPoint) {
        this.networkAccessPoint = networkAccessPoint;
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

    public Server withAdministrationPort(Integer administrationPort) {
        this.administrationPort = administrationPort;
        return this;
    }

    /**
     * 
     * @return
     *     The javaCompiler
     */
    public String getJavaCompiler() {
        return javaCompiler;
    }

    /**
     * 
     * @param javaCompiler
     *     The java-compiler
     */
    public void setJavaCompiler(String javaCompiler) {
        this.javaCompiler = javaCompiler;
    }

    public Server withJavaCompiler(String javaCompiler) {
        this.javaCompiler = javaCompiler;
        return this;
    }

    /**
     * 
     * @return
     *     The listenPortEnabled
     */
    public Boolean getListenPortEnabled() {
        return listenPortEnabled;
    }

    /**
     * 
     * @param listenPortEnabled
     *     The listen-port-enabled
     */
    public void setListenPortEnabled(Boolean listenPortEnabled) {
        this.listenPortEnabled = listenPortEnabled;
    }

    public Server withListenPortEnabled(Boolean listenPortEnabled) {
        this.listenPortEnabled = listenPortEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The clientCertProxyEnabled
     */
    public Boolean getClientCertProxyEnabled() {
        return clientCertProxyEnabled;
    }

    /**
     * 
     * @param clientCertProxyEnabled
     *     The client-cert-proxy-enabled
     */
    public void setClientCertProxyEnabled(Boolean clientCertProxyEnabled) {
        this.clientCertProxyEnabled = clientCertProxyEnabled;
    }

    public Server withClientCertProxyEnabled(Boolean clientCertProxyEnabled) {
        this.clientCertProxyEnabled = clientCertProxyEnabled;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customTrustKeyStoreType).append(serverStart).append(listenAddress).append(classpathServletDisabled).append(log).append(customTrustKeyStoreFileName).append(jdbcllrTableName).append(keyStores).append(ssl).append(webServer).append(tunnelingEnabled).append(defaultInternalServletsDisabled).append(customIdentityKeyStoreFileName).append(stagingMode).append(machine).append(xmlRegistry).append(customIdentityKeyStorePassPhraseEncrypted).append(name).append(customIdentityKeyStoreType).append(listenPort).append(customTrustKeyStorePassPhraseEncrypted).append(networkAccessPoint).append(administrationPort).append(javaCompiler).append(listenPortEnabled).append(clientCertProxyEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Server) == false) {
            return false;
        }
        Server rhs = ((Server) other);
        return new EqualsBuilder().append(customTrustKeyStoreType, rhs.customTrustKeyStoreType).append(serverStart, rhs.serverStart).append(listenAddress, rhs.listenAddress).append(classpathServletDisabled, rhs.classpathServletDisabled).append(log, rhs.log).append(customTrustKeyStoreFileName, rhs.customTrustKeyStoreFileName).append(jdbcllrTableName, rhs.jdbcllrTableName).append(keyStores, rhs.keyStores).append(ssl, rhs.ssl).append(webServer, rhs.webServer).append(tunnelingEnabled, rhs.tunnelingEnabled).append(defaultInternalServletsDisabled, rhs.defaultInternalServletsDisabled).append(customIdentityKeyStoreFileName, rhs.customIdentityKeyStoreFileName).append(stagingMode, rhs.stagingMode).append(machine, rhs.machine).append(xmlRegistry, rhs.xmlRegistry).append(customIdentityKeyStorePassPhraseEncrypted, rhs.customIdentityKeyStorePassPhraseEncrypted).append(name, rhs.name).append(customIdentityKeyStoreType, rhs.customIdentityKeyStoreType).append(listenPort, rhs.listenPort).append(customTrustKeyStorePassPhraseEncrypted, rhs.customTrustKeyStorePassPhraseEncrypted).append(networkAccessPoint, rhs.networkAccessPoint).append(administrationPort, rhs.administrationPort).append(javaCompiler, rhs.javaCompiler).append(listenPortEnabled, rhs.listenPortEnabled).append(clientCertProxyEnabled, rhs.clientCertProxyEnabled).isEquals();
    }

}
