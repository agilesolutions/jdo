
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SecurityConfiguration {

    @SerializedName("default-realm")
    @Expose
    private String defaultRealm;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("node-manager-username")
    @Expose
    private String nodeManagerUsername;
    @SerializedName("realm")
    @Expose
    private Realm realm;
    @SerializedName("credential-encrypted")
    @Expose
    private String credentialEncrypted;
    @SerializedName("node-manager-password-encrypted")
    @Expose
    private String nodeManagerPasswordEncrypted;

    /**
     * 
     * @return
     *     The defaultRealm
     */
    public String getDefaultRealm() {
        return defaultRealm;
    }

    /**
     * 
     * @param defaultRealm
     *     The default-realm
     */
    public void setDefaultRealm(String defaultRealm) {
        this.defaultRealm = defaultRealm;
    }

    public SecurityConfiguration withDefaultRealm(String defaultRealm) {
        this.defaultRealm = defaultRealm;
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

    public SecurityConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The nodeManagerUsername
     */
    public String getNodeManagerUsername() {
        return nodeManagerUsername;
    }

    /**
     * 
     * @param nodeManagerUsername
     *     The node-manager-username
     */
    public void setNodeManagerUsername(String nodeManagerUsername) {
        this.nodeManagerUsername = nodeManagerUsername;
    }

    public SecurityConfiguration withNodeManagerUsername(String nodeManagerUsername) {
        this.nodeManagerUsername = nodeManagerUsername;
        return this;
    }

    /**
     * 
     * @return
     *     The realm
     */
    public Realm getRealm() {
        return realm;
    }

    /**
     * 
     * @param realm
     *     The realm
     */
    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public SecurityConfiguration withRealm(Realm realm) {
        this.realm = realm;
        return this;
    }

    /**
     * 
     * @return
     *     The credentialEncrypted
     */
    public String getCredentialEncrypted() {
        return credentialEncrypted;
    }

    /**
     * 
     * @param credentialEncrypted
     *     The credential-encrypted
     */
    public void setCredentialEncrypted(String credentialEncrypted) {
        this.credentialEncrypted = credentialEncrypted;
    }

    public SecurityConfiguration withCredentialEncrypted(String credentialEncrypted) {
        this.credentialEncrypted = credentialEncrypted;
        return this;
    }

    /**
     * 
     * @return
     *     The nodeManagerPasswordEncrypted
     */
    public String getNodeManagerPasswordEncrypted() {
        return nodeManagerPasswordEncrypted;
    }

    /**
     * 
     * @param nodeManagerPasswordEncrypted
     *     The node-manager-password-encrypted
     */
    public void setNodeManagerPasswordEncrypted(String nodeManagerPasswordEncrypted) {
        this.nodeManagerPasswordEncrypted = nodeManagerPasswordEncrypted;
    }

    public SecurityConfiguration withNodeManagerPasswordEncrypted(String nodeManagerPasswordEncrypted) {
        this.nodeManagerPasswordEncrypted = nodeManagerPasswordEncrypted;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultRealm).append(name).append(nodeManagerUsername).append(realm).append(credentialEncrypted).append(nodeManagerPasswordEncrypted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityConfiguration) == false) {
            return false;
        }
        SecurityConfiguration rhs = ((SecurityConfiguration) other);
        return new EqualsBuilder().append(defaultRealm, rhs.defaultRealm).append(name, rhs.name).append(nodeManagerUsername, rhs.nodeManagerUsername).append(realm, rhs.realm).append(credentialEncrypted, rhs.credentialEncrypted).append(nodeManagerPasswordEncrypted, rhs.nodeManagerPasswordEncrypted).isEquals();
    }

}
