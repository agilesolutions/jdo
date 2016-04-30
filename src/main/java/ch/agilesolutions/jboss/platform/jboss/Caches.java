
package ch.agilesolutions.jboss.platform.jboss;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Caches {

    @SerializedName("cache")
    @Expose
    private List<Cache> cache = new ArrayList<Cache>();

    /**
     * 
     * @return
     *     The cache
     */
    public List<Cache> getCache() {
        return cache;
    }

    /**
     * 
     * @param cache
     *     The cache
     */
    public void setCache(List<Cache> cache) {
        this.cache = cache;
    }

    public Caches withCache(List<Cache> cache) {
        this.cache = cache;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cache).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Caches) == false) {
            return false;
        }
        Caches rhs = ((Caches) other);
        return new EqualsBuilder().append(cache, rhs.cache).isEquals();
    }

}
