
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Authentication {

    @SerializedName("jaas")
    @Expose
    private Jaas jaas;

    /**
     * 
     * @return
     *     The jaas
     */
    public Jaas getJaas() {
        return jaas;
    }

    /**
     * 
     * @param jaas
     *     The jaas
     */
    public void setJaas(Jaas jaas) {
        this.jaas = jaas;
    }

    public Authentication withJaas(Jaas jaas) {
        this.jaas = jaas;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jaas).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Authentication) == false) {
            return false;
        }
        Authentication rhs = ((Authentication) other);
        return new EqualsBuilder().append(jaas, rhs.jaas).isEquals();
    }

}
