
package ch.agilesolutions.jboss.platform.jboss;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Drivers {

    @SerializedName("driver")
    @Expose
    private List<Driver> driver = new ArrayList<Driver>();

    /**
     * 
     * @return
     *     The driver
     */
    public List<Driver> getDriver() {
        return driver;
    }

    /**
     * 
     * @param driver
     *     The driver
     */
    public void setDriver(List<Driver> driver) {
        this.driver = driver;
    }

    public Drivers withDriver(List<Driver> driver) {
        this.driver = driver;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(driver).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Drivers) == false) {
            return false;
        }
        Drivers rhs = ((Drivers) other);
        return new EqualsBuilder().append(driver, rhs.driver).isEquals();
    }

}
