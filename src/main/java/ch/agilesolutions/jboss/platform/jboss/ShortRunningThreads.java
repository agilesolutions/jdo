
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ShortRunningThreads {

    @SerializedName("keepalive-time")
    @Expose
    private KeepaliveTime__ keepaliveTime;
    @SerializedName("core-threads")
    @Expose
    private CoreThreads_ coreThreads;
    @SerializedName("max-threads")
    @Expose
    private MaxThreads__ maxThreads;
    @SerializedName("queue-length")
    @Expose
    private QueueLength_ queueLength;

    /**
     * 
     * @return
     *     The keepaliveTime
     */
    public KeepaliveTime__ getKeepaliveTime() {
        return keepaliveTime;
    }

    /**
     * 
     * @param keepaliveTime
     *     The keepalive-time
     */
    public void setKeepaliveTime(KeepaliveTime__ keepaliveTime) {
        this.keepaliveTime = keepaliveTime;
    }

    public ShortRunningThreads withKeepaliveTime(KeepaliveTime__ keepaliveTime) {
        this.keepaliveTime = keepaliveTime;
        return this;
    }

    /**
     * 
     * @return
     *     The coreThreads
     */
    public CoreThreads_ getCoreThreads() {
        return coreThreads;
    }

    /**
     * 
     * @param coreThreads
     *     The core-threads
     */
    public void setCoreThreads(CoreThreads_ coreThreads) {
        this.coreThreads = coreThreads;
    }

    public ShortRunningThreads withCoreThreads(CoreThreads_ coreThreads) {
        this.coreThreads = coreThreads;
        return this;
    }

    /**
     * 
     * @return
     *     The maxThreads
     */
    public MaxThreads__ getMaxThreads() {
        return maxThreads;
    }

    /**
     * 
     * @param maxThreads
     *     The max-threads
     */
    public void setMaxThreads(MaxThreads__ maxThreads) {
        this.maxThreads = maxThreads;
    }

    public ShortRunningThreads withMaxThreads(MaxThreads__ maxThreads) {
        this.maxThreads = maxThreads;
        return this;
    }

    /**
     * 
     * @return
     *     The queueLength
     */
    public QueueLength_ getQueueLength() {
        return queueLength;
    }

    /**
     * 
     * @param queueLength
     *     The queue-length
     */
    public void setQueueLength(QueueLength_ queueLength) {
        this.queueLength = queueLength;
    }

    public ShortRunningThreads withQueueLength(QueueLength_ queueLength) {
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
        if ((other instanceof ShortRunningThreads) == false) {
            return false;
        }
        ShortRunningThreads rhs = ((ShortRunningThreads) other);
        return new EqualsBuilder().append(keepaliveTime, rhs.keepaliveTime).append(coreThreads, rhs.coreThreads).append(maxThreads, rhs.maxThreads).append(queueLength, rhs.queueLength).isEquals();
    }

}
