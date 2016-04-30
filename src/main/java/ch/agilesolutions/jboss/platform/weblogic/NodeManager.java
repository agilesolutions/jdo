
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class NodeManager {

    @SerializedName("listen-address")
    @Expose
    private String listenAddress;
    @SerializedName("listen-port")
    @Expose
    private Integer listenPort;

    /**
     * 
     * @return
     *     The listenAddress
     */
    public String getListenAddress() {
        return listenAddress;
    }

    /**
     * 
     * @param listenAddress
     *     The listen-address
     */
    public void setListenAddress(String listenAddress) {
        this.listenAddress = listenAddress;
    }

    public NodeManager withListenAddress(String listenAddress) {
        this.listenAddress = listenAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The listenPort
     */
    public Integer getListenPort() {
        return listenPort;
    }

    /**
     * 
     * @param listenPort
     *     The listen-port
     */
    public void setListenPort(Integer listenPort) {
        this.listenPort = listenPort;
    }

    public NodeManager withListenPort(Integer listenPort) {
        this.listenPort = listenPort;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(listenAddress).append(listenPort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodeManager) == false) {
            return false;
        }
        NodeManager rhs = ((NodeManager) other);
        return new EqualsBuilder().append(listenAddress, rhs.listenAddress).append(listenPort, rhs.listenPort).isEquals();
    }

}
