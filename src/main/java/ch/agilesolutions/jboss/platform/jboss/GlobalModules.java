
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GlobalModules {

    @SerializedName("module")
    @Expose
    private Module module;

    /**
     * 
     * @return
     *     The module
     */
    public Module getModule() {
        return module;
    }

    /**
     * 
     * @param module
     *     The module
     */
    public void setModule(Module module) {
        this.module = module;
    }

    public GlobalModules withModule(Module module) {
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
        if ((other instanceof GlobalModules) == false) {
            return false;
        }
        GlobalModules rhs = ((GlobalModules) other);
        return new EqualsBuilder().append(module, rhs.module).isEquals();
    }

}
