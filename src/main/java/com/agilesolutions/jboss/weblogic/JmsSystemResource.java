
package com.agilesolutions.jboss.weblogic;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class JmsSystemResource {

    @SerializedName("sub-deployment")
    @Expose
    private List<SubDeployment> subDeployment = new ArrayList<SubDeployment>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("descriptor-file-name")
    @Expose
    private String descriptorFileName;
    @SerializedName("target")
    @Expose
    private String target;

    /**
     * 
     * @return
     *     The subDeployment
     */
    public List<SubDeployment> getSubDeployment() {
        return subDeployment;
    }

    /**
     * 
     * @param subDeployment
     *     The sub-deployment
     */
    public void setSubDeployment(List<SubDeployment> subDeployment) {
        this.subDeployment = subDeployment;
    }

    public JmsSystemResource withSubDeployment(List<SubDeployment> subDeployment) {
        this.subDeployment = subDeployment;
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

    public JmsSystemResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The descriptorFileName
     */
    public String getDescriptorFileName() {
        return descriptorFileName;
    }

    /**
     * 
     * @param descriptorFileName
     *     The descriptor-file-name
     */
    public void setDescriptorFileName(String descriptorFileName) {
        this.descriptorFileName = descriptorFileName;
    }

    public JmsSystemResource withDescriptorFileName(String descriptorFileName) {
        this.descriptorFileName = descriptorFileName;
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

    public JmsSystemResource withTarget(String target) {
        this.target = target;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subDeployment).append(name).append(descriptorFileName).append(target).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JmsSystemResource) == false) {
            return false;
        }
        JmsSystemResource rhs = ((JmsSystemResource) other);
        return new EqualsBuilder().append(subDeployment, rhs.subDeployment).append(name, rhs.name).append(descriptorFileName, rhs.descriptorFileName).append(target, rhs.target).isEquals();
    }

}
