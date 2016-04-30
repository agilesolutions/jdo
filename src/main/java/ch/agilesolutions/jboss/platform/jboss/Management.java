
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Management {

    @SerializedName("security-realms")
    @Expose
    private SecurityRealms securityRealms;
    @SerializedName("management-interfaces")
    @Expose
    private ManagementInterfaces managementInterfaces;

    /**
     * 
     * @return
     *     The securityRealms
     */
    public SecurityRealms getSecurityRealms() {
        return securityRealms;
    }

    /**
     * 
     * @param securityRealms
     *     The security-realms
     */
    public void setSecurityRealms(SecurityRealms securityRealms) {
        this.securityRealms = securityRealms;
    }

    public Management withSecurityRealms(SecurityRealms securityRealms) {
        this.securityRealms = securityRealms;
        return this;
    }

    /**
     * 
     * @return
     *     The managementInterfaces
     */
    public ManagementInterfaces getManagementInterfaces() {
        return managementInterfaces;
    }

    /**
     * 
     * @param managementInterfaces
     *     The management-interfaces
     */
    public void setManagementInterfaces(ManagementInterfaces managementInterfaces) {
        this.managementInterfaces = managementInterfaces;
    }

    public Management withManagementInterfaces(ManagementInterfaces managementInterfaces) {
        this.managementInterfaces = managementInterfaces;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(securityRealms).append(managementInterfaces).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Management) == false) {
            return false;
        }
        Management rhs = ((Management) other);
        return new EqualsBuilder().append(securityRealms, rhs.securityRealms).append(managementInterfaces, rhs.managementInterfaces).isEquals();
    }

}
