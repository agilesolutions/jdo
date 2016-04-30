
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ResourceAdapters {

    @SerializedName("resource-adapter")
    @Expose
    private ResourceAdapter resourceAdapter;

    /**
     * 
     * @return
     *     The resourceAdapter
     */
    public ResourceAdapter getResourceAdapter() {
        return resourceAdapter;
    }

    /**
     * 
     * @param resourceAdapter
     *     The resource-adapter
     */
    public void setResourceAdapter(ResourceAdapter resourceAdapter) {
        this.resourceAdapter = resourceAdapter;
    }

    public ResourceAdapters withResourceAdapter(ResourceAdapter resourceAdapter) {
        this.resourceAdapter = resourceAdapter;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceAdapter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceAdapters) == false) {
            return false;
        }
        ResourceAdapters rhs = ((ResourceAdapters) other);
        return new EqualsBuilder().append(resourceAdapter, rhs.resourceAdapter).isEquals();
    }

}
