
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ThreadPools {

    @SerializedName("thread-pool")
    @Expose
    private ThreadPool threadPool;

    /**
     * 
     * @return
     *     The threadPool
     */
    public ThreadPool getThreadPool() {
        return threadPool;
    }

    /**
     * 
     * @param threadPool
     *     The thread-pool
     */
    public void setThreadPool(ThreadPool threadPool) {
        this.threadPool = threadPool;
    }

    public ThreadPools withThreadPool(ThreadPool threadPool) {
        this.threadPool = threadPool;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(threadPool).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThreadPools) == false) {
            return false;
        }
        ThreadPools rhs = ((ThreadPools) other);
        return new EqualsBuilder().append(threadPool, rhs.threadPool).isEquals();
    }

}
