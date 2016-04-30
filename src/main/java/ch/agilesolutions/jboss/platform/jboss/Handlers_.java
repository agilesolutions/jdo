
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Handlers_ {

    @SerializedName("handler")
    @Expose
    private Handler_ handler;

    /**
     * 
     * @return
     *     The handler
     */
    public Handler_ getHandler() {
        return handler;
    }

    /**
     * 
     * @param handler
     *     The handler
     */
    public void setHandler(Handler_ handler) {
        this.handler = handler;
    }

    public Handlers_ withHandler(Handler_ handler) {
        this.handler = handler;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(handler).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Handlers_) == false) {
            return false;
        }
        Handlers_ rhs = ((Handlers_) other);
        return new EqualsBuilder().append(handler, rhs.handler).isEquals();
    }

}
