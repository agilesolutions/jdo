
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RecoveryEnvironment {

    @SerializedName("socket-binding")
    @Expose
    private String socketBinding;
    @SerializedName("status-socket-binding")
    @Expose
    private String statusSocketBinding;

    /**
     * 
     * @return
     *     The socketBinding
     */
    public String getSocketBinding() {
        return socketBinding;
    }

    /**
     * 
     * @param socketBinding
     *     The socket-binding
     */
    public void setSocketBinding(String socketBinding) {
        this.socketBinding = socketBinding;
    }

    public RecoveryEnvironment withSocketBinding(String socketBinding) {
        this.socketBinding = socketBinding;
        return this;
    }

    /**
     * 
     * @return
     *     The statusSocketBinding
     */
    public String getStatusSocketBinding() {
        return statusSocketBinding;
    }

    /**
     * 
     * @param statusSocketBinding
     *     The status-socket-binding
     */
    public void setStatusSocketBinding(String statusSocketBinding) {
        this.statusSocketBinding = statusSocketBinding;
    }

    public RecoveryEnvironment withStatusSocketBinding(String statusSocketBinding) {
        this.statusSocketBinding = statusSocketBinding;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(socketBinding).append(statusSocketBinding).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecoveryEnvironment) == false) {
            return false;
        }
        RecoveryEnvironment rhs = ((RecoveryEnvironment) other);
        return new EqualsBuilder().append(socketBinding, rhs.socketBinding).append(statusSocketBinding, rhs.statusSocketBinding).isEquals();
    }

}
