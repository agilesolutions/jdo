
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
public class ConnectionDefinition {

    @SerializedName("xa-pool")
    @Expose
    private XaPool xaPool;
    @SerializedName("security")
    @Expose
    private Security__ security;
    @SerializedName("pool-name")
    @Expose
    private String poolName;
    @SerializedName("use-java-context")
    @Expose
    private Boolean useJavaContext;
    @SerializedName("config-property")
    @Expose
    private List<ConfigProperty> configProperty = new ArrayList<ConfigProperty>();
    @SerializedName("use-ccm")
    @Expose
    private Boolean useCcm;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("validation")
    @Expose
    private Validation validation;
    @SerializedName("class-name")
    @Expose
    private String className;
    @SerializedName("jndi-name")
    @Expose
    private String jndiName;

    /**
     * 
     * @return
     *     The xaPool
     */
    public XaPool getXaPool() {
        return xaPool;
    }

    /**
     * 
     * @param xaPool
     *     The xa-pool
     */
    public void setXaPool(XaPool xaPool) {
        this.xaPool = xaPool;
    }

    public ConnectionDefinition withXaPool(XaPool xaPool) {
        this.xaPool = xaPool;
        return this;
    }

    /**
     * 
     * @return
     *     The security
     */
    public Security__ getSecurity() {
        return security;
    }

    /**
     * 
     * @param security
     *     The security
     */
    public void setSecurity(Security__ security) {
        this.security = security;
    }

    public ConnectionDefinition withSecurity(Security__ security) {
        this.security = security;
        return this;
    }

    /**
     * 
     * @return
     *     The poolName
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * 
     * @param poolName
     *     The pool-name
     */
    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public ConnectionDefinition withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * 
     * @return
     *     The useJavaContext
     */
    public Boolean getUseJavaContext() {
        return useJavaContext;
    }

    /**
     * 
     * @param useJavaContext
     *     The use-java-context
     */
    public void setUseJavaContext(Boolean useJavaContext) {
        this.useJavaContext = useJavaContext;
    }

    public ConnectionDefinition withUseJavaContext(Boolean useJavaContext) {
        this.useJavaContext = useJavaContext;
        return this;
    }

    /**
     * 
     * @return
     *     The configProperty
     */
    public List<ConfigProperty> getConfigProperty() {
        return configProperty;
    }

    /**
     * 
     * @param configProperty
     *     The config-property
     */
    public void setConfigProperty(List<ConfigProperty> configProperty) {
        this.configProperty = configProperty;
    }

    public ConnectionDefinition withConfigProperty(List<ConfigProperty> configProperty) {
        this.configProperty = configProperty;
        return this;
    }

    /**
     * 
     * @return
     *     The useCcm
     */
    public Boolean getUseCcm() {
        return useCcm;
    }

    /**
     * 
     * @param useCcm
     *     The use-ccm
     */
    public void setUseCcm(Boolean useCcm) {
        this.useCcm = useCcm;
    }

    public ConnectionDefinition withUseCcm(Boolean useCcm) {
        this.useCcm = useCcm;
        return this;
    }

    /**
     * 
     * @return
     *     The enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     * @param enabled
     *     The enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ConnectionDefinition withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 
     * @return
     *     The validation
     */
    public Validation getValidation() {
        return validation;
    }

    /**
     * 
     * @param validation
     *     The validation
     */
    public void setValidation(Validation validation) {
        this.validation = validation;
    }

    public ConnectionDefinition withValidation(Validation validation) {
        this.validation = validation;
        return this;
    }

    /**
     * 
     * @return
     *     The className
     */
    public String getClassName() {
        return className;
    }

    /**
     * 
     * @param className
     *     The class-name
     */
    public void setClassName(String className) {
        this.className = className;
    }

    public ConnectionDefinition withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * 
     * @return
     *     The jndiName
     */
    public String getJndiName() {
        return jndiName;
    }

    /**
     * 
     * @param jndiName
     *     The jndi-name
     */
    public void setJndiName(String jndiName) {
        this.jndiName = jndiName;
    }

    public ConnectionDefinition withJndiName(String jndiName) {
        this.jndiName = jndiName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(xaPool).append(security).append(poolName).append(useJavaContext).append(configProperty).append(useCcm).append(enabled).append(validation).append(className).append(jndiName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionDefinition) == false) {
            return false;
        }
        ConnectionDefinition rhs = ((ConnectionDefinition) other);
        return new EqualsBuilder().append(xaPool, rhs.xaPool).append(security, rhs.security).append(poolName, rhs.poolName).append(useJavaContext, rhs.useJavaContext).append(configProperty, rhs.configProperty).append(useCcm, rhs.useCcm).append(enabled, rhs.enabled).append(validation, rhs.validation).append(className, rhs.className).append(jndiName, rhs.jndiName).isEquals();
    }

}
