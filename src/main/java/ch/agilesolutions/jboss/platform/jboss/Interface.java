
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Interface {

    @SerializedName("inet-address")
    @Expose
    private InetAddress inetAddress;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The inetAddress
     */
    public InetAddress getInetAddress() {
        return inetAddress;
    }

    /**
     * 
     * @param inetAddress
     *     The inet-address
     */
    public void setInetAddress(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }

    public Interface withInetAddress(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
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

    public Interface withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inetAddress).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interface) == false) {
            return false;
        }
        Interface rhs = ((Interface) other);
        return new EqualsBuilder().append(inetAddress, rhs.inetAddress).append(name, rhs.name).isEquals();
    }

}
