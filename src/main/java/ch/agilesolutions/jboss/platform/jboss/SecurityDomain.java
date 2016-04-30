
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SecurityDomain {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cache-type")
    @Expose
    private String cacheType;
    @SerializedName("authentication")
    @Expose
    private Authentication_ authentication;
    @SerializedName("authorization")
    @Expose
    private Authorization_ authorization;

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

    public SecurityDomain withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The cacheType
     */
    public String getCacheType() {
        return cacheType;
    }

    /**
     * 
     * @param cacheType
     *     The cache-type
     */
    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }

    public SecurityDomain withCacheType(String cacheType) {
        this.cacheType = cacheType;
        return this;
    }

    /**
     * 
     * @return
     *     The authentication
     */
    public Authentication_ getAuthentication() {
        return authentication;
    }

    /**
     * 
     * @param authentication
     *     The authentication
     */
    public void setAuthentication(Authentication_ authentication) {
        this.authentication = authentication;
    }

    public SecurityDomain withAuthentication(Authentication_ authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * 
     * @return
     *     The authorization
     */
    public Authorization_ getAuthorization() {
        return authorization;
    }

    /**
     * 
     * @param authorization
     *     The authorization
     */
    public void setAuthorization(Authorization_ authorization) {
        this.authorization = authorization;
    }

    public SecurityDomain withAuthorization(Authorization_ authorization) {
        this.authorization = authorization;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(cacheType).append(authentication).append(authorization).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityDomain) == false) {
            return false;
        }
        SecurityDomain rhs = ((SecurityDomain) other);
        return new EqualsBuilder().append(name, rhs.name).append(cacheType, rhs.cacheType).append(authentication, rhs.authentication).append(authorization, rhs.authorization).isEquals();
    }

}
