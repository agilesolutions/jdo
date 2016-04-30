
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
public class Extensions {

    @SerializedName("extension")
    @Expose
    private List<Extension> extension = new ArrayList<Extension>();

    /**
     * 
     * @return
     *     The extension
     */
    public List<Extension> getExtension() {
        return extension;
    }

    /**
     * 
     * @param extension
     *     The extension
     */
    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    public Extensions withExtension(List<Extension> extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(extension).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Extensions) == false) {
            return false;
        }
        Extensions rhs = ((Extensions) other);
        return new EqualsBuilder().append(extension, rhs.extension).isEquals();
    }

}
