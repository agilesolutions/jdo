
package ch.agilesolutions.jboss.platform.jboss;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Profile {

    @SerializedName("subsystem")
    @Expose
    private List<Subsystem> subsystem = new ArrayList<Subsystem>();

    /**
     * 
     * @return
     *     The subsystem
     */
    public List<Subsystem> getSubsystem() {
        return subsystem;
    }

    /**
     * 
     * @param subsystem
     *     The subsystem
     */
    public void setSubsystem(List<Subsystem> subsystem) {
        this.subsystem = subsystem;
    }

    public Profile withSubsystem(List<Subsystem> subsystem) {
        this.subsystem = subsystem;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subsystem).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Profile) == false) {
            return false;
        }
        Profile rhs = ((Profile) other);
        return new EqualsBuilder().append(subsystem, rhs.subsystem).isEquals();
    }

}
