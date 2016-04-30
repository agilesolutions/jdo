
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Eviction {

    @SerializedName("strategy")
    @Expose
    private String strategy;

    /**
     * 
     * @return
     *     The strategy
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * 
     * @param strategy
     *     The strategy
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public Eviction withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(strategy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Eviction) == false) {
            return false;
        }
        Eviction rhs = ((Eviction) other);
        return new EqualsBuilder().append(strategy, rhs.strategy).isEquals();
    }

}
