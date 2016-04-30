
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
public class SystemProperties {

    @SerializedName("property")
    @Expose
    private List<Property> property = new ArrayList<Property>();

    /**
     * 
     * @return
     *     The property
     */
    public List<Property> getProperty() {
        return property;
    }

    /**
     * 
     * @param property
     *     The property
     */
    public void setProperty(List<Property> property) {
        this.property = property;
    }

    public SystemProperties withProperty(List<Property> property) {
        this.property = property;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(property).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemProperties) == false) {
            return false;
        }
        SystemProperties rhs = ((SystemProperties) other);
        return new EqualsBuilder().append(property, rhs.property).isEquals();
    }

}
