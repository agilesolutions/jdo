
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Authorization_ {

    @SerializedName("policy-module")
    @Expose
    private PolicyModule policyModule;

    /**
     * 
     * @return
     *     The policyModule
     */
    public PolicyModule getPolicyModule() {
        return policyModule;
    }

    /**
     * 
     * @param policyModule
     *     The policy-module
     */
    public void setPolicyModule(PolicyModule policyModule) {
        this.policyModule = policyModule;
    }

    public Authorization_ withPolicyModule(PolicyModule policyModule) {
        this.policyModule = policyModule;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyModule).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Authorization_) == false) {
            return false;
        }
        Authorization_ rhs = ((Authorization_) other);
        return new EqualsBuilder().append(policyModule, rhs.policyModule).isEquals();
    }

}
