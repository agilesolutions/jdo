
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RootLogger {

    @SerializedName("level")
    @Expose
    private Level___ level;
    @SerializedName("handlers")
    @Expose
    private Handlers_ handlers;

    /**
     * 
     * @return
     *     The level
     */
    public Level___ getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(Level___ level) {
        this.level = level;
    }

    public RootLogger withLevel(Level___ level) {
        this.level = level;
        return this;
    }

    /**
     * 
     * @return
     *     The handlers
     */
    public Handlers_ getHandlers() {
        return handlers;
    }

    /**
     * 
     * @param handlers
     *     The handlers
     */
    public void setHandlers(Handlers_ handlers) {
        this.handlers = handlers;
    }

    public RootLogger withHandlers(Handlers_ handlers) {
        this.handlers = handlers;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(level).append(handlers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RootLogger) == false) {
            return false;
        }
        RootLogger rhs = ((RootLogger) other);
        return new EqualsBuilder().append(level, rhs.level).append(handlers, rhs.handlers).isEquals();
    }

}
