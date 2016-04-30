
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class XaPool {

    @SerializedName("use-strict-min")
    @Expose
    private Boolean useStrictMin;

    /**
     * 
     * @return
     *     The useStrictMin
     */
    public Boolean getUseStrictMin() {
        return useStrictMin;
    }

    /**
     * 
     * @param useStrictMin
     *     The use-strict-min
     */
    public void setUseStrictMin(Boolean useStrictMin) {
        this.useStrictMin = useStrictMin;
    }

    public XaPool withUseStrictMin(Boolean useStrictMin) {
        this.useStrictMin = useStrictMin;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(useStrictMin).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XaPool) == false) {
            return false;
        }
        XaPool rhs = ((XaPool) other);
        return new EqualsBuilder().append(useStrictMin, rhs.useStrictMin).isEquals();
    }

}
