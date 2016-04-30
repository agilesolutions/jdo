
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Server {

    @SerializedName("socket-binding-group")
    @Expose
    private SocketBindingGroup socketBindingGroup;
    @SerializedName("xmlns")
    @Expose
    private String xmlns;
    @SerializedName("extensions")
    @Expose
    private Extensions extensions;
    @SerializedName("interfaces")
    @Expose
    private Interfaces interfaces;
    @SerializedName("deployments")
    @Expose
    private Deployments deployments;
    @SerializedName("management")
    @Expose
    private Management management;
    @SerializedName("system-properties")
    @Expose
    private SystemProperties systemProperties;
    @SerializedName("profile")
    @Expose
    private Profile profile;

    /**
     * 
     * @return
     *     The socketBindingGroup
     */
    public SocketBindingGroup getSocketBindingGroup() {
        return socketBindingGroup;
    }

    /**
     * 
     * @param socketBindingGroup
     *     The socket-binding-group
     */
    public void setSocketBindingGroup(SocketBindingGroup socketBindingGroup) {
        this.socketBindingGroup = socketBindingGroup;
    }

    public Server withSocketBindingGroup(SocketBindingGroup socketBindingGroup) {
        this.socketBindingGroup = socketBindingGroup;
        return this;
    }

    /**
     * 
     * @return
     *     The xmlns
     */
    public String getXmlns() {
        return xmlns;
    }

    /**
     * 
     * @param xmlns
     *     The xmlns
     */
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public Server withXmlns(String xmlns) {
        this.xmlns = xmlns;
        return this;
    }

    /**
     * 
     * @return
     *     The extensions
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * 
     * @param extensions
     *     The extensions
     */
    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    public Server withExtensions(Extensions extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * 
     * @return
     *     The interfaces
     */
    public Interfaces getInterfaces() {
        return interfaces;
    }

    /**
     * 
     * @param interfaces
     *     The interfaces
     */
    public void setInterfaces(Interfaces interfaces) {
        this.interfaces = interfaces;
    }

    public Server withInterfaces(Interfaces interfaces) {
        this.interfaces = interfaces;
        return this;
    }

    /**
     * 
     * @return
     *     The deployments
     */
    public Deployments getDeployments() {
        return deployments;
    }

    /**
     * 
     * @param deployments
     *     The deployments
     */
    public void setDeployments(Deployments deployments) {
        this.deployments = deployments;
    }

    public Server withDeployments(Deployments deployments) {
        this.deployments = deployments;
        return this;
    }

    /**
     * 
     * @return
     *     The management
     */
    public Management getManagement() {
        return management;
    }

    /**
     * 
     * @param management
     *     The management
     */
    public void setManagement(Management management) {
        this.management = management;
    }

    public Server withManagement(Management management) {
        this.management = management;
        return this;
    }

    /**
     * 
     * @return
     *     The systemProperties
     */
    public SystemProperties getSystemProperties() {
        return systemProperties;
    }

    /**
     * 
     * @param systemProperties
     *     The system-properties
     */
    public void setSystemProperties(SystemProperties systemProperties) {
        this.systemProperties = systemProperties;
    }

    public Server withSystemProperties(SystemProperties systemProperties) {
        this.systemProperties = systemProperties;
        return this;
    }

    /**
     * 
     * @return
     *     The profile
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * 
     * @param profile
     *     The profile
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Server withProfile(Profile profile) {
        this.profile = profile;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(socketBindingGroup).append(xmlns).append(extensions).append(interfaces).append(deployments).append(management).append(systemProperties).append(profile).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Server) == false) {
            return false;
        }
        Server rhs = ((Server) other);
        return new EqualsBuilder().append(socketBindingGroup, rhs.socketBindingGroup).append(xmlns, rhs.xmlns).append(extensions, rhs.extensions).append(interfaces, rhs.interfaces).append(deployments, rhs.deployments).append(management, rhs.management).append(systemProperties, rhs.systemProperties).append(profile, rhs.profile).isEquals();
    }

}
