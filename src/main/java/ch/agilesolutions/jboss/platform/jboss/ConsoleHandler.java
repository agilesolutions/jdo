
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ConsoleHandler {

    @SerializedName("formatter")
    @Expose
    private Formatter_ formatter;
    @SerializedName("level")
    @Expose
    private Level_ level;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The formatter
     */
    public Formatter_ getFormatter() {
        return formatter;
    }

    /**
     * 
     * @param formatter
     *     The formatter
     */
    public void setFormatter(Formatter_ formatter) {
        this.formatter = formatter;
    }

    public ConsoleHandler withFormatter(Formatter_ formatter) {
        this.formatter = formatter;
        return this;
    }

    /**
     * 
     * @return
     *     The level
     */
    public Level_ getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(Level_ level) {
        this.level = level;
    }

    public ConsoleHandler withLevel(Level_ level) {
        this.level = level;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public ConsoleHandler withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(formatter).append(level).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsoleHandler) == false) {
            return false;
        }
        ConsoleHandler rhs = ((ConsoleHandler) other);
        return new EqualsBuilder().append(formatter, rhs.formatter).append(level, rhs.level).append(name, rhs.name).isEquals();
    }

}
