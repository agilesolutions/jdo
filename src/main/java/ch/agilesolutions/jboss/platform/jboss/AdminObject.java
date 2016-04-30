
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AdminObject {

    @SerializedName("pool-name")
    @Expose
    private String poolName;
    @SerializedName("config-property")
    @Expose
    private ConfigProperty_ configProperty;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("class-name")
    @Expose
    private String className;
    @SerializedName("jndi-name")
    @Expose
    private String jndiName;

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

    public AdminObject withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * 
     * @return
     *     The configProperty
     */
    public ConfigProperty_ getConfigProperty() {
        return configProperty;
    }

    /**
     * 
     * @param configProperty
     *     The config-property
     */
    public void setConfigProperty(ConfigProperty_ configProperty) {
        this.configProperty = configProperty;
    }

    public AdminObject withConfigProperty(ConfigProperty_ configProperty) {
        this.configProperty = configProperty;
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

    public AdminObject withEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public AdminObject withClassName(String className) {
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

    public AdminObject withJndiName(String jndiName) {
        this.jndiName = jndiName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(poolName).append(configProperty).append(enabled).append(className).append(jndiName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdminObject) == false) {
            return false;
        }
        AdminObject rhs = ((AdminObject) other);
        return new EqualsBuilder().append(poolName, rhs.poolName).append(configProperty, rhs.configProperty).append(enabled, rhs.enabled).append(className, rhs.className).append(jndiName, rhs.jndiName).isEquals();
    }

}
