
package ch.agilesolutions.jboss.platform.jboss;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class VirtualServer {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alias")
    @Expose
    private List<Alia> alias = new ArrayList<Alia>();
    @SerializedName("enable-welcome-root")
    @Expose
    private Boolean enableWelcomeRoot;

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

    public VirtualServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The alias
     */
    public List<Alia> getAlias() {
        return alias;
    }

    /**
     * 
     * @param alias
     *     The alias
     */
    public void setAlias(List<Alia> alias) {
        this.alias = alias;
    }

    public VirtualServer withAlias(List<Alia> alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 
     * @return
     *     The enableWelcomeRoot
     */
    public Boolean getEnableWelcomeRoot() {
        return enableWelcomeRoot;
    }

    /**
     * 
     * @param enableWelcomeRoot
     *     The enable-welcome-root
     */
    public void setEnableWelcomeRoot(Boolean enableWelcomeRoot) {
        this.enableWelcomeRoot = enableWelcomeRoot;
    }

    public VirtualServer withEnableWelcomeRoot(Boolean enableWelcomeRoot) {
        this.enableWelcomeRoot = enableWelcomeRoot;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(alias).append(enableWelcomeRoot).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualServer) == false) {
            return false;
        }
        VirtualServer rhs = ((VirtualServer) other);
        return new EqualsBuilder().append(name, rhs.name).append(alias, rhs.alias).append(enableWelcomeRoot, rhs.enableWelcomeRoot).isEquals();
    }

}
