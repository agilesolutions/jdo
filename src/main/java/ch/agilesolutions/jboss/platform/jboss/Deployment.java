
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Deployment {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("runtime-name")
    @Expose
    private String runtimeName;
    @SerializedName("content")
    @Expose
    private Content content;

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

    public Deployment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The runtimeName
     */
    public String getRuntimeName() {
        return runtimeName;
    }

    /**
     * 
     * @param runtimeName
     *     The runtime-name
     */
    public void setRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
    }

    public Deployment withRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
        return this;
    }

    /**
     * 
     * @return
     *     The content
     */
    public Content getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(Content content) {
        this.content = content;
    }

    public Deployment withContent(Content content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(runtimeName).append(content).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Deployment) == false) {
            return false;
        }
        Deployment rhs = ((Deployment) other);
        return new EqualsBuilder().append(name, rhs.name).append(runtimeName, rhs.runtimeName).append(content, rhs.content).isEquals();
    }

}
