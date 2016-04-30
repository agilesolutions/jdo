
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DefaultWorkmanager {

    @SerializedName("long-running-threads")
    @Expose
    private LongRunningThreads longRunningThreads;
    @SerializedName("short-running-threads")
    @Expose
    private ShortRunningThreads shortRunningThreads;

    /**
     * 
     * @return
     *     The longRunningThreads
     */
    public LongRunningThreads getLongRunningThreads() {
        return longRunningThreads;
    }

    /**
     * 
     * @param longRunningThreads
     *     The long-running-threads
     */
    public void setLongRunningThreads(LongRunningThreads longRunningThreads) {
        this.longRunningThreads = longRunningThreads;
    }

    public DefaultWorkmanager withLongRunningThreads(LongRunningThreads longRunningThreads) {
        this.longRunningThreads = longRunningThreads;
        return this;
    }

    /**
     * 
     * @return
     *     The shortRunningThreads
     */
    public ShortRunningThreads getShortRunningThreads() {
        return shortRunningThreads;
    }

    /**
     * 
     * @param shortRunningThreads
     *     The short-running-threads
     */
    public void setShortRunningThreads(ShortRunningThreads shortRunningThreads) {
        this.shortRunningThreads = shortRunningThreads;
    }

    public DefaultWorkmanager withShortRunningThreads(ShortRunningThreads shortRunningThreads) {
        this.shortRunningThreads = shortRunningThreads;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(longRunningThreads).append(shortRunningThreads).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultWorkmanager) == false) {
            return false;
        }
        DefaultWorkmanager rhs = ((DefaultWorkmanager) other);
        return new EqualsBuilder().append(longRunningThreads, rhs.longRunningThreads).append(shortRunningThreads, rhs.shortRunningThreads).isEquals();
    }

}
