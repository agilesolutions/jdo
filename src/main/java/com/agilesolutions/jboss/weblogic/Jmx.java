
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Jmx {

    @SerializedName("platform-m-bean-server-enabled")
    @Expose
    private Boolean platformMBeanServerEnabled;

    /**
     * 
     * @return
     *     The platformMBeanServerEnabled
     */
    public Boolean getPlatformMBeanServerEnabled() {
        return platformMBeanServerEnabled;
    }

    /**
     * 
     * @param platformMBeanServerEnabled
     *     The platform-m-bean-server-enabled
     */
    public void setPlatformMBeanServerEnabled(Boolean platformMBeanServerEnabled) {
        this.platformMBeanServerEnabled = platformMBeanServerEnabled;
    }

    public Jmx withPlatformMBeanServerEnabled(Boolean platformMBeanServerEnabled) {
        this.platformMBeanServerEnabled = platformMBeanServerEnabled;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(platformMBeanServerEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Jmx) == false) {
            return false;
        }
        Jmx rhs = ((Jmx) other);
        return new EqualsBuilder().append(platformMBeanServerEnabled, rhs.platformMBeanServerEnabled).isEquals();
    }

}
