
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ManagementInterfaces {

    @SerializedName("http-interface")
    @Expose
    private HttpInterface httpInterface;
    @SerializedName("native-interface")
    @Expose
    private NativeInterface nativeInterface;

    /**
     * 
     * @return
     *     The httpInterface
     */
    public HttpInterface getHttpInterface() {
        return httpInterface;
    }

    /**
     * 
     * @param httpInterface
     *     The http-interface
     */
    public void setHttpInterface(HttpInterface httpInterface) {
        this.httpInterface = httpInterface;
    }

    public ManagementInterfaces withHttpInterface(HttpInterface httpInterface) {
        this.httpInterface = httpInterface;
        return this;
    }

    /**
     * 
     * @return
     *     The nativeInterface
     */
    public NativeInterface getNativeInterface() {
        return nativeInterface;
    }

    /**
     * 
     * @param nativeInterface
     *     The native-interface
     */
    public void setNativeInterface(NativeInterface nativeInterface) {
        this.nativeInterface = nativeInterface;
    }

    public ManagementInterfaces withNativeInterface(NativeInterface nativeInterface) {
        this.nativeInterface = nativeInterface;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(httpInterface).append(nativeInterface).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManagementInterfaces) == false) {
            return false;
        }
        ManagementInterfaces rhs = ((ManagementInterfaces) other);
        return new EqualsBuilder().append(httpInterface, rhs.httpInterface).append(nativeInterface, rhs.nativeInterface).isEquals();
    }

}
