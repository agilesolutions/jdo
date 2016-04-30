
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Stateless {

    @SerializedName("bean-instance-pool-ref")
    @Expose
    private BeanInstancePoolRef beanInstancePoolRef;

    /**
     * 
     * @return
     *     The beanInstancePoolRef
     */
    public BeanInstancePoolRef getBeanInstancePoolRef() {
        return beanInstancePoolRef;
    }

    /**
     * 
     * @param beanInstancePoolRef
     *     The bean-instance-pool-ref
     */
    public void setBeanInstancePoolRef(BeanInstancePoolRef beanInstancePoolRef) {
        this.beanInstancePoolRef = beanInstancePoolRef;
    }

    public Stateless withBeanInstancePoolRef(BeanInstancePoolRef beanInstancePoolRef) {
        this.beanInstancePoolRef = beanInstancePoolRef;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(beanInstancePoolRef).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stateless) == false) {
            return false;
        }
        Stateless rhs = ((Stateless) other);
        return new EqualsBuilder().append(beanInstancePoolRef, rhs.beanInstancePoolRef).isEquals();
    }

}
