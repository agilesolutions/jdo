
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
public class Datasources {

    @SerializedName("datasource")
    @Expose
    private Datasource datasource;
    @SerializedName("xa-datasource")
    @Expose
    private List<XaDatasource> xaDatasource = new ArrayList<XaDatasource>();
    @SerializedName("drivers")
    @Expose
    private Drivers drivers;

    /**
     * 
     * @return
     *     The datasource
     */
    public Datasource getDatasource() {
        return datasource;
    }

    /**
     * 
     * @param datasource
     *     The datasource
     */
    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }

    public Datasources withDatasource(Datasource datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * 
     * @return
     *     The xaDatasource
     */
    public List<XaDatasource> getXaDatasource() {
        return xaDatasource;
    }

    /**
     * 
     * @param xaDatasource
     *     The xa-datasource
     */
    public void setXaDatasource(List<XaDatasource> xaDatasource) {
        this.xaDatasource = xaDatasource;
    }

    public Datasources withXaDatasource(List<XaDatasource> xaDatasource) {
        this.xaDatasource = xaDatasource;
        return this;
    }

    /**
     * 
     * @return
     *     The drivers
     */
    public Drivers getDrivers() {
        return drivers;
    }

    /**
     * 
     * @param drivers
     *     The drivers
     */
    public void setDrivers(Drivers drivers) {
        this.drivers = drivers;
    }

    public Datasources withDrivers(Drivers drivers) {
        this.drivers = drivers;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(datasource).append(xaDatasource).append(drivers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datasources) == false) {
            return false;
        }
        Datasources rhs = ((Datasources) other);
        return new EqualsBuilder().append(datasource, rhs.datasource).append(xaDatasource, rhs.xaDatasource).append(drivers, rhs.drivers).isEquals();
    }

}
