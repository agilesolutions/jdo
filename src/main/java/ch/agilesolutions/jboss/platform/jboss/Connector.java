
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Connector {

    @SerializedName("protocol")
    @Expose
    private String protocol;
    @SerializedName("socket-binding")
    @Expose
    private String socketBinding;
    @SerializedName("scheme")
    @Expose
    private String scheme;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * 
     * @param protocol
     *     The protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Connector withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 
     * @return
     *     The socketBinding
     */
    public String getSocketBinding() {
        return socketBinding;
    }

    /**
     * 
     * @param socketBinding
     *     The socket-binding
     */
    public void setSocketBinding(String socketBinding) {
        this.socketBinding = socketBinding;
    }

    public Connector withSocketBinding(String socketBinding) {
        this.socketBinding = socketBinding;
        return this;
    }

    /**
     * 
     * @return
     *     The scheme
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * 
     * @param scheme
     *     The scheme
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public Connector withScheme(String scheme) {
        this.scheme = scheme;
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

    public Connector withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(protocol).append(socketBinding).append(scheme).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Connector) == false) {
            return false;
        }
        Connector rhs = ((Connector) other);
        return new EqualsBuilder().append(protocol, rhs.protocol).append(socketBinding, rhs.socketBinding).append(scheme, rhs.scheme).append(name, rhs.name).isEquals();
    }

}
