
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Machine {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("node-manager")
    @Expose
    private NodeManager nodeManager;

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

    public Machine withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The nodeManager
     */
    public NodeManager getNodeManager() {
        return nodeManager;
    }

    /**
     * 
     * @param nodeManager
     *     The node-manager
     */
    public void setNodeManager(NodeManager nodeManager) {
        this.nodeManager = nodeManager;
    }

    public Machine withNodeManager(NodeManager nodeManager) {
        this.nodeManager = nodeManager;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(nodeManager).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Machine) == false) {
            return false;
        }
        Machine rhs = ((Machine) other);
        return new EqualsBuilder().append(name, rhs.name).append(nodeManager, rhs.nodeManager).isEquals();
    }

}
