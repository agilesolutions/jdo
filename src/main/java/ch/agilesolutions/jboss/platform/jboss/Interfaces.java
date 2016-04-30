
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
public class Interfaces {

    @SerializedName("interface")
    @Expose
    private List<Interface> _interface = new ArrayList<Interface>();

    /**
     * 
     * @return
     *     The _interface
     */
    public List<Interface> getInterface() {
        return _interface;
    }

    /**
     * 
     * @param _interface
     *     The interface
     */
    public void setInterface(List<Interface> _interface) {
        this._interface = _interface;
    }

    public Interfaces withInterface(List<Interface> _interface) {
        this._interface = _interface;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_interface).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interfaces) == false) {
            return false;
        }
        Interfaces rhs = ((Interfaces) other);
        return new EqualsBuilder().append(_interface, rhs._interface).isEquals();
    }

}
