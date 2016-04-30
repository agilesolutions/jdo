
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ResourceAdapterRef {

    @SerializedName("resource-adapter-name")
    @Expose
    private String resourceAdapterName;

    /**
     * 
     * @return
     *     The resourceAdapterName
     */
    public String getResourceAdapterName() {
        return resourceAdapterName;
    }

    /**
     * 
     * @param resourceAdapterName
     *     The resource-adapter-name
     */
    public void setResourceAdapterName(String resourceAdapterName) {
        this.resourceAdapterName = resourceAdapterName;
    }

    public ResourceAdapterRef withResourceAdapterName(String resourceAdapterName) {
        this.resourceAdapterName = resourceAdapterName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceAdapterName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceAdapterRef) == false) {
            return false;
        }
        ResourceAdapterRef rhs = ((ResourceAdapterRef) other);
        return new EqualsBuilder().append(resourceAdapterName, rhs.resourceAdapterName).isEquals();
    }

}
