
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Logger {

    @SerializedName("level")
    @Expose
    private Level__ level;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("handlers")
    @Expose
    private Handlers handlers;
    @SerializedName("use-parent-handlers")
    @Expose
    private Boolean useParentHandlers;

    /**
     * 
     * @return
     *     The level
     */
    public Level__ getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(Level__ level) {
        this.level = level;
    }

    public Logger withLevel(Level__ level) {
        this.level = level;
        return this;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    public Logger withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 
     * @return
     *     The handlers
     */
    public Handlers getHandlers() {
        return handlers;
    }

    /**
     * 
     * @param handlers
     *     The handlers
     */
    public void setHandlers(Handlers handlers) {
        this.handlers = handlers;
    }

    public Logger withHandlers(Handlers handlers) {
        this.handlers = handlers;
        return this;
    }

    /**
     * 
     * @return
     *     The useParentHandlers
     */
    public Boolean getUseParentHandlers() {
        return useParentHandlers;
    }

    /**
     * 
     * @param useParentHandlers
     *     The use-parent-handlers
     */
    public void setUseParentHandlers(Boolean useParentHandlers) {
        this.useParentHandlers = useParentHandlers;
    }

    public Logger withUseParentHandlers(Boolean useParentHandlers) {
        this.useParentHandlers = useParentHandlers;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(level).append(category).append(handlers).append(useParentHandlers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Logger) == false) {
            return false;
        }
        Logger rhs = ((Logger) other);
        return new EqualsBuilder().append(level, rhs.level).append(category, rhs.category).append(handlers, rhs.handlers).append(useParentHandlers, rhs.useParentHandlers).isEquals();
    }

}
