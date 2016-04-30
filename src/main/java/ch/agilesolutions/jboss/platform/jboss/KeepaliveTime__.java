
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class KeepaliveTime__ {

    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("time")
    @Expose
    private Integer time;

    /**
     * 
     * @return
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public KeepaliveTime__ withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    public KeepaliveTime__ withTime(Integer time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unit).append(time).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeepaliveTime__) == false) {
            return false;
        }
        KeepaliveTime__ rhs = ((KeepaliveTime__) other);
        return new EqualsBuilder().append(unit, rhs.unit).append(time, rhs.time).isEquals();
    }

}
