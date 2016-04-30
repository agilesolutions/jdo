
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SecRoleMapper {

    @SerializedName("sec:name")
    @Expose
    private String secName;
    @SerializedName("xmlns:xac")
    @Expose
    private String xmlnsXac;
    @SerializedName("xsi:type")
    @Expose
    private String xsiType;

    /**
     * 
     * @return
     *     The secName
     */
    public String getSecName() {
        return secName;
    }

    /**
     * 
     * @param secName
     *     The sec:name
     */
    public void setSecName(String secName) {
        this.secName = secName;
    }

    public SecRoleMapper withSecName(String secName) {
        this.secName = secName;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlnsXac
     */
    public String getXmlnsXac() {
        return xmlnsXac;
    }

    /**
     * 
     * @param xmlnsXac
     *     The xmlns:xac
     */
    public void setXmlnsXac(String xmlnsXac) {
        this.xmlnsXac = xmlnsXac;
    }

    public SecRoleMapper withXmlnsXac(String xmlnsXac) {
        this.xmlnsXac = xmlnsXac;
        return this;
    }

    /**
     * 
     * @return
     *     The xsiType
     */
    public String getXsiType() {
        return xsiType;
    }

    /**
     * 
     * @param xsiType
     *     The xsi:type
     */
    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    public SecRoleMapper withXsiType(String xsiType) {
        this.xsiType = xsiType;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secName).append(xmlnsXac).append(xsiType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecRoleMapper) == false) {
            return false;
        }
        SecRoleMapper rhs = ((SecRoleMapper) other);
        return new EqualsBuilder().append(secName, rhs.secName).append(xmlnsXac, rhs.xmlnsXac).append(xsiType, rhs.xsiType).isEquals();
    }

}
