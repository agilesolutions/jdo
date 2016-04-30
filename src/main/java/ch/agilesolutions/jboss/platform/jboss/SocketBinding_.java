
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SocketBinding_ {

    @SerializedName("http")
    @Expose
    private String http;

    /**
     * 
     * @return
     *     The http
     */
    public String getHttp() {
        return http;
    }

    /**
     * 
     * @param http
     *     The http
     */
    public void setHttp(String http) {
        this.http = http;
    }

    public SocketBinding_ withHttp(String http) {
        this.http = http;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(http).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SocketBinding_) == false) {
            return false;
        }
        SocketBinding_ rhs = ((SocketBinding_) other);
        return new EqualsBuilder().append(http, rhs.http).isEquals();
    }

}
