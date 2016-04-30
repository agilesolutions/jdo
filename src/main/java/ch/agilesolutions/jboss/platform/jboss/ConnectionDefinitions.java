
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ConnectionDefinitions {

    @SerializedName("connection-definition")
    @Expose
    private ConnectionDefinition connectionDefinition;

    /**
     * 
     * @return
     *     The connectionDefinition
     */
    public ConnectionDefinition getConnectionDefinition() {
        return connectionDefinition;
    }

    /**
     * 
     * @param connectionDefinition
     *     The connection-definition
     */
    public void setConnectionDefinition(ConnectionDefinition connectionDefinition) {
        this.connectionDefinition = connectionDefinition;
    }

    public ConnectionDefinitions withConnectionDefinition(ConnectionDefinition connectionDefinition) {
        this.connectionDefinition = connectionDefinition;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectionDefinition).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionDefinitions) == false) {
            return false;
        }
        ConnectionDefinitions rhs = ((ConnectionDefinitions) other);
        return new EqualsBuilder().append(connectionDefinition, rhs.connectionDefinition).isEquals();
    }

}
