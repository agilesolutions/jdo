
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RemoteDestination {

    @SerializedName("port")
    @Expose
    private Integer port;
    @SerializedName("host")
    @Expose
    private String host;

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

    public RemoteDestination withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 
     * @return
     *     The host
     */
    public String getHost() {
        return host;
    }

    /**
     * 
     * @param host
     *     The host
     */
    public void setHost(String host) {
        this.host = host;
    }

    public RemoteDestination withHost(String host) {
        this.host = host;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(port).append(host).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemoteDestination) == false) {
            return false;
        }
        RemoteDestination rhs = ((RemoteDestination) other);
        return new EqualsBuilder().append(port, rhs.port).append(host, rhs.host).isEquals();
    }

}
