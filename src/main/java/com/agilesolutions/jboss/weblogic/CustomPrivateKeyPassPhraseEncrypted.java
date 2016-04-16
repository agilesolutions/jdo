
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class CustomPrivateKeyPassPhraseEncrypted {

    @SerializedName("xsi:nil")
    @Expose
    private Boolean xsiNil;

    /**
     * 
     * @return
     *     The xsiNil
     */
    public Boolean getXsiNil() {
        return xsiNil;
    }

    /**
     * 
     * @param xsiNil
     *     The xsi:nil
     */
    public void setXsiNil(Boolean xsiNil) {
        this.xsiNil = xsiNil;
    }

    public CustomPrivateKeyPassPhraseEncrypted withXsiNil(Boolean xsiNil) {
        this.xsiNil = xsiNil;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(xsiNil).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomPrivateKeyPassPhraseEncrypted) == false) {
            return false;
        }
        CustomPrivateKeyPassPhraseEncrypted rhs = ((CustomPrivateKeyPassPhraseEncrypted) other);
        return new EqualsBuilder().append(xsiNil, rhs.xsiNil).isEquals();
    }

}
