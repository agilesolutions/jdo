
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SecurityRealm {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("authentication")
    @Expose
    private Authentication authentication;
    @SerializedName("authorization")
    @Expose
    private Authorization authorization;

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

    public SecurityRealm withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The authentication
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * 
     * @param authentication
     *     The authentication
     */
    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public SecurityRealm withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * 
     * @return
     *     The authorization
     */
    public Authorization getAuthorization() {
        return authorization;
    }

    /**
     * 
     * @param authorization
     *     The authorization
     */
    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    public SecurityRealm withAuthorization(Authorization authorization) {
        this.authorization = authorization;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(authentication).append(authorization).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityRealm) == false) {
            return false;
        }
        SecurityRealm rhs = ((SecurityRealm) other);
        return new EqualsBuilder().append(name, rhs.name).append(authentication, rhs.authentication).append(authorization, rhs.authorization).isEquals();
    }

}
