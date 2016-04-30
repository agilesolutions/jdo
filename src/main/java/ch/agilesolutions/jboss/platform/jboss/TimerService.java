
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class TimerService {

    @SerializedName("thread-pool-name")
    @Expose
    private String threadPoolName;
    @SerializedName("default-data-store")
    @Expose
    private String defaultDataStore;
    @SerializedName("data-stores")
    @Expose
    private DataStores dataStores;

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

    public TimerService withThreadPoolName(String threadPoolName) {
        this.threadPoolName = threadPoolName;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultDataStore
     */
    public String getDefaultDataStore() {
        return defaultDataStore;
    }

    /**
     * 
     * @param defaultDataStore
     *     The default-data-store
     */
    public void setDefaultDataStore(String defaultDataStore) {
        this.defaultDataStore = defaultDataStore;
    }

    public TimerService withDefaultDataStore(String defaultDataStore) {
        this.defaultDataStore = defaultDataStore;
        return this;
    }

    /**
     * 
     * @return
     *     The dataStores
     */
    public DataStores getDataStores() {
        return dataStores;
    }

    /**
     * 
     * @param dataStores
     *     The data-stores
     */
    public void setDataStores(DataStores dataStores) {
        this.dataStores = dataStores;
    }

    public TimerService withDataStores(DataStores dataStores) {
        this.dataStores = dataStores;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(threadPoolName).append(defaultDataStore).append(dataStores).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimerService) == false) {
            return false;
        }
        TimerService rhs = ((TimerService) other);
        return new EqualsBuilder().append(threadPoolName, rhs.threadPoolName).append(defaultDataStore, rhs.defaultDataStore).append(dataStores, rhs.dataStores).isEquals();
    }

}
