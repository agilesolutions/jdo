
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Singleton {

    @SerializedName("default-access-timeout")
    @Expose
    private Integer defaultAccessTimeout;

    /**
     * 
     * @return
     *     The defaultAccessTimeout
     */
    public Integer getDefaultAccessTimeout() {
        return defaultAccessTimeout;
    }

    /**
     * 
     * @param defaultAccessTimeout
     *     The default-access-timeout
     */
    public void setDefaultAccessTimeout(Integer defaultAccessTimeout) {
        this.defaultAccessTimeout = defaultAccessTimeout;
    }

    public Singleton withDefaultAccessTimeout(Integer defaultAccessTimeout) {
        this.defaultAccessTimeout = defaultAccessTimeout;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultAccessTimeout).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Singleton) == false) {
            return false;
        }
        Singleton rhs = ((Singleton) other);
        return new EqualsBuilder().append(defaultAccessTimeout, rhs.defaultAccessTimeout).isEquals();
    }

}
