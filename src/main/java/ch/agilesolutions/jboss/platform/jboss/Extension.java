
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Extension {

    @SerializedName("module")
    @Expose
    private String module;

    /**
     * 
     * @return
     *     The module
     */
    public String getModule() {
        return module;
    }

    /**
     * 
     * @param module
     *     The module
     */
    public void setModule(String module) {
        this.module = module;
    }

    public Extension withModule(String module) {
        this.module = module;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(module).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Extension) == false) {
            return false;
        }
        Extension rhs = ((Extension) other);
        return new EqualsBuilder().append(module, rhs.module).isEquals();
    }

}
