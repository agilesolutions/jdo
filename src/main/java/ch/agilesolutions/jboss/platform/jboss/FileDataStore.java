
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class FileDataStore {

    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("relative-to")
    @Expose
    private String relativeTo;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The path
     */
    public String getPath() {
        return path;
    }

    /**
     * 
     * @param path
     *     The path
     */
    public void setPath(String path) {
        this.path = path;
    }

    public FileDataStore withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 
     * @return
     *     The relativeTo
     */
    public String getRelativeTo() {
        return relativeTo;
    }

    /**
     * 
     * @param relativeTo
     *     The relative-to
     */
    public void setRelativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
    }

    public FileDataStore withRelativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
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

    public FileDataStore withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(relativeTo).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileDataStore) == false) {
            return false;
        }
        FileDataStore rhs = ((FileDataStore) other);
        return new EqualsBuilder().append(path, rhs.path).append(relativeTo, rhs.relativeTo).append(name, rhs.name).isEquals();
    }

}
