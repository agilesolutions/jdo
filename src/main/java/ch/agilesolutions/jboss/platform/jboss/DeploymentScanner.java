
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DeploymentScanner {

    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("relative-to")
    @Expose
    private String relativeTo;
    @SerializedName("scan-interval")
    @Expose
    private Integer scanInterval;

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

    public DeploymentScanner withPath(String path) {
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

    public DeploymentScanner withRelativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    /**
     * 
     * @return
     *     The scanInterval
     */
    public Integer getScanInterval() {
        return scanInterval;
    }

    /**
     * 
     * @param scanInterval
     *     The scan-interval
     */
    public void setScanInterval(Integer scanInterval) {
        this.scanInterval = scanInterval;
    }

    public DeploymentScanner withScanInterval(Integer scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(relativeTo).append(scanInterval).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentScanner) == false) {
            return false;
        }
        DeploymentScanner rhs = ((DeploymentScanner) other);
        return new EqualsBuilder().append(path, rhs.path).append(relativeTo, rhs.relativeTo).append(scanInterval, rhs.scanInterval).isEquals();
    }

}
