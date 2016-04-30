
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class StrictMaxPool {

    @SerializedName("max-pool-size")
    @Expose
    private Integer maxPoolSize;
    @SerializedName("instance-acquisition-timeout")
    @Expose
    private Integer instanceAcquisitionTimeout;
    @SerializedName("instance-acquisition-timeout-unit")
    @Expose
    private String instanceAcquisitionTimeoutUnit;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The maxPoolSize
     */
    public Integer getMaxPoolSize() {
        return maxPoolSize;
    }

    /**
     * 
     * @param maxPoolSize
     *     The max-pool-size
     */
    public void setMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public StrictMaxPool withMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        return this;
    }

    /**
     * 
     * @return
     *     The instanceAcquisitionTimeout
     */
    public Integer getInstanceAcquisitionTimeout() {
        return instanceAcquisitionTimeout;
    }

    /**
     * 
     * @param instanceAcquisitionTimeout
     *     The instance-acquisition-timeout
     */
    public void setInstanceAcquisitionTimeout(Integer instanceAcquisitionTimeout) {
        this.instanceAcquisitionTimeout = instanceAcquisitionTimeout;
    }

    public StrictMaxPool withInstanceAcquisitionTimeout(Integer instanceAcquisitionTimeout) {
        this.instanceAcquisitionTimeout = instanceAcquisitionTimeout;
        return this;
    }

    /**
     * 
     * @return
     *     The instanceAcquisitionTimeoutUnit
     */
    public String getInstanceAcquisitionTimeoutUnit() {
        return instanceAcquisitionTimeoutUnit;
    }

    /**
     * 
     * @param instanceAcquisitionTimeoutUnit
     *     The instance-acquisition-timeout-unit
     */
    public void setInstanceAcquisitionTimeoutUnit(String instanceAcquisitionTimeoutUnit) {
        this.instanceAcquisitionTimeoutUnit = instanceAcquisitionTimeoutUnit;
    }

    public StrictMaxPool withInstanceAcquisitionTimeoutUnit(String instanceAcquisitionTimeoutUnit) {
        this.instanceAcquisitionTimeoutUnit = instanceAcquisitionTimeoutUnit;
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

    public StrictMaxPool withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxPoolSize).append(instanceAcquisitionTimeout).append(instanceAcquisitionTimeoutUnit).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StrictMaxPool) == false) {
            return false;
        }
        StrictMaxPool rhs = ((StrictMaxPool) other);
        return new EqualsBuilder().append(maxPoolSize, rhs.maxPoolSize).append(instanceAcquisitionTimeout, rhs.instanceAcquisitionTimeout).append(instanceAcquisitionTimeoutUnit, rhs.instanceAcquisitionTimeoutUnit).append(name, rhs.name).isEquals();
    }

}
