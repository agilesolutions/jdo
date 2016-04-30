
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Module {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slot")
    @Expose
    private String slot;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Module withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The slot
     */
    public String getSlot() {
        return slot;
    }

    /**
     * 
     * @param slot
     *     The slot
     */
    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Module withSlot(String slot) {
        this.slot = slot;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(slot).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Module) == false) {
            return false;
        }
        Module rhs = ((Module) other);
        return new EqualsBuilder().append(name, rhs.name).append(slot, rhs.slot).isEquals();
    }

}
