
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Validation {

    @SerializedName("use-fast-fail")
    @Expose
    private Boolean useFastFail;
    @SerializedName("background-validation")
    @Expose
    private Boolean backgroundValidation;

    /**
     * 
     * @return
     *     The useFastFail
     */
    public Boolean getUseFastFail() {
        return useFastFail;
    }

    /**
     * 
     * @param useFastFail
     *     The use-fast-fail
     */
    public void setUseFastFail(Boolean useFastFail) {
        this.useFastFail = useFastFail;
    }

    public Validation withUseFastFail(Boolean useFastFail) {
        this.useFastFail = useFastFail;
        return this;
    }

    /**
     * 
     * @return
     *     The backgroundValidation
     */
    public Boolean getBackgroundValidation() {
        return backgroundValidation;
    }

    /**
     * 
     * @param backgroundValidation
     *     The background-validation
     */
    public void setBackgroundValidation(Boolean backgroundValidation) {
        this.backgroundValidation = backgroundValidation;
    }

    public Validation withBackgroundValidation(Boolean backgroundValidation) {
        this.backgroundValidation = backgroundValidation;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(useFastFail).append(backgroundValidation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Validation) == false) {
            return false;
        }
        Validation rhs = ((Validation) other);
        return new EqualsBuilder().append(useFastFail, rhs.useFastFail).append(backgroundValidation, rhs.backgroundValidation).isEquals();
    }

}
