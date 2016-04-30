
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LongRunningThreads {

    @SerializedName("keepalive-time")
    @Expose
    private KeepaliveTime_ keepaliveTime;
    @SerializedName("core-threads")
    @Expose
    private CoreThreads coreThreads;
    @SerializedName("max-threads")
    @Expose
    private MaxThreads_ maxThreads;
    @SerializedName("queue-length")
    @Expose
    private QueueLength queueLength;

    /**
     * 
     * @return
     *     The keepaliveTime
     */
    public KeepaliveTime_ getKeepaliveTime() {
        return keepaliveTime;
    }

    /**
     * 
     * @param keepaliveTime
     *     The keepalive-time
     */
    public void setKeepaliveTime(KeepaliveTime_ keepaliveTime) {
        this.keepaliveTime = keepaliveTime;
    }

    public LongRunningThreads withKeepaliveTime(KeepaliveTime_ keepaliveTime) {
        this.keepaliveTime = keepaliveTime;
        return this;
    }

    /**
     * 
     * @return
     *     The coreThreads
     */
    public CoreThreads getCoreThreads() {
        return coreThreads;
    }

    /**
     * 
     * @param coreThreads
     *     The core-threads
     */
    public void setCoreThreads(CoreThreads coreThreads) {
        this.coreThreads = coreThreads;
    }

    public LongRunningThreads withCoreThreads(CoreThreads coreThreads) {
        this.coreThreads = coreThreads;
        return this;
    }

    /**
     * 
     * @return
     *     The maxThreads
     */
    public MaxThreads_ getMaxThreads() {
        return maxThreads;
    }

    /**
     * 
     * @param maxThreads
     *     The max-threads
     */
    public void setMaxThreads(MaxThreads_ maxThreads) {
        this.maxThreads = maxThreads;
    }

    public LongRunningThreads withMaxThreads(MaxThreads_ maxThreads) {
        this.maxThreads = maxThreads;
        return this;
    }

    /**
     * 
     * @return
     *     The queueLength
     */
    public QueueLength getQueueLength() {
        return queueLength;
    }

    /**
     * 
     * @param queueLength
     *     The queue-length
     */
    public void setQueueLength(QueueLength queueLength) {
        this.queueLength = queueLength;
    }

    public LongRunningThreads withQueueLength(QueueLength queueLength) {
        this.queueLength = queueLength;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keepaliveTime).append(coreThreads).append(maxThreads).append(queueLength).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LongRunningThreads) == false) {
            return false;
        }
        LongRunningThreads rhs = ((LongRunningThreads) other);
        return new EqualsBuilder().append(keepaliveTime, rhs.keepaliveTime).append(coreThreads, rhs.coreThreads).append(maxThreads, rhs.maxThreads).append(queueLength, rhs.queueLength).isEquals();
    }

}
