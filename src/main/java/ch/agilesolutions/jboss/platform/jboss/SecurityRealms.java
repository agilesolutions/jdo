
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
public class SecurityRealms {

    @SerializedName("security-realm")
    @Expose
    private List<SecurityRealm> securityRealm = new ArrayList<SecurityRealm>();

    /**
     * 
     * @return
     *     The securityRealm
     */
    public List<SecurityRealm> getSecurityRealm() {
        return securityRealm;
    }

    /**
     * 
     * @param securityRealm
     *     The security-realm
     */
    public void setSecurityRealm(List<SecurityRealm> securityRealm) {
        this.securityRealm = securityRealm;
    }

    public SecurityRealms withSecurityRealm(List<SecurityRealm> securityRealm) {
        this.securityRealm = securityRealm;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(securityRealm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityRealms) == false) {
            return false;
        }
        SecurityRealms rhs = ((SecurityRealms) other);
        return new EqualsBuilder().append(securityRealm, rhs.securityRealm).isEquals();
    }

}
