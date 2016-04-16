
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SecPasswordValidator {

    @SerializedName("sec:name")
    @Expose
    private String secName;
    @SerializedName("pas:min-password-length")
    @Expose
    private Integer pasMinPasswordLength;
    @SerializedName("pas:min-numeric-or-special-characters")
    @Expose
    private Integer pasMinNumericOrSpecialCharacters;
    @SerializedName("xsi:type")
    @Expose
    private String xsiType;
    @SerializedName("xmlns:pas")
    @Expose
    private String xmlnsPas;

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

    public SecPasswordValidator withSecName(String secName) {
        this.secName = secName;
        return this;
    }

    /**
     * 
     * @return
     *     The pasMinPasswordLength
     */
    public Integer getPasMinPasswordLength() {
        return pasMinPasswordLength;
    }

    /**
     * 
     * @param pasMinPasswordLength
     *     The pas:min-password-length
     */
    public void setPasMinPasswordLength(Integer pasMinPasswordLength) {
        this.pasMinPasswordLength = pasMinPasswordLength;
    }

    public SecPasswordValidator withPasMinPasswordLength(Integer pasMinPasswordLength) {
        this.pasMinPasswordLength = pasMinPasswordLength;
        return this;
    }

    /**
     * 
     * @return
     *     The pasMinNumericOrSpecialCharacters
     */
    public Integer getPasMinNumericOrSpecialCharacters() {
        return pasMinNumericOrSpecialCharacters;
    }

    /**
     * 
     * @param pasMinNumericOrSpecialCharacters
     *     The pas:min-numeric-or-special-characters
     */
    public void setPasMinNumericOrSpecialCharacters(Integer pasMinNumericOrSpecialCharacters) {
        this.pasMinNumericOrSpecialCharacters = pasMinNumericOrSpecialCharacters;
    }

    public SecPasswordValidator withPasMinNumericOrSpecialCharacters(Integer pasMinNumericOrSpecialCharacters) {
        this.pasMinNumericOrSpecialCharacters = pasMinNumericOrSpecialCharacters;
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

    public SecPasswordValidator withXsiType(String xsiType) {
        this.xsiType = xsiType;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlnsPas
     */
    public String getXmlnsPas() {
        return xmlnsPas;
    }

    /**
     * 
     * @param xmlnsPas
     *     The xmlns:pas
     */
    public void setXmlnsPas(String xmlnsPas) {
        this.xmlnsPas = xmlnsPas;
    }

    public SecPasswordValidator withXmlnsPas(String xmlnsPas) {
        this.xmlnsPas = xmlnsPas;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secName).append(pasMinPasswordLength).append(pasMinNumericOrSpecialCharacters).append(xsiType).append(xmlnsPas).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecPasswordValidator) == false) {
            return false;
        }
        SecPasswordValidator rhs = ((SecPasswordValidator) other);
        return new EqualsBuilder().append(secName, rhs.secName).append(pasMinPasswordLength, rhs.pasMinPasswordLength).append(pasMinNumericOrSpecialCharacters, rhs.pasMinNumericOrSpecialCharacters).append(xsiType, rhs.xsiType).append(xmlnsPas, rhs.xmlnsPas).isEquals();
    }

}
