
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
public class CacheContainer {

    @SerializedName("aliases")
    @Expose
    private String aliases;
    @SerializedName("module")
    @Expose
    private String module;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("local-cache")
    @Expose
    private List<LocalCache> localCache = new ArrayList<LocalCache>();
    @SerializedName("default-cache")
    @Expose
    private String defaultCache;

    /**
     * 
     * @return
     *     The aliases
     */
    public String getAliases() {
        return aliases;
    }

    /**
     * 
     * @param aliases
     *     The aliases
     */
    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public CacheContainer withAliases(String aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * 
     * @return
     *     The module
     */
    public String getModule() {
        return module;
    }

    /**
     * 
     * @param module
     *     The module
     */
    public void setModule(String module) {
        this.module = module;
    }

    public CacheContainer withModule(String module) {
        this.module = module;
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

    public CacheContainer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The localCache
     */
    public List<LocalCache> getLocalCache() {
        return localCache;
    }

    /**
     * 
     * @param localCache
     *     The local-cache
     */
    public void setLocalCache(List<LocalCache> localCache) {
        this.localCache = localCache;
    }

    public CacheContainer withLocalCache(List<LocalCache> localCache) {
        this.localCache = localCache;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultCache
     */
    public String getDefaultCache() {
        return defaultCache;
    }

    /**
     * 
     * @param defaultCache
     *     The default-cache
     */
    public void setDefaultCache(String defaultCache) {
        this.defaultCache = defaultCache;
    }

    public CacheContainer withDefaultCache(String defaultCache) {
        this.defaultCache = defaultCache;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aliases).append(module).append(name).append(localCache).append(defaultCache).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CacheContainer) == false) {
            return false;
        }
        CacheContainer rhs = ((CacheContainer) other);
        return new EqualsBuilder().append(aliases, rhs.aliases).append(module, rhs.module).append(name, rhs.name).append(localCache, rhs.localCache).append(defaultCache, rhs.defaultCache).isEquals();
    }

}
