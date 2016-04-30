
package ch.agilesolutions.jboss.platform.jboss;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Subsystem {

    @SerializedName("xmlns")
    @Expose
    private String xmlns;
    @SerializedName("periodic-rotating-file-handler")
    @Expose
    private List<PeriodicRotatingFileHandler> periodicRotatingFileHandler = new ArrayList<PeriodicRotatingFileHandler>();
    @SerializedName("console-handler")
    @Expose
    private ConsoleHandler consoleHandler;
    @SerializedName("logger")
    @Expose
    private List<Logger> logger = new ArrayList<Logger>();
    @SerializedName("root-logger")
    @Expose
    private RootLogger rootLogger;
    @SerializedName("datasources")
    @Expose
    private Datasources datasources;
    @SerializedName("deployment-scanner")
    @Expose
    private DeploymentScanner deploymentScanner;
    @SerializedName("jboss-descriptor-property-replacement")
    @Expose
    private Boolean jbossDescriptorPropertyReplacement;
    @SerializedName("spec-descriptor-property-replacement")
    @Expose
    private Boolean specDescriptorPropertyReplacement;
    @SerializedName("global-modules")
    @Expose
    private GlobalModules globalModules;
    @SerializedName("async")
    @Expose
    private Async async;
    @SerializedName("thread-pools")
    @Expose
    private ThreadPools threadPools;
    @SerializedName("caches")
    @Expose
    private Caches caches;
    @SerializedName("default-missing-method-permissions-deny-access")
    @Expose
    private DefaultMissingMethodPermissionsDenyAccess defaultMissingMethodPermissionsDenyAccess;
    @SerializedName("passivation-stores")
    @Expose
    private PassivationStores passivationStores;
    @SerializedName("session-bean")
    @Expose
    private SessionBean sessionBean;
    @SerializedName("pools")
    @Expose
    private Pools pools;
    @SerializedName("mdb")
    @Expose
    private Mdb mdb;
    @SerializedName("timer-service")
    @Expose
    private TimerService timerService;
    @SerializedName("default-security-domain")
    @Expose
    private DefaultSecurityDomain defaultSecurityDomain;
    @SerializedName("remote")
    @Expose
    private Remote remote;
    @SerializedName("cache-container")
    @Expose
    private List<CacheContainer> cacheContainer = new ArrayList<CacheContainer>();
    @SerializedName("archive-validation")
    @Expose
    private ArchiveValidation archiveValidation;
    @SerializedName("bean-validation")
    @Expose
    private BeanValidation beanValidation;
    @SerializedName("default-workmanager")
    @Expose
    private DefaultWorkmanager defaultWorkmanager;
    @SerializedName("cached-connection-manager")
    @Expose
    private String cachedConnectionManager;
    @SerializedName("remoting-connector")
    @Expose
    private String remotingConnector;
    @SerializedName("expose-resolved-model")
    @Expose
    private String exposeResolvedModel;
    @SerializedName("expose-expression-model")
    @Expose
    private String exposeExpressionModel;
    @SerializedName("jpa")
    @Expose
    private Jpa jpa;
    @SerializedName("mail-session")
    @Expose
    private MailSession mailSession;
    @SerializedName("remote-naming")
    @Expose
    private String remoteNaming;
    @SerializedName("connector")
    @Expose
    private Connector connector;
    @SerializedName("resource-adapters")
    @Expose
    private ResourceAdapters resourceAdapters;
    @SerializedName("security-domains")
    @Expose
    private SecurityDomains securityDomains;
    @SerializedName("core-environment")
    @Expose
    private CoreEnvironment coreEnvironment;
    @SerializedName("coordinator-environment")
    @Expose
    private CoordinatorEnvironment coordinatorEnvironment;
    @SerializedName("recovery-environment")
    @Expose
    private RecoveryEnvironment recoveryEnvironment;
    @SerializedName("native")
    @Expose
    private Boolean _native;
    @SerializedName("virtual-server")
    @Expose
    private VirtualServer virtualServer;
    @SerializedName("default-virtual-server")
    @Expose
    private String defaultVirtualServer;

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

    public Subsystem withXmlns(String xmlns) {
        this.xmlns = xmlns;
        return this;
    }

    /**
     * 
     * @return
     *     The periodicRotatingFileHandler
     */
    public List<PeriodicRotatingFileHandler> getPeriodicRotatingFileHandler() {
        return periodicRotatingFileHandler;
    }

    /**
     * 
     * @param periodicRotatingFileHandler
     *     The periodic-rotating-file-handler
     */
    public void setPeriodicRotatingFileHandler(List<PeriodicRotatingFileHandler> periodicRotatingFileHandler) {
        this.periodicRotatingFileHandler = periodicRotatingFileHandler;
    }

    public Subsystem withPeriodicRotatingFileHandler(List<PeriodicRotatingFileHandler> periodicRotatingFileHandler) {
        this.periodicRotatingFileHandler = periodicRotatingFileHandler;
        return this;
    }

    /**
     * 
     * @return
     *     The consoleHandler
     */
    public ConsoleHandler getConsoleHandler() {
        return consoleHandler;
    }

    /**
     * 
     * @param consoleHandler
     *     The console-handler
     */
    public void setConsoleHandler(ConsoleHandler consoleHandler) {
        this.consoleHandler = consoleHandler;
    }

    public Subsystem withConsoleHandler(ConsoleHandler consoleHandler) {
        this.consoleHandler = consoleHandler;
        return this;
    }

    /**
     * 
     * @return
     *     The logger
     */
    public List<Logger> getLogger() {
        return logger;
    }

    /**
     * 
     * @param logger
     *     The logger
     */
    public void setLogger(List<Logger> logger) {
        this.logger = logger;
    }

    public Subsystem withLogger(List<Logger> logger) {
        this.logger = logger;
        return this;
    }

    /**
     * 
     * @return
     *     The rootLogger
     */
    public RootLogger getRootLogger() {
        return rootLogger;
    }

    /**
     * 
     * @param rootLogger
     *     The root-logger
     */
    public void setRootLogger(RootLogger rootLogger) {
        this.rootLogger = rootLogger;
    }

    public Subsystem withRootLogger(RootLogger rootLogger) {
        this.rootLogger = rootLogger;
        return this;
    }

    /**
     * 
     * @return
     *     The datasources
     */
    public Datasources getDatasources() {
        return datasources;
    }

    /**
     * 
     * @param datasources
     *     The datasources
     */
    public void setDatasources(Datasources datasources) {
        this.datasources = datasources;
    }

    public Subsystem withDatasources(Datasources datasources) {
        this.datasources = datasources;
        return this;
    }

    /**
     * 
     * @return
     *     The deploymentScanner
     */
    public DeploymentScanner getDeploymentScanner() {
        return deploymentScanner;
    }

    /**
     * 
     * @param deploymentScanner
     *     The deployment-scanner
     */
    public void setDeploymentScanner(DeploymentScanner deploymentScanner) {
        this.deploymentScanner = deploymentScanner;
    }

    public Subsystem withDeploymentScanner(DeploymentScanner deploymentScanner) {
        this.deploymentScanner = deploymentScanner;
        return this;
    }

    /**
     * 
     * @return
     *     The jbossDescriptorPropertyReplacement
     */
    public Boolean getJbossDescriptorPropertyReplacement() {
        return jbossDescriptorPropertyReplacement;
    }

    /**
     * 
     * @param jbossDescriptorPropertyReplacement
     *     The jboss-descriptor-property-replacement
     */
    public void setJbossDescriptorPropertyReplacement(Boolean jbossDescriptorPropertyReplacement) {
        this.jbossDescriptorPropertyReplacement = jbossDescriptorPropertyReplacement;
    }

    public Subsystem withJbossDescriptorPropertyReplacement(Boolean jbossDescriptorPropertyReplacement) {
        this.jbossDescriptorPropertyReplacement = jbossDescriptorPropertyReplacement;
        return this;
    }

    /**
     * 
     * @return
     *     The specDescriptorPropertyReplacement
     */
    public Boolean getSpecDescriptorPropertyReplacement() {
        return specDescriptorPropertyReplacement;
    }

    /**
     * 
     * @param specDescriptorPropertyReplacement
     *     The spec-descriptor-property-replacement
     */
    public void setSpecDescriptorPropertyReplacement(Boolean specDescriptorPropertyReplacement) {
        this.specDescriptorPropertyReplacement = specDescriptorPropertyReplacement;
    }

    public Subsystem withSpecDescriptorPropertyReplacement(Boolean specDescriptorPropertyReplacement) {
        this.specDescriptorPropertyReplacement = specDescriptorPropertyReplacement;
        return this;
    }

    /**
     * 
     * @return
     *     The globalModules
     */
    public GlobalModules getGlobalModules() {
        return globalModules;
    }

    /**
     * 
     * @param globalModules
     *     The global-modules
     */
    public void setGlobalModules(GlobalModules globalModules) {
        this.globalModules = globalModules;
    }

    public Subsystem withGlobalModules(GlobalModules globalModules) {
        this.globalModules = globalModules;
        return this;
    }

    /**
     * 
     * @return
     *     The async
     */
    public Async getAsync() {
        return async;
    }

    /**
     * 
     * @param async
     *     The async
     */
    public void setAsync(Async async) {
        this.async = async;
    }

    public Subsystem withAsync(Async async) {
        this.async = async;
        return this;
    }

    /**
     * 
     * @return
     *     The threadPools
     */
    public ThreadPools getThreadPools() {
        return threadPools;
    }

    /**
     * 
     * @param threadPools
     *     The thread-pools
     */
    public void setThreadPools(ThreadPools threadPools) {
        this.threadPools = threadPools;
    }

    public Subsystem withThreadPools(ThreadPools threadPools) {
        this.threadPools = threadPools;
        return this;
    }

    /**
     * 
     * @return
     *     The caches
     */
    public Caches getCaches() {
        return caches;
    }

    /**
     * 
     * @param caches
     *     The caches
     */
    public void setCaches(Caches caches) {
        this.caches = caches;
    }

    public Subsystem withCaches(Caches caches) {
        this.caches = caches;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultMissingMethodPermissionsDenyAccess
     */
    public DefaultMissingMethodPermissionsDenyAccess getDefaultMissingMethodPermissionsDenyAccess() {
        return defaultMissingMethodPermissionsDenyAccess;
    }

    /**
     * 
     * @param defaultMissingMethodPermissionsDenyAccess
     *     The default-missing-method-permissions-deny-access
     */
    public void setDefaultMissingMethodPermissionsDenyAccess(DefaultMissingMethodPermissionsDenyAccess defaultMissingMethodPermissionsDenyAccess) {
        this.defaultMissingMethodPermissionsDenyAccess = defaultMissingMethodPermissionsDenyAccess;
    }

    public Subsystem withDefaultMissingMethodPermissionsDenyAccess(DefaultMissingMethodPermissionsDenyAccess defaultMissingMethodPermissionsDenyAccess) {
        this.defaultMissingMethodPermissionsDenyAccess = defaultMissingMethodPermissionsDenyAccess;
        return this;
    }

    /**
     * 
     * @return
     *     The passivationStores
     */
    public PassivationStores getPassivationStores() {
        return passivationStores;
    }

    /**
     * 
     * @param passivationStores
     *     The passivation-stores
     */
    public void setPassivationStores(PassivationStores passivationStores) {
        this.passivationStores = passivationStores;
    }

    public Subsystem withPassivationStores(PassivationStores passivationStores) {
        this.passivationStores = passivationStores;
        return this;
    }

    /**
     * 
     * @return
     *     The sessionBean
     */
    public SessionBean getSessionBean() {
        return sessionBean;
    }

    /**
     * 
     * @param sessionBean
     *     The session-bean
     */
    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

    public Subsystem withSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
        return this;
    }

    /**
     * 
     * @return
     *     The pools
     */
    public Pools getPools() {
        return pools;
    }

    /**
     * 
     * @param pools
     *     The pools
     */
    public void setPools(Pools pools) {
        this.pools = pools;
    }

    public Subsystem withPools(Pools pools) {
        this.pools = pools;
        return this;
    }

    /**
     * 
     * @return
     *     The mdb
     */
    public Mdb getMdb() {
        return mdb;
    }

    /**
     * 
     * @param mdb
     *     The mdb
     */
    public void setMdb(Mdb mdb) {
        this.mdb = mdb;
    }

    public Subsystem withMdb(Mdb mdb) {
        this.mdb = mdb;
        return this;
    }

    /**
     * 
     * @return
     *     The timerService
     */
    public TimerService getTimerService() {
        return timerService;
    }

    /**
     * 
     * @param timerService
     *     The timer-service
     */
    public void setTimerService(TimerService timerService) {
        this.timerService = timerService;
    }

    public Subsystem withTimerService(TimerService timerService) {
        this.timerService = timerService;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultSecurityDomain
     */
    public DefaultSecurityDomain getDefaultSecurityDomain() {
        return defaultSecurityDomain;
    }

    /**
     * 
     * @param defaultSecurityDomain
     *     The default-security-domain
     */
    public void setDefaultSecurityDomain(DefaultSecurityDomain defaultSecurityDomain) {
        this.defaultSecurityDomain = defaultSecurityDomain;
    }

    public Subsystem withDefaultSecurityDomain(DefaultSecurityDomain defaultSecurityDomain) {
        this.defaultSecurityDomain = defaultSecurityDomain;
        return this;
    }

    /**
     * 
     * @return
     *     The remote
     */
    public Remote getRemote() {
        return remote;
    }

    /**
     * 
     * @param remote
     *     The remote
     */
    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public Subsystem withRemote(Remote remote) {
        this.remote = remote;
        return this;
    }

    /**
     * 
     * @return
     *     The cacheContainer
     */
    public List<CacheContainer> getCacheContainer() {
        return cacheContainer;
    }

    /**
     * 
     * @param cacheContainer
     *     The cache-container
     */
    public void setCacheContainer(List<CacheContainer> cacheContainer) {
        this.cacheContainer = cacheContainer;
    }

    public Subsystem withCacheContainer(List<CacheContainer> cacheContainer) {
        this.cacheContainer = cacheContainer;
        return this;
    }

    /**
     * 
     * @return
     *     The archiveValidation
     */
    public ArchiveValidation getArchiveValidation() {
        return archiveValidation;
    }

    /**
     * 
     * @param archiveValidation
     *     The archive-validation
     */
    public void setArchiveValidation(ArchiveValidation archiveValidation) {
        this.archiveValidation = archiveValidation;
    }

    public Subsystem withArchiveValidation(ArchiveValidation archiveValidation) {
        this.archiveValidation = archiveValidation;
        return this;
    }

    /**
     * 
     * @return
     *     The beanValidation
     */
    public BeanValidation getBeanValidation() {
        return beanValidation;
    }

    /**
     * 
     * @param beanValidation
     *     The bean-validation
     */
    public void setBeanValidation(BeanValidation beanValidation) {
        this.beanValidation = beanValidation;
    }

    public Subsystem withBeanValidation(BeanValidation beanValidation) {
        this.beanValidation = beanValidation;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultWorkmanager
     */
    public DefaultWorkmanager getDefaultWorkmanager() {
        return defaultWorkmanager;
    }

    /**
     * 
     * @param defaultWorkmanager
     *     The default-workmanager
     */
    public void setDefaultWorkmanager(DefaultWorkmanager defaultWorkmanager) {
        this.defaultWorkmanager = defaultWorkmanager;
    }

    public Subsystem withDefaultWorkmanager(DefaultWorkmanager defaultWorkmanager) {
        this.defaultWorkmanager = defaultWorkmanager;
        return this;
    }

    /**
     * 
     * @return
     *     The cachedConnectionManager
     */
    public String getCachedConnectionManager() {
        return cachedConnectionManager;
    }

    /**
     * 
     * @param cachedConnectionManager
     *     The cached-connection-manager
     */
    public void setCachedConnectionManager(String cachedConnectionManager) {
        this.cachedConnectionManager = cachedConnectionManager;
    }

    public Subsystem withCachedConnectionManager(String cachedConnectionManager) {
        this.cachedConnectionManager = cachedConnectionManager;
        return this;
    }

    /**
     * 
     * @return
     *     The remotingConnector
     */
    public String getRemotingConnector() {
        return remotingConnector;
    }

    /**
     * 
     * @param remotingConnector
     *     The remoting-connector
     */
    public void setRemotingConnector(String remotingConnector) {
        this.remotingConnector = remotingConnector;
    }

    public Subsystem withRemotingConnector(String remotingConnector) {
        this.remotingConnector = remotingConnector;
        return this;
    }

    /**
     * 
     * @return
     *     The exposeResolvedModel
     */
    public String getExposeResolvedModel() {
        return exposeResolvedModel;
    }

    /**
     * 
     * @param exposeResolvedModel
     *     The expose-resolved-model
     */
    public void setExposeResolvedModel(String exposeResolvedModel) {
        this.exposeResolvedModel = exposeResolvedModel;
    }

    public Subsystem withExposeResolvedModel(String exposeResolvedModel) {
        this.exposeResolvedModel = exposeResolvedModel;
        return this;
    }

    /**
     * 
     * @return
     *     The exposeExpressionModel
     */
    public String getExposeExpressionModel() {
        return exposeExpressionModel;
    }

    /**
     * 
     * @param exposeExpressionModel
     *     The expose-expression-model
     */
    public void setExposeExpressionModel(String exposeExpressionModel) {
        this.exposeExpressionModel = exposeExpressionModel;
    }

    public Subsystem withExposeExpressionModel(String exposeExpressionModel) {
        this.exposeExpressionModel = exposeExpressionModel;
        return this;
    }

    /**
     * 
     * @return
     *     The jpa
     */
    public Jpa getJpa() {
        return jpa;
    }

    /**
     * 
     * @param jpa
     *     The jpa
     */
    public void setJpa(Jpa jpa) {
        this.jpa = jpa;
    }

    public Subsystem withJpa(Jpa jpa) {
        this.jpa = jpa;
        return this;
    }

    /**
     * 
     * @return
     *     The mailSession
     */
    public MailSession getMailSession() {
        return mailSession;
    }

    /**
     * 
     * @param mailSession
     *     The mail-session
     */
    public void setMailSession(MailSession mailSession) {
        this.mailSession = mailSession;
    }

    public Subsystem withMailSession(MailSession mailSession) {
        this.mailSession = mailSession;
        return this;
    }

    /**
     * 
     * @return
     *     The remoteNaming
     */
    public String getRemoteNaming() {
        return remoteNaming;
    }

    /**
     * 
     * @param remoteNaming
     *     The remote-naming
     */
    public void setRemoteNaming(String remoteNaming) {
        this.remoteNaming = remoteNaming;
    }

    public Subsystem withRemoteNaming(String remoteNaming) {
        this.remoteNaming = remoteNaming;
        return this;
    }

    /**
     * 
     * @return
     *     The connector
     */
    public Connector getConnector() {
        return connector;
    }

    /**
     * 
     * @param connector
     *     The connector
     */
    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    public Subsystem withConnector(Connector connector) {
        this.connector = connector;
        return this;
    }

    /**
     * 
     * @return
     *     The resourceAdapters
     */
    public ResourceAdapters getResourceAdapters() {
        return resourceAdapters;
    }

    /**
     * 
     * @param resourceAdapters
     *     The resource-adapters
     */
    public void setResourceAdapters(ResourceAdapters resourceAdapters) {
        this.resourceAdapters = resourceAdapters;
    }

    public Subsystem withResourceAdapters(ResourceAdapters resourceAdapters) {
        this.resourceAdapters = resourceAdapters;
        return this;
    }

    /**
     * 
     * @return
     *     The securityDomains
     */
    public SecurityDomains getSecurityDomains() {
        return securityDomains;
    }

    /**
     * 
     * @param securityDomains
     *     The security-domains
     */
    public void setSecurityDomains(SecurityDomains securityDomains) {
        this.securityDomains = securityDomains;
    }

    public Subsystem withSecurityDomains(SecurityDomains securityDomains) {
        this.securityDomains = securityDomains;
        return this;
    }

    /**
     * 
     * @return
     *     The coreEnvironment
     */
    public CoreEnvironment getCoreEnvironment() {
        return coreEnvironment;
    }

    /**
     * 
     * @param coreEnvironment
     *     The core-environment
     */
    public void setCoreEnvironment(CoreEnvironment coreEnvironment) {
        this.coreEnvironment = coreEnvironment;
    }

    public Subsystem withCoreEnvironment(CoreEnvironment coreEnvironment) {
        this.coreEnvironment = coreEnvironment;
        return this;
    }

    /**
     * 
     * @return
     *     The coordinatorEnvironment
     */
    public CoordinatorEnvironment getCoordinatorEnvironment() {
        return coordinatorEnvironment;
    }

    /**
     * 
     * @param coordinatorEnvironment
     *     The coordinator-environment
     */
    public void setCoordinatorEnvironment(CoordinatorEnvironment coordinatorEnvironment) {
        this.coordinatorEnvironment = coordinatorEnvironment;
    }

    public Subsystem withCoordinatorEnvironment(CoordinatorEnvironment coordinatorEnvironment) {
        this.coordinatorEnvironment = coordinatorEnvironment;
        return this;
    }

    /**
     * 
     * @return
     *     The recoveryEnvironment
     */
    public RecoveryEnvironment getRecoveryEnvironment() {
        return recoveryEnvironment;
    }

    /**
     * 
     * @param recoveryEnvironment
     *     The recovery-environment
     */
    public void setRecoveryEnvironment(RecoveryEnvironment recoveryEnvironment) {
        this.recoveryEnvironment = recoveryEnvironment;
    }

    public Subsystem withRecoveryEnvironment(RecoveryEnvironment recoveryEnvironment) {
        this.recoveryEnvironment = recoveryEnvironment;
        return this;
    }

    /**
     * 
     * @return
     *     The _native
     */
    public Boolean getNative() {
        return _native;
    }

    /**
     * 
     * @param _native
     *     The native
     */
    public void setNative(Boolean _native) {
        this._native = _native;
    }

    public Subsystem withNative(Boolean _native) {
        this._native = _native;
        return this;
    }

    /**
     * 
     * @return
     *     The virtualServer
     */
    public VirtualServer getVirtualServer() {
        return virtualServer;
    }

    /**
     * 
     * @param virtualServer
     *     The virtual-server
     */
    public void setVirtualServer(VirtualServer virtualServer) {
        this.virtualServer = virtualServer;
    }

    public Subsystem withVirtualServer(VirtualServer virtualServer) {
        this.virtualServer = virtualServer;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultVirtualServer
     */
    public String getDefaultVirtualServer() {
        return defaultVirtualServer;
    }

    /**
     * 
     * @param defaultVirtualServer
     *     The default-virtual-server
     */
    public void setDefaultVirtualServer(String defaultVirtualServer) {
        this.defaultVirtualServer = defaultVirtualServer;
    }

    public Subsystem withDefaultVirtualServer(String defaultVirtualServer) {
        this.defaultVirtualServer = defaultVirtualServer;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(xmlns).append(periodicRotatingFileHandler).append(consoleHandler).append(logger).append(rootLogger).append(datasources).append(deploymentScanner).append(jbossDescriptorPropertyReplacement).append(specDescriptorPropertyReplacement).append(globalModules).append(async).append(threadPools).append(caches).append(defaultMissingMethodPermissionsDenyAccess).append(passivationStores).append(sessionBean).append(pools).append(mdb).append(timerService).append(defaultSecurityDomain).append(remote).append(cacheContainer).append(archiveValidation).append(beanValidation).append(defaultWorkmanager).append(cachedConnectionManager).append(remotingConnector).append(exposeResolvedModel).append(exposeExpressionModel).append(jpa).append(mailSession).append(remoteNaming).append(connector).append(resourceAdapters).append(securityDomains).append(coreEnvironment).append(coordinatorEnvironment).append(recoveryEnvironment).append(_native).append(virtualServer).append(defaultVirtualServer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subsystem) == false) {
            return false;
        }
        Subsystem rhs = ((Subsystem) other);
        return new EqualsBuilder().append(xmlns, rhs.xmlns).append(periodicRotatingFileHandler, rhs.periodicRotatingFileHandler).append(consoleHandler, rhs.consoleHandler).append(logger, rhs.logger).append(rootLogger, rhs.rootLogger).append(datasources, rhs.datasources).append(deploymentScanner, rhs.deploymentScanner).append(jbossDescriptorPropertyReplacement, rhs.jbossDescriptorPropertyReplacement).append(specDescriptorPropertyReplacement, rhs.specDescriptorPropertyReplacement).append(globalModules, rhs.globalModules).append(async, rhs.async).append(threadPools, rhs.threadPools).append(caches, rhs.caches).append(defaultMissingMethodPermissionsDenyAccess, rhs.defaultMissingMethodPermissionsDenyAccess).append(passivationStores, rhs.passivationStores).append(sessionBean, rhs.sessionBean).append(pools, rhs.pools).append(mdb, rhs.mdb).append(timerService, rhs.timerService).append(defaultSecurityDomain, rhs.defaultSecurityDomain).append(remote, rhs.remote).append(cacheContainer, rhs.cacheContainer).append(archiveValidation, rhs.archiveValidation).append(beanValidation, rhs.beanValidation).append(defaultWorkmanager, rhs.defaultWorkmanager).append(cachedConnectionManager, rhs.cachedConnectionManager).append(remotingConnector, rhs.remotingConnector).append(exposeResolvedModel, rhs.exposeResolvedModel).append(exposeExpressionModel, rhs.exposeExpressionModel).append(jpa, rhs.jpa).append(mailSession, rhs.mailSession).append(remoteNaming, rhs.remoteNaming).append(connector, rhs.connector).append(resourceAdapters, rhs.resourceAdapters).append(securityDomains, rhs.securityDomains).append(coreEnvironment, rhs.coreEnvironment).append(coordinatorEnvironment, rhs.coordinatorEnvironment).append(recoveryEnvironment, rhs.recoveryEnvironment).append(_native, rhs._native).append(virtualServer, rhs.virtualServer).append(defaultVirtualServer, rhs.defaultVirtualServer).isEquals();
    }

}
