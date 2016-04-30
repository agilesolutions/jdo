
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Driver {

    @SerializedName("module")
    @Expose
    private String module;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("xa-datasource-class")
    @Expose
    private String xaDatasourceClass;

    /**
     * 
     * @return
     *     The module
     */
    public String getModule() {
        return module;
    }

    /**
     * 
     * @param module
     *     The module
     */
    public void setModule(String module) {
        this.module = module;
    }

    public Driver withModule(String module) {
        this.module = module;
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

    public Driver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The xaDatasourceClass
     */
    public String getXaDatasourceClass() {
        return xaDatasourceClass;
    }

    /**
     * 
     * @param xaDatasourceClass
     *     The xa-datasource-class
     */
    public void setXaDatasourceClass(String xaDatasourceClass) {
        this.xaDatasourceClass = xaDatasourceClass;
    }

    public Driver withXaDatasourceClass(String xaDatasourceClass) {
        this.xaDatasourceClass = xaDatasourceClass;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(module).append(name).append(xaDatasourceClass).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Driver) == false) {
            return false;
        }
        Driver rhs = ((Driver) other);
        return new EqualsBuilder().append(module, rhs.module).append(name, rhs.name).append(xaDatasourceClass, rhs.xaDatasourceClass).isEquals();
    }

}
