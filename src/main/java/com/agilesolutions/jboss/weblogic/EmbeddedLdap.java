
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class EmbeddedLdap {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("credential-encrypted")
    @Expose
    private String credentialEncrypted;

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

    public EmbeddedLdap withName(String name) {
        this.name = name;
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

    public EmbeddedLdap withCredentialEncrypted(String credentialEncrypted) {
        this.credentialEncrypted = credentialEncrypted;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(credentialEncrypted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmbeddedLdap) == false) {
            return false;
        }
        EmbeddedLdap rhs = ((EmbeddedLdap) other);
        return new EqualsBuilder().append(name, rhs.name).append(credentialEncrypted, rhs.credentialEncrypted).isEquals();
    }

}
