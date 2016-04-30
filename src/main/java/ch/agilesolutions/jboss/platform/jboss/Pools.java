
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Pools {

    @SerializedName("bean-instance-pools")
    @Expose
    private BeanInstancePools beanInstancePools;

    /**
     * 
     * @return
     *     The beanInstancePools
     */
    public BeanInstancePools getBeanInstancePools() {
        return beanInstancePools;
    }

    /**
     * 
     * @param beanInstancePools
     *     The bean-instance-pools
     */
    public void setBeanInstancePools(BeanInstancePools beanInstancePools) {
        this.beanInstancePools = beanInstancePools;
    }

    public Pools withBeanInstancePools(BeanInstancePools beanInstancePools) {
        this.beanInstancePools = beanInstancePools;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(beanInstancePools).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pools) == false) {
            return false;
        }
        Pools rhs = ((Pools) other);
        return new EqualsBuilder().append(beanInstancePools, rhs.beanInstancePools).isEquals();
    }

}
