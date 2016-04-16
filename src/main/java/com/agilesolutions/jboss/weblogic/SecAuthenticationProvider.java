
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SecAuthenticationProvider {

    @SerializedName("sec:name")
    @Expose
    private String secName;
    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("sec:control-flag")
    @Expose
    private String secControlFlag;
    @SerializedName("sec:active-type")
    @Expose
    private String secActiveType;
    @SerializedName("ext:datasource-jndi-name")
    @Expose
    private String extDatasourceJndiName;
    @SerializedName("xmlns:ext")
    @Expose
    private String xmlnsExt;

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

    public SecAuthenticationProvider withSecName(String secName) {
        this.secName = secName;
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

    public SecAuthenticationProvider withXsiType(String xsiType) {
        this.xsiType = xsiType;
        return this;
    }

    /**
     * 
     * @return
     *     The secControlFlag
     */
    public String getSecControlFlag() {
        return secControlFlag;
    }

    /**
     * 
     * @param secControlFlag
     *     The sec:control-flag
     */
    public void setSecControlFlag(String secControlFlag) {
        this.secControlFlag = secControlFlag;
    }

    public SecAuthenticationProvider withSecControlFlag(String secControlFlag) {
        this.secControlFlag = secControlFlag;
        return this;
    }

    /**
     * 
     * @return
     *     The secActiveType
     */
    public String getSecActiveType() {
        return secActiveType;
    }

    /**
     * 
     * @param secActiveType
     *     The sec:active-type
     */
    public void setSecActiveType(String secActiveType) {
        this.secActiveType = secActiveType;
    }

    public SecAuthenticationProvider withSecActiveType(String secActiveType) {
        this.secActiveType = secActiveType;
        return this;
    }

    /**
     * 
     * @return
     *     The extDatasourceJndiName
     */
    public String getExtDatasourceJndiName() {
        return extDatasourceJndiName;
    }

    /**
     * 
     * @param extDatasourceJndiName
     *     The ext:datasource-jndi-name
     */
    public void setExtDatasourceJndiName(String extDatasourceJndiName) {
        this.extDatasourceJndiName = extDatasourceJndiName;
    }

    public SecAuthenticationProvider withExtDatasourceJndiName(String extDatasourceJndiName) {
        this.extDatasourceJndiName = extDatasourceJndiName;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlnsExt
     */
    public String getXmlnsExt() {
        return xmlnsExt;
    }

    /**
     * 
     * @param xmlnsExt
     *     The xmlns:ext
     */
    public void setXmlnsExt(String xmlnsExt) {
        this.xmlnsExt = xmlnsExt;
    }

    public SecAuthenticationProvider withXmlnsExt(String xmlnsExt) {
        this.xmlnsExt = xmlnsExt;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secName).append(xsiType).append(secControlFlag).append(secActiveType).append(extDatasourceJndiName).append(xmlnsExt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecAuthenticationProvider) == false) {
            return false;
        }
        SecAuthenticationProvider rhs = ((SecAuthenticationProvider) other);
        return new EqualsBuilder().append(secName, rhs.secName).append(xsiType, rhs.xsiType).append(secControlFlag, rhs.secControlFlag).append(secActiveType, rhs.secActiveType).append(extDatasourceJndiName, rhs.extDatasourceJndiName).append(xmlnsExt, rhs.xmlnsExt).isEquals();
    }

}
