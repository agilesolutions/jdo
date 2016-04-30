
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PassivationStores {

    @SerializedName("file-passivation-store")
    @Expose
    private FilePassivationStore filePassivationStore;

    /**
     * 
     * @return
     *     The filePassivationStore
     */
    public FilePassivationStore getFilePassivationStore() {
        return filePassivationStore;
    }

    /**
     * 
     * @param filePassivationStore
     *     The file-passivation-store
     */
    public void setFilePassivationStore(FilePassivationStore filePassivationStore) {
        this.filePassivationStore = filePassivationStore;
    }

    public PassivationStores withFilePassivationStore(FilePassivationStore filePassivationStore) {
        this.filePassivationStore = filePassivationStore;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filePassivationStore).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassivationStores) == false) {
            return false;
        }
        PassivationStores rhs = ((PassivationStores) other);
        return new EqualsBuilder().append(filePassivationStore, rhs.filePassivationStore).isEquals();
    }

}
