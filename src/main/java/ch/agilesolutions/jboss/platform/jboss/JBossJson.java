
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class JBossJson {

    @SerializedName("server")
    @Expose
    private Server server;

    /**
     * 
     * @return
     *     The server
     */
    public Server getServer() {
        return server;
    }

    /**
     * 
     * @param server
     *     The server
     */
    public void setServer(Server server) {
        this.server = server;
    }

    public JBossJson withServer(Server server) {
        this.server = server;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(server).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JBossJson) == false) {
            return false;
        }
        JBossJson rhs = ((JBossJson) other);
        return new EqualsBuilder().append(server, rhs.server).isEquals();
    }

}
