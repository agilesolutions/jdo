
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class WeblogicJson {

    @SerializedName("domain")
    @Expose
    private Domain domain;

    /**
     * 
     * @return
     *     The domain
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * 
     * @param domain
     *     The domain
     */
    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public WeblogicJson withDomain(Domain domain) {
        this.domain = domain;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(domain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeblogicJson) == false) {
            return false;
        }
        WeblogicJson rhs = ((WeblogicJson) other);
        return new EqualsBuilder().append(domain, rhs.domain).isEquals();
    }

}
