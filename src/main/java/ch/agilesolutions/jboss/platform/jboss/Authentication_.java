
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Authentication_ {

    @SerializedName("login-module")
    @Expose
    private LoginModule loginModule;

    /**
     * 
     * @return
     *     The loginModule
     */
    public LoginModule getLoginModule() {
        return loginModule;
    }

    /**
     * 
     * @param loginModule
     *     The login-module
     */
    public void setLoginModule(LoginModule loginModule) {
        this.loginModule = loginModule;
    }

    public Authentication_ withLoginModule(LoginModule loginModule) {
        this.loginModule = loginModule;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(loginModule).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Authentication_) == false) {
            return false;
        }
        Authentication_ rhs = ((Authentication_) other);
        return new EqualsBuilder().append(loginModule, rhs.loginModule).isEquals();
    }

}
