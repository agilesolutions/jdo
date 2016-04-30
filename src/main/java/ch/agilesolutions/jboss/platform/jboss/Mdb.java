
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Mdb {

    @SerializedName("resource-adapter-ref")
    @Expose
    private ResourceAdapterRef resourceAdapterRef;
    @SerializedName("bean-instance-pool-ref")
    @Expose
    private BeanInstancePoolRef_ beanInstancePoolRef;

    /**
     * 
     * @return
     *     The resourceAdapterRef
     */
    public ResourceAdapterRef getResourceAdapterRef() {
        return resourceAdapterRef;
    }

    /**
     * 
     * @param resourceAdapterRef
     *     The resource-adapter-ref
     */
    public void setResourceAdapterRef(ResourceAdapterRef resourceAdapterRef) {
        this.resourceAdapterRef = resourceAdapterRef;
    }

    public Mdb withResourceAdapterRef(ResourceAdapterRef resourceAdapterRef) {
        this.resourceAdapterRef = resourceAdapterRef;
        return this;
    }

    /**
     * 
     * @return
     *     The beanInstancePoolRef
     */
    public BeanInstancePoolRef_ getBeanInstancePoolRef() {
        return beanInstancePoolRef;
    }

    /**
     * 
     * @param beanInstancePoolRef
     *     The bean-instance-pool-ref
     */
    public void setBeanInstancePoolRef(BeanInstancePoolRef_ beanInstancePoolRef) {
        this.beanInstancePoolRef = beanInstancePoolRef;
    }

    public Mdb withBeanInstancePoolRef(BeanInstancePoolRef_ beanInstancePoolRef) {
        this.beanInstancePoolRef = beanInstancePoolRef;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceAdapterRef).append(beanInstancePoolRef).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mdb) == false) {
            return false;
        }
        Mdb rhs = ((Mdb) other);
        return new EqualsBuilder().append(resourceAdapterRef, rhs.resourceAdapterRef).append(beanInstancePoolRef, rhs.beanInstancePoolRef).isEquals();
    }

}
