
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SessionBean {

    @SerializedName("singleton")
    @Expose
    private Singleton singleton;
    @SerializedName("stateless")
    @Expose
    private Stateless stateless;
    @SerializedName("stateful")
    @Expose
    private Stateful stateful;

    /**
     * 
     * @return
     *     The singleton
     */
    public Singleton getSingleton() {
        return singleton;
    }

    /**
     * 
     * @param singleton
     *     The singleton
     */
    public void setSingleton(Singleton singleton) {
        this.singleton = singleton;
    }

    public SessionBean withSingleton(Singleton singleton) {
        this.singleton = singleton;
        return this;
    }

    /**
     * 
     * @return
     *     The stateless
     */
    public Stateless getStateless() {
        return stateless;
    }

    /**
     * 
     * @param stateless
     *     The stateless
     */
    public void setStateless(Stateless stateless) {
        this.stateless = stateless;
    }

    public SessionBean withStateless(Stateless stateless) {
        this.stateless = stateless;
        return this;
    }

    /**
     * 
     * @return
     *     The stateful
     */
    public Stateful getStateful() {
        return stateful;
    }

    /**
     * 
     * @param stateful
     *     The stateful
     */
    public void setStateful(Stateful stateful) {
        this.stateful = stateful;
    }

    public SessionBean withStateful(Stateful stateful) {
        this.stateful = stateful;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(singleton).append(stateless).append(stateful).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SessionBean) == false) {
            return false;
        }
        SessionBean rhs = ((SessionBean) other);
        return new EqualsBuilder().append(singleton, rhs.singleton).append(stateless, rhs.stateless).append(stateful, rhs.stateful).isEquals();
    }

}
