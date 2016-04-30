
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ArchiveValidation {

    @SerializedName("fail-on-warn")
    @Expose
    private Boolean failOnWarn;
    @SerializedName("fail-on-error")
    @Expose
    private Boolean failOnError;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;

    /**
     * 
     * @return
     *     The failOnWarn
     */
    public Boolean getFailOnWarn() {
        return failOnWarn;
    }

    /**
     * 
     * @param failOnWarn
     *     The fail-on-warn
     */
    public void setFailOnWarn(Boolean failOnWarn) {
        this.failOnWarn = failOnWarn;
    }

    public ArchiveValidation withFailOnWarn(Boolean failOnWarn) {
        this.failOnWarn = failOnWarn;
        return this;
    }

    /**
     * 
     * @return
     *     The failOnError
     */
    public Boolean getFailOnError() {
        return failOnError;
    }

    /**
     * 
     * @param failOnError
     *     The fail-on-error
     */
    public void setFailOnError(Boolean failOnError) {
        this.failOnError = failOnError;
    }

    public ArchiveValidation withFailOnError(Boolean failOnError) {
        this.failOnError = failOnError;
        return this;
    }

    /**
     * 
     * @return
     *     The enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     * @param enabled
     *     The enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ArchiveValidation withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(failOnWarn).append(failOnError).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArchiveValidation) == false) {
            return false;
        }
        ArchiveValidation rhs = ((ArchiveValidation) other);
        return new EqualsBuilder().append(failOnWarn, rhs.failOnWarn).append(failOnError, rhs.failOnError).append(enabled, rhs.enabled).isEquals();
    }

}
