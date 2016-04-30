
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ResourceAdapter {

    @SerializedName("archive")
    @Expose
    private String archive;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("transaction-support")
    @Expose
    private String transactionSupport;
    @SerializedName("connection-definitions")
    @Expose
    private ConnectionDefinitions connectionDefinitions;
    @SerializedName("admin-objects")
    @Expose
    private AdminObjects adminObjects;

    /**
     * 
     * @return
     *     The archive
     */
    public String getArchive() {
        return archive;
    }

    /**
     * 
     * @param archive
     *     The archive
     */
    public void setArchive(String archive) {
        this.archive = archive;
    }

    public ResourceAdapter withArchive(String archive) {
        this.archive = archive;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public ResourceAdapter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The transactionSupport
     */
    public String getTransactionSupport() {
        return transactionSupport;
    }

    /**
     * 
     * @param transactionSupport
     *     The transaction-support
     */
    public void setTransactionSupport(String transactionSupport) {
        this.transactionSupport = transactionSupport;
    }

    public ResourceAdapter withTransactionSupport(String transactionSupport) {
        this.transactionSupport = transactionSupport;
        return this;
    }

    /**
     * 
     * @return
     *     The connectionDefinitions
     */
    public ConnectionDefinitions getConnectionDefinitions() {
        return connectionDefinitions;
    }

    /**
     * 
     * @param connectionDefinitions
     *     The connection-definitions
     */
    public void setConnectionDefinitions(ConnectionDefinitions connectionDefinitions) {
        this.connectionDefinitions = connectionDefinitions;
    }

    public ResourceAdapter withConnectionDefinitions(ConnectionDefinitions connectionDefinitions) {
        this.connectionDefinitions = connectionDefinitions;
        return this;
    }

    /**
     * 
     * @return
     *     The adminObjects
     */
    public AdminObjects getAdminObjects() {
        return adminObjects;
    }

    /**
     * 
     * @param adminObjects
     *     The admin-objects
     */
    public void setAdminObjects(AdminObjects adminObjects) {
        this.adminObjects = adminObjects;
    }

    public ResourceAdapter withAdminObjects(AdminObjects adminObjects) {
        this.adminObjects = adminObjects;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(archive).append(id).append(transactionSupport).append(connectionDefinitions).append(adminObjects).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceAdapter) == false) {
            return false;
        }
        ResourceAdapter rhs = ((ResourceAdapter) other);
        return new EqualsBuilder().append(archive, rhs.archive).append(id, rhs.id).append(transactionSupport, rhs.transactionSupport).append(connectionDefinitions, rhs.connectionDefinitions).append(adminObjects, rhs.adminObjects).isEquals();
    }

}
