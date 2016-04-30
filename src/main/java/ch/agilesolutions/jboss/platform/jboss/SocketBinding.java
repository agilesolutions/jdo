
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SocketBinding {

    @SerializedName("port")
    @Expose
    private Integer port;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("interface")
    @Expose
    private String _interface;

    /**
     * 
     * @return
     *     The port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * 
     * @param port
     *     The port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public SocketBinding withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public SocketBinding withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The _interface
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * 
     * @param _interface
     *     The interface
     */
    public void setInterface(String _interface) {
        this._interface = _interface;
    }

    public SocketBinding withInterface(String _interface) {
        this._interface = _interface;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(port).append(name).append(_interface).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SocketBinding) == false) {
            return false;
        }
        SocketBinding rhs = ((SocketBinding) other);
        return new EqualsBuilder().append(port, rhs.port).append(name, rhs.name).append(_interface, rhs._interface).isEquals();
    }

}
