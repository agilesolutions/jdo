
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PatternFormatter {

    @SerializedName("pattern")
    @Expose
    private String pattern;

    /**
     * 
     * @return
     *     The pattern
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * 
     * @param pattern
     *     The pattern
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public PatternFormatter withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pattern).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatternFormatter) == false) {
            return false;
        }
        PatternFormatter rhs = ((PatternFormatter) other);
        return new EqualsBuilder().append(pattern, rhs.pattern).isEquals();
    }

}
