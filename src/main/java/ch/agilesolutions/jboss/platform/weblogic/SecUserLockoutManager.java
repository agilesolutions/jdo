
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SecUserLockoutManager {

    @SerializedName("sec:lockout-enabled")
    @Expose
    private Boolean secLockoutEnabled;

    /**
     * 
     * @return
     *     The secLockoutEnabled
     */
    public Boolean getSecLockoutEnabled() {
        return secLockoutEnabled;
    }

    /**
     * 
     * @param secLockoutEnabled
     *     The sec:lockout-enabled
     */
    public void setSecLockoutEnabled(Boolean secLockoutEnabled) {
        this.secLockoutEnabled = secLockoutEnabled;
    }

    public SecUserLockoutManager withSecLockoutEnabled(Boolean secLockoutEnabled) {
        this.secLockoutEnabled = secLockoutEnabled;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secLockoutEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecUserLockoutManager) == false) {
            return false;
        }
        SecUserLockoutManager rhs = ((SecUserLockoutManager) other);
        return new EqualsBuilder().append(secLockoutEnabled, rhs.secLockoutEnabled).isEquals();
    }

}
