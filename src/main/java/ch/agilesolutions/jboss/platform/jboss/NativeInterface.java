
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class NativeInterface {

    @SerializedName("socket-binding")
    @Expose
    private SocketBinding__ socketBinding;
    @SerializedName("security-realm")
    @Expose
    private String securityRealm;

    /**
     * 
     * @return
     *     The socketBinding
     */
    public SocketBinding__ getSocketBinding() {
        return socketBinding;
    }

    /**
     * 
     * @param socketBinding
     *     The socket-binding
     */
    public void setSocketBinding(SocketBinding__ socketBinding) {
        this.socketBinding = socketBinding;
    }

    public NativeInterface withSocketBinding(SocketBinding__ socketBinding) {
        this.socketBinding = socketBinding;
        return this;
    }

    /**
     * 
     * @return
     *     The securityRealm
     */
    public String getSecurityRealm() {
        return securityRealm;
    }

    /**
     * 
     * @param securityRealm
     *     The security-realm
     */
    public void setSecurityRealm(String securityRealm) {
        this.securityRealm = securityRealm;
    }

    public NativeInterface withSecurityRealm(String securityRealm) {
        this.securityRealm = securityRealm;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(socketBinding).append(securityRealm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NativeInterface) == false) {
            return false;
        }
        NativeInterface rhs = ((NativeInterface) other);
        return new EqualsBuilder().append(socketBinding, rhs.socketBinding).append(securityRealm, rhs.securityRealm).isEquals();
    }

}
