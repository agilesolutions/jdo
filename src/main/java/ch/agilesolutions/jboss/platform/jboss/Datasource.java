
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Datasource {

    @SerializedName("security")
    @Expose
    private Security security;
    @SerializedName("pool-name")
    @Expose
    private String poolName;
    @SerializedName("connection-url")
    @Expose
    private String connectionUrl;
    @SerializedName("driver")
    @Expose
    private String driver;
    @SerializedName("datasource-class")
    @Expose
    private String datasourceClass;
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
    public Security getSecurity() {
        return security;
    }

    /**
     * 
     * @param security
     *     The security
     */
    public void setSecurity(Security security) {
        this.security = security;
    }

    public Datasource withSecurity(Security security) {
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

    public Datasource withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * 
     * @return
     *     The connectionUrl
     */
    public String getConnectionUrl() {
        return connectionUrl;
    }

    /**
     * 
     * @param connectionUrl
     *     The connection-url
     */
    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public Datasource withConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
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

    public Datasource withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    /**
     * 
     * @return
     *     The datasourceClass
     */
    public String getDatasourceClass() {
        return datasourceClass;
    }

    /**
     * 
     * @param datasourceClass
     *     The datasource-class
     */
    public void setDatasourceClass(String datasourceClass) {
        this.datasourceClass = datasourceClass;
    }

    public Datasource withDatasourceClass(String datasourceClass) {
        this.datasourceClass = datasourceClass;
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

    public Datasource withEnabled(Boolean enabled) {
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

    public Datasource withJndiName(String jndiName) {
        this.jndiName = jndiName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(security).append(poolName).append(connectionUrl).append(driver).append(datasourceClass).append(enabled).append(jndiName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datasource) == false) {
            return false;
        }
        Datasource rhs = ((Datasource) other);
        return new EqualsBuilder().append(security, rhs.security).append(poolName, rhs.poolName).append(connectionUrl, rhs.connectionUrl).append(driver, rhs.driver).append(datasourceClass, rhs.datasourceClass).append(enabled, rhs.enabled).append(jndiName, rhs.jndiName).isEquals();
    }

}
