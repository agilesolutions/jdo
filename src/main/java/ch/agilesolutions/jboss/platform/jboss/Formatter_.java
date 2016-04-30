
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Formatter_ {

    @SerializedName("pattern-formatter")
    @Expose
    private PatternFormatter_ patternFormatter;

    /**
     * 
     * @return
     *     The patternFormatter
     */
    public PatternFormatter_ getPatternFormatter() {
        return patternFormatter;
    }

    /**
     * 
     * @param patternFormatter
     *     The pattern-formatter
     */
    public void setPatternFormatter(PatternFormatter_ patternFormatter) {
        this.patternFormatter = patternFormatter;
    }

    public Formatter_ withPatternFormatter(PatternFormatter_ patternFormatter) {
        this.patternFormatter = patternFormatter;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(patternFormatter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Formatter_) == false) {
            return false;
        }
        Formatter_ rhs = ((Formatter_) other);
        return new EqualsBuilder().append(patternFormatter, rhs.patternFormatter).isEquals();
    }

}
