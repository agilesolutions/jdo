
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
public class SocketBindingGroup {

    @SerializedName("socket-binding")
    @Expose
    private List<SocketBinding> socketBinding = new ArrayList<SocketBinding>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("port-offset")
    @Expose
    private Integer portOffset;
    @SerializedName("outbound-socket-binding")
    @Expose
    private List<OutboundSocketBinding>  outboundSocketBinding = new ArrayList<OutboundSocketBinding>();
    @SerializedName("default-interface")
    @Expose
    private String defaultInterface;

    /**
     * 
     * @return
     *     The socketBinding
     */
    public List<SocketBinding> getSocketBinding() {
        return socketBinding;
    }

    /**
     * 
     * @param socketBinding
     *     The socket-binding
     */
    public void setSocketBinding(List<SocketBinding> socketBinding) {
        this.socketBinding = socketBinding;
    }

    public SocketBindingGroup withSocketBinding(List<SocketBinding> socketBinding) {
        this.socketBinding = socketBinding;
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

    public SocketBindingGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The portOffset
     */
    public Integer getPortOffset() {
        return portOffset;
    }

    /**
     * 
     * @param portOffset
     *     The port-offset
     */
    public void setPortOffset(Integer portOffset) {
        this.portOffset = portOffset;
    }

    public SocketBindingGroup withPortOffset(Integer portOffset) {
        this.portOffset = portOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The outboundSocketBinding
     */
    public List<OutboundSocketBinding> getOutboundSocketBinding() {
        return outboundSocketBinding;
    }

    /**
     * 
     * @param outboundSocketBinding
     *     The outbound-socket-binding
     */
    public void setOutboundSocketBinding(List<OutboundSocketBinding> outboundSocketBinding) {
        this.outboundSocketBinding = outboundSocketBinding;
    }

    public SocketBindingGroup withOutboundSocketBinding(List<OutboundSocketBinding> outboundSocketBinding) {
        this.outboundSocketBinding = outboundSocketBinding;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultInterface
     */
    public String getDefaultInterface() {
        return defaultInterface;
    }

    /**
     * 
     * @param defaultInterface
     *     The default-interface
     */
    public void setDefaultInterface(String defaultInterface) {
        this.defaultInterface = defaultInterface;
    }

    public SocketBindingGroup withDefaultInterface(String defaultInterface) {
        this.defaultInterface = defaultInterface;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(socketBinding).append(name).append(portOffset).append(outboundSocketBinding).append(defaultInterface).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SocketBindingGroup) == false) {
            return false;
        }
        SocketBindingGroup rhs = ((SocketBindingGroup) other);
        return new EqualsBuilder().append(socketBinding, rhs.socketBinding).append(name, rhs.name).append(portOffset, rhs.portOffset).append(outboundSocketBinding, rhs.outboundSocketBinding).append(defaultInterface, rhs.defaultInterface).isEquals();
    }

}
