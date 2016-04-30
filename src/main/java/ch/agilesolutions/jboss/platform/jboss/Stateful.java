
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Stateful {

    @SerializedName("default-access-timeout")
    @Expose
    private Integer defaultAccessTimeout;
    @SerializedName("cache-ref")
    @Expose
    private String cacheRef;

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

    public Stateful withDefaultAccessTimeout(Integer defaultAccessTimeout) {
        this.defaultAccessTimeout = defaultAccessTimeout;
        return this;
    }

    /**
     * 
     * @return
     *     The cacheRef
     */
    public String getCacheRef() {
        return cacheRef;
    }

    /**
     * 
     * @param cacheRef
     *     The cache-ref
     */
    public void setCacheRef(String cacheRef) {
        this.cacheRef = cacheRef;
    }

    public Stateful withCacheRef(String cacheRef) {
        this.cacheRef = cacheRef;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultAccessTimeout).append(cacheRef).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stateful) == false) {
            return false;
        }
        Stateful rhs = ((Stateful) other);
        return new EqualsBuilder().append(defaultAccessTimeout, rhs.defaultAccessTimeout).append(cacheRef, rhs.cacheRef).isEquals();
    }

}
