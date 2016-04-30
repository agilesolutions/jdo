
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class OutboundSocketBinding {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("remote-destination")
    @Expose
    private RemoteDestination remoteDestination;

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

    public OutboundSocketBinding withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The remoteDestination
     */
    public RemoteDestination getRemoteDestination() {
        return remoteDestination;
    }

    /**
     * 
     * @param remoteDestination
     *     The remote-destination
     */
    public void setRemoteDestination(RemoteDestination remoteDestination) {
        this.remoteDestination = remoteDestination;
    }

    public OutboundSocketBinding withRemoteDestination(RemoteDestination remoteDestination) {
        this.remoteDestination = remoteDestination;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(remoteDestination).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OutboundSocketBinding) == false) {
            return false;
        }
        OutboundSocketBinding rhs = ((OutboundSocketBinding) other);
        return new EqualsBuilder().append(name, rhs.name).append(remoteDestination, rhs.remoteDestination).isEquals();
    }

}
