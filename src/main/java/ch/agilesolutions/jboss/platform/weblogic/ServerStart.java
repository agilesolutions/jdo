
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ServerStart {

    @SerializedName("password-encrypted")
    @Expose
    private String passwordEncrypted;
    @SerializedName("class-path")
    @Expose
    private String classPath;
    @SerializedName("arguments")
    @Expose
    private String arguments;
    @SerializedName("username")
    @Expose
    private String username;

    /**
     * 
     * @return
     *     The passwordEncrypted
     */
    public String getPasswordEncrypted() {
        return passwordEncrypted;
    }

    /**
     * 
     * @param passwordEncrypted
     *     The password-encrypted
     */
    public void setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }

    public ServerStart withPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
        return this;
    }

    /**
     * 
     * @return
     *     The classPath
     */
    public String getClassPath() {
        return classPath;
    }

    /**
     * 
     * @param classPath
     *     The class-path
     */
    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public ServerStart withClassPath(String classPath) {
        this.classPath = classPath;
        return this;
    }

    /**
     * 
     * @return
     *     The arguments
     */
    public String getArguments() {
        return arguments;
    }

    /**
     * 
     * @param arguments
     *     The arguments
     */
    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public ServerStart withArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public ServerStart withUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(passwordEncrypted).append(classPath).append(arguments).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServerStart) == false) {
            return false;
        }
        ServerStart rhs = ((ServerStart) other);
        return new EqualsBuilder().append(passwordEncrypted, rhs.passwordEncrypted).append(classPath, rhs.classPath).append(arguments, rhs.arguments).append(username, rhs.username).isEquals();
    }

}
