
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DataStores {

    @SerializedName("file-data-store")
    @Expose
    private FileDataStore fileDataStore;

    /**
     * 
     * @return
     *     The fileDataStore
     */
    public FileDataStore getFileDataStore() {
        return fileDataStore;
    }

    /**
     * 
     * @param fileDataStore
     *     The file-data-store
     */
    public void setFileDataStore(FileDataStore fileDataStore) {
        this.fileDataStore = fileDataStore;
    }

    public DataStores withFileDataStore(FileDataStore fileDataStore) {
        this.fileDataStore = fileDataStore;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fileDataStore).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataStores) == false) {
            return false;
        }
        DataStores rhs = ((DataStores) other);
        return new EqualsBuilder().append(fileDataStore, rhs.fileDataStore).isEquals();
    }

}
