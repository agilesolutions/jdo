
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Deployments {

    @SerializedName("deployment")
    @Expose
    private Deployment deployment;

    /**
     * 
     * @return
     *     The deployment
     */
    public Deployment getDeployment() {
        return deployment;
    }

    /**
     * 
     * @param deployment
     *     The deployment
     */
    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
    }

    public Deployments withDeployment(Deployment deployment) {
        this.deployment = deployment;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deployment).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Deployments) == false) {
            return false;
        }
        Deployments rhs = ((Deployments) other);
        return new EqualsBuilder().append(deployment, rhs.deployment).isEquals();
    }

}
