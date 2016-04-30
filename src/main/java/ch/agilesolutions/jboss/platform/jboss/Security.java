
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Security {

    @SerializedName("security-domain")
    @Expose
    private String securityDomain;

    /**
     * 
     * @return
     *     The securityDomain
     */
    public String getSecurityDomain() {
        return securityDomain;
    }

    /**
     * 
     * @param securityDomain
     *     The security-domain
     */
    public void setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
    }

    public Security withSecurityDomain(String securityDomain) {
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
        if ((other instanceof Security) == false) {
            return false;
        }
        Security rhs = ((Security) other);
        return new EqualsBuilder().append(securityDomain, rhs.securityDomain).isEquals();
    }

}
