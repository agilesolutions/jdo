
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class CoreEnvironment {

    @SerializedName("process-id")
    @Expose
    private ProcessId processId;

    /**
     * 
     * @return
     *     The processId
     */
    public ProcessId getProcessId() {
        return processId;
    }

    /**
     * 
     * @param processId
     *     The process-id
     */
    public void setProcessId(ProcessId processId) {
        this.processId = processId;
    }

    public CoreEnvironment withProcessId(ProcessId processId) {
        this.processId = processId;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(processId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoreEnvironment) == false) {
            return false;
        }
        CoreEnvironment rhs = ((CoreEnvironment) other);
        return new EqualsBuilder().append(processId, rhs.processId).isEquals();
    }

}
