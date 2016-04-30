
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SocketBinding__ {

    @SerializedName("native")
    @Expose
    private String _native;

    /**
     * 
     * @return
     *     The _native
     */
    public String getNative() {
        return _native;
    }

    /**
     * 
     * @param _native
     *     The native
     */
    public void setNative(String _native) {
        this._native = _native;
    }

    public SocketBinding__ withNative(String _native) {
        this._native = _native;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_native).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SocketBinding__) == false) {
            return false;
        }
        SocketBinding__ rhs = ((SocketBinding__) other);
        return new EqualsBuilder().append(_native, rhs._native).isEquals();
    }

}
