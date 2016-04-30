
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LocalCache {

    @SerializedName("eviction")
    @Expose
    private Eviction eviction;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("expiration")
    @Expose
    private Expiration expiration;
    @SerializedName("transaction")
    @Expose
    private Transaction transaction;

    /**
     * 
     * @return
     *     The eviction
     */
    public Eviction getEviction() {
        return eviction;
    }

    /**
     * 
     * @param eviction
     *     The eviction
     */
    public void setEviction(Eviction eviction) {
        this.eviction = eviction;
    }

    public LocalCache withEviction(Eviction eviction) {
        this.eviction = eviction;
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

    public LocalCache withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The expiration
     */
    public Expiration getExpiration() {
        return expiration;
    }

    /**
     * 
     * @param expiration
     *     The expiration
     */
    public void setExpiration(Expiration expiration) {
        this.expiration = expiration;
    }

    public LocalCache withExpiration(Expiration expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * 
     * @return
     *     The transaction
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * 
     * @param transaction
     *     The transaction
     */
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public LocalCache withTransaction(Transaction transaction) {
        this.transaction = transaction;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eviction).append(name).append(expiration).append(transaction).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocalCache) == false) {
            return false;
        }
        LocalCache rhs = ((LocalCache) other);
        return new EqualsBuilder().append(eviction, rhs.eviction).append(name, rhs.name).append(expiration, rhs.expiration).append(transaction, rhs.transaction).isEquals();
    }

}
