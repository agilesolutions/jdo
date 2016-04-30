
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Remote {

    @SerializedName("connector-ref")
    @Expose
    private String connectorRef;
    @SerializedName("thread-pool-name")
    @Expose
    private String threadPoolName;

    /**
     * 
     * @return
     *     The connectorRef
     */
    public String getConnectorRef() {
        return connectorRef;
    }

    /**
     * 
     * @param connectorRef
     *     The connector-ref
     */
    public void setConnectorRef(String connectorRef) {
        this.connectorRef = connectorRef;
    }

    public Remote withConnectorRef(String connectorRef) {
        this.connectorRef = connectorRef;
        return this;
    }

    /**
     * 
     * @return
     *     The threadPoolName
     */
    public String getThreadPoolName() {
        return threadPoolName;
    }

    /**
     * 
     * @param threadPoolName
     *     The thread-pool-name
     */
    public void setThreadPoolName(String threadPoolName) {
        this.threadPoolName = threadPoolName;
    }

    public Remote withThreadPoolName(String threadPoolName) {
        this.threadPoolName = threadPoolName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectorRef).append(threadPoolName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Remote) == false) {
            return false;
        }
        Remote rhs = ((Remote) other);
        return new EqualsBuilder().append(connectorRef, rhs.connectorRef).append(threadPoolName, rhs.threadPoolName).isEquals();
    }

}
