
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
public class BeanInstancePools {

    @SerializedName("strict-max-pool")
    @Expose
    private List<StrictMaxPool> strictMaxPool = new ArrayList<StrictMaxPool>();

    /**
     * 
     * @return
     *     The strictMaxPool
     */
    public List<StrictMaxPool> getStrictMaxPool() {
        return strictMaxPool;
    }

    /**
     * 
     * @param strictMaxPool
     *     The strict-max-pool
     */
    public void setStrictMaxPool(List<StrictMaxPool> strictMaxPool) {
        this.strictMaxPool = strictMaxPool;
    }

    public BeanInstancePools withStrictMaxPool(List<StrictMaxPool> strictMaxPool) {
        this.strictMaxPool = strictMaxPool;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(strictMaxPool).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BeanInstancePools) == false) {
            return false;
        }
        BeanInstancePools rhs = ((BeanInstancePools) other);
        return new EqualsBuilder().append(strictMaxPool, rhs.strictMaxPool).isEquals();
    }

}
