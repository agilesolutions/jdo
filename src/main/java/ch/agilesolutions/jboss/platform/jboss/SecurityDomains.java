
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
public class SecurityDomains {

    @SerializedName("security-domain")
    @Expose
    private List<SecurityDomain> securityDomain = new ArrayList<SecurityDomain>();

    /**
     * 
     * @return
     *     The securityDomain
     */
    public List<SecurityDomain> getSecurityDomain() {
        return securityDomain;
    }

    /**
     * 
     * @param securityDomain
     *     The security-domain
     */
    public void setSecurityDomain(List<SecurityDomain> securityDomain) {
        this.securityDomain = securityDomain;
    }

    public SecurityDomains withSecurityDomain(List<SecurityDomain> securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(securityDomain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityDomains) == false) {
            return false;
        }
        SecurityDomains rhs = ((SecurityDomains) other);
        return new EqualsBuilder().append(securityDomain, rhs.securityDomain).isEquals();
    }

}
