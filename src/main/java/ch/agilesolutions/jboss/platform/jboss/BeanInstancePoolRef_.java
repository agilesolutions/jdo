
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class BeanInstancePoolRef_ {

    @SerializedName("pool-name")
    @Expose
    private String poolName;

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

    public BeanInstancePoolRef_ withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(poolName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BeanInstancePoolRef_) == false) {
            return false;
        }
        BeanInstancePoolRef_ rhs = ((BeanInstancePoolRef_) other);
        return new EqualsBuilder().append(poolName, rhs.poolName).isEquals();
    }

}
