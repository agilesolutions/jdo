
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class XaDatasource {

    @SerializedName("security")
    @Expose
    private Security_ security;
    @SerializedName("pool-name")
    @Expose
    private String poolName;
    @SerializedName("driver")
    @Expose
    private String driver;
    @SerializedName("xa-datasource-class")
    @Expose
    private String xaDatasourceClass;
    @SerializedName("xa-datasource-property")
    @Expose
    private XaDatasourceProperty xaDatasourceProperty;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("jndi-name")
    @Expose
    private String jndiName;

    /**
     * 
     * @return
     *     The security
     */
    public Security_ getSecurity() {
        return security;
    }

    /**
     * 
     * @param security
     *     The security
     */
    public void setSecurity(Security_ security) {
        this.security = security;
    }

    public XaDatasource withSecurity(Security_ security) {
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

    public XaDatasource withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * 
     * @return
     *     The driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * 
     * @param driver
     *     The driver
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    public XaDatasource withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    /**
     * 
     * @return
     *     The xaDatasourceClass
     */
    public String getXaDatasourceClass() {
        return xaDatasourceClass;
    }

    /**
     * 
     * @param xaDatasourceClass
     *     The xa-datasource-class
     */
    public void setXaDatasourceClass(String xaDatasourceClass) {
        this.xaDatasourceClass = xaDatasourceClass;
    }

    public XaDatasource withXaDatasourceClass(String xaDatasourceClass) {
        this.xaDatasourceClass = xaDatasourceClass;
        return this;
    }

    /**
     * 
     * @return
     *     The xaDatasourceProperty
     */
    public XaDatasourceProperty getXaDatasourceProperty() {
        return xaDatasourceProperty;
    }

    /**
     * 
     * @param xaDatasourceProperty
     *     The xa-datasource-property
     */
    public void setXaDatasourceProperty(XaDatasourceProperty xaDatasourceProperty) {
        this.xaDatasourceProperty = xaDatasourceProperty;
    }

    public XaDatasource withXaDatasourceProperty(XaDatasourceProperty xaDatasourceProperty) {
        this.xaDatasourceProperty = xaDatasourceProperty;
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

    public XaDatasource withEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public XaDatasource withJndiName(String jndiName) {
        this.jndiName = jndiName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(security).append(poolName).append(driver).append(xaDatasourceClass).append(xaDatasourceProperty).append(enabled).append(jndiName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XaDatasource) == false) {
            return false;
        }
        XaDatasource rhs = ((XaDatasource) other);
        return new EqualsBuilder().append(security, rhs.security).append(poolName, rhs.poolName).append(driver, rhs.driver).append(xaDatasourceClass, rhs.xaDatasourceClass).append(xaDatasourceProperty, rhs.xaDatasourceProperty).append(enabled, rhs.enabled).append(jndiName, rhs.jndiName).isEquals();
    }

}
