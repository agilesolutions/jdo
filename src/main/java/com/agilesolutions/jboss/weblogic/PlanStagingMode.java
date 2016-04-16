
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PlanStagingMode {

    @SerializedName("xsi:nil")
    @Expose
    private Boolean xsiNil;

    /**
     * 
     * @return
     *     The xsiNil
     */
    public Boolean getXsiNil() {
        return xsiNil;
    }

    /**
     * 
     * @param xsiNil
     *     The xsi:nil
     */
    public void setXsiNil(Boolean xsiNil) {
        this.xsiNil = xsiNil;
    }

    public PlanStagingMode withXsiNil(Boolean xsiNil) {
        this.xsiNil = xsiNil;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(xsiNil).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlanStagingMode) == false) {
            return false;
        }
        PlanStagingMode rhs = ((PlanStagingMode) other);
        return new EqualsBuilder().append(xsiNil, rhs.xsiNil).isEquals();
    }

}
