
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class FileStore {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("directory")
    @Expose
    private String directory;
    @SerializedName("synchronous-write-policy")
    @Expose
    private String synchronousWritePolicy;
    @SerializedName("target")
    @Expose
    private String target;

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

    public FileStore withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The directory
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * 
     * @param directory
     *     The directory
     */
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public FileStore withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 
     * @return
     *     The synchronousWritePolicy
     */
    public String getSynchronousWritePolicy() {
        return synchronousWritePolicy;
    }

    /**
     * 
     * @param synchronousWritePolicy
     *     The synchronous-write-policy
     */
    public void setSynchronousWritePolicy(String synchronousWritePolicy) {
        this.synchronousWritePolicy = synchronousWritePolicy;
    }

    public FileStore withSynchronousWritePolicy(String synchronousWritePolicy) {
        this.synchronousWritePolicy = synchronousWritePolicy;
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

    public FileStore withTarget(String target) {
        this.target = target;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(directory).append(synchronousWritePolicy).append(target).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileStore) == false) {
            return false;
        }
        FileStore rhs = ((FileStore) other);
        return new EqualsBuilder().append(name, rhs.name).append(directory, rhs.directory).append(synchronousWritePolicy, rhs.synchronousWritePolicy).append(target, rhs.target).isEquals();
    }

}
