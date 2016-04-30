
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Cache {

    @SerializedName("aliases")
    @Expose
    private String aliases;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("passivation-store-ref")
    @Expose
    private String passivationStoreRef;

    /**
     * 
     * @return
     *     The aliases
     */
    public String getAliases() {
        return aliases;
    }

    /**
     * 
     * @param aliases
     *     The aliases
     */
    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public Cache withAliases(String aliases) {
        this.aliases = aliases;
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

    public Cache withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The passivationStoreRef
     */
    public String getPassivationStoreRef() {
        return passivationStoreRef;
    }

    /**
     * 
     * @param passivationStoreRef
     *     The passivation-store-ref
     */
    public void setPassivationStoreRef(String passivationStoreRef) {
        this.passivationStoreRef = passivationStoreRef;
    }

    public Cache withPassivationStoreRef(String passivationStoreRef) {
        this.passivationStoreRef = passivationStoreRef;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aliases).append(name).append(passivationStoreRef).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cache) == false) {
            return false;
        }
        Cache rhs = ((Cache) other);
        return new EqualsBuilder().append(aliases, rhs.aliases).append(name, rhs.name).append(passivationStoreRef, rhs.passivationStoreRef).isEquals();
    }

}
