
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Async {

    @SerializedName("thread-pool-name")
    @Expose
    private String threadPoolName;

    /**
     * 
     * @return
     *     The threadPoolName
     */
    public String getThreadPoolName() {
        return threadPoolName;
    }

    /**
     * 
     * @param threadPoolName
     *     The thread-pool-name
     */
    public void setThreadPoolName(String threadPoolName) {
        this.threadPoolName = threadPoolName;
    }

    public Async withThreadPoolName(String threadPoolName) {
        this.threadPoolName = threadPoolName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(threadPoolName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Async) == false) {
            return false;
        }
        Async rhs = ((Async) other);
        return new EqualsBuilder().append(threadPoolName, rhs.threadPoolName).isEquals();
    }

}
