
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Content {

    @SerializedName("sha1")
    @Expose
    private String sha1;

    /**
     * 
     * @return
     *     The sha1
     */
    public String getSha1() {
        return sha1;
    }

    /**
     * 
     * @param sha1
     *     The sha1
     */
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public Content withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sha1).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content) == false) {
            return false;
        }
        Content rhs = ((Content) other);
        return new EqualsBuilder().append(sha1, rhs.sha1).isEquals();
    }

}
