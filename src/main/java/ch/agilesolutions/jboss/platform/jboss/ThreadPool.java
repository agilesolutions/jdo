
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ThreadPool {

    @SerializedName("keepalive-time")
    @Expose
    private KeepaliveTime keepaliveTime;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("max-threads")
    @Expose
    private MaxThreads maxThreads;

    /**
     * 
     * @return
     *     The keepaliveTime
     */
    public KeepaliveTime getKeepaliveTime() {
        return keepaliveTime;
    }

    /**
     * 
     * @param keepaliveTime
     *     The keepalive-time
     */
    public void setKeepaliveTime(KeepaliveTime keepaliveTime) {
        this.keepaliveTime = keepaliveTime;
    }

    public ThreadPool withKeepaliveTime(KeepaliveTime keepaliveTime) {
        this.keepaliveTime = keepaliveTime;
        return this;
    }

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

    public ThreadPool withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The maxThreads
     */
    public MaxThreads getMaxThreads() {
        return maxThreads;
    }

    /**
     * 
     * @param maxThreads
     *     The max-threads
     */
    public void setMaxThreads(MaxThreads maxThreads) {
        this.maxThreads = maxThreads;
    }

    public ThreadPool withMaxThreads(MaxThreads maxThreads) {
        this.maxThreads = maxThreads;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keepaliveTime).append(name).append(maxThreads).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThreadPool) == false) {
            return false;
        }
        ThreadPool rhs = ((ThreadPool) other);
        return new EqualsBuilder().append(keepaliveTime, rhs.keepaliveTime).append(name, rhs.name).append(maxThreads, rhs.maxThreads).isEquals();
    }

}
