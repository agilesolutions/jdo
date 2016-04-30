
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Security__ {

    @SerializedName("application")
    @Expose
    private String application;

    /**
     * 
     * @return
     *     The application
     */
    public String getApplication() {
        return application;
    }

    /**
     * 
     * @param application
     *     The application
     */
    public void setApplication(String application) {
        this.application = application;
    }

    public Security__ withApplication(String application) {
        this.application = application;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(application).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Security__) == false) {
            return false;
        }
        Security__ rhs = ((Security__) other);
        return new EqualsBuilder().append(application, rhs.application).isEquals();
    }

}
