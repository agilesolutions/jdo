
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SmtpServer {

    @SerializedName("outbound-socket-binding-ref")
    @Expose
    private String outboundSocketBindingRef;

    /**
     * 
     * @return
     *     The outboundSocketBindingRef
     */
    public String getOutboundSocketBindingRef() {
        return outboundSocketBindingRef;
    }

    /**
     * 
     * @param outboundSocketBindingRef
     *     The outbound-socket-binding-ref
     */
    public void setOutboundSocketBindingRef(String outboundSocketBindingRef) {
        this.outboundSocketBindingRef = outboundSocketBindingRef;
    }

    public SmtpServer withOutboundSocketBindingRef(String outboundSocketBindingRef) {
        this.outboundSocketBindingRef = outboundSocketBindingRef;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outboundSocketBindingRef).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SmtpServer) == false) {
            return false;
        }
        SmtpServer rhs = ((SmtpServer) other);
        return new EqualsBuilder().append(outboundSocketBindingRef, rhs.outboundSocketBindingRef).isEquals();
    }

}
