
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ProcessId {

    @SerializedName("uuid")
    @Expose
    private String uuid;

    /**
     * 
     * @return
     *     The uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 
     * @param uuid
     *     The uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ProcessId withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uuid).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessId) == false) {
            return false;
        }
        ProcessId rhs = ((ProcessId) other);
        return new EqualsBuilder().append(uuid, rhs.uuid).isEquals();
    }

}
