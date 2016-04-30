
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Expiration {

    @SerializedName("max-idle")
    @Expose
    private Integer maxIdle;

    /**
     * 
     * @return
     *     The maxIdle
     */
    public Integer getMaxIdle() {
        return maxIdle;
    }

    /**
     * 
     * @param maxIdle
     *     The max-idle
     */
    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public Expiration withMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxIdle).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Expiration) == false) {
            return false;
        }
        Expiration rhs = ((Expiration) other);
        return new EqualsBuilder().append(maxIdle, rhs.maxIdle).isEquals();
    }

}
