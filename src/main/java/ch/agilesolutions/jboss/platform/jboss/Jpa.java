
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Jpa {

    @SerializedName("default-extended-persistence-inheritance")
    @Expose
    private String defaultExtendedPersistenceInheritance;
    @SerializedName("default-datasource")
    @Expose
    private String defaultDatasource;

    /**
     * 
     * @return
     *     The defaultExtendedPersistenceInheritance
     */
    public String getDefaultExtendedPersistenceInheritance() {
        return defaultExtendedPersistenceInheritance;
    }

    /**
     * 
     * @param defaultExtendedPersistenceInheritance
     *     The default-extended-persistence-inheritance
     */
    public void setDefaultExtendedPersistenceInheritance(String defaultExtendedPersistenceInheritance) {
        this.defaultExtendedPersistenceInheritance = defaultExtendedPersistenceInheritance;
    }

    public Jpa withDefaultExtendedPersistenceInheritance(String defaultExtendedPersistenceInheritance) {
        this.defaultExtendedPersistenceInheritance = defaultExtendedPersistenceInheritance;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultDatasource
     */
    public String getDefaultDatasource() {
        return defaultDatasource;
    }

    /**
     * 
     * @param defaultDatasource
     *     The default-datasource
     */
    public void setDefaultDatasource(String defaultDatasource) {
        this.defaultDatasource = defaultDatasource;
    }

    public Jpa withDefaultDatasource(String defaultDatasource) {
        this.defaultDatasource = defaultDatasource;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultExtendedPersistenceInheritance).append(defaultDatasource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Jpa) == false) {
            return false;
        }
        Jpa rhs = ((Jpa) other);
        return new EqualsBuilder().append(defaultExtendedPersistenceInheritance, rhs.defaultExtendedPersistenceInheritance).append(defaultDatasource, rhs.defaultDatasource).isEquals();
    }

}
