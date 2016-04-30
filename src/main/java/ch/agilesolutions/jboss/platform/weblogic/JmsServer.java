
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class JmsServer {

    @SerializedName("persistent-store")
    @Expose
    private String persistentStore;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("target")
    @Expose
    private String target;

    /**
     * 
     * @return
     *     The persistentStore
     */
    public String getPersistentStore() {
        return persistentStore;
    }

    /**
     * 
     * @param persistentStore
     *     The persistent-store
     */
    public void setPersistentStore(String persistentStore) {
        this.persistentStore = persistentStore;
    }

    public JmsServer withPersistentStore(String persistentStore) {
        this.persistentStore = persistentStore;
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

    public JmsServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The target
     */
    public String getTarget() {
        return target;
    }

    /**
     * 
     * @param target
     *     The target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    public JmsServer withTarget(String target) {
        this.target = target;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(persistentStore).append(name).append(target).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JmsServer) == false) {
            return false;
        }
        JmsServer rhs = ((JmsServer) other);
        return new EqualsBuilder().append(persistentStore, rhs.persistentStore).append(name, rhs.name).append(target, rhs.target).isEquals();
    }

}
