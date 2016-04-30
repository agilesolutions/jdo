
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PolicyModule {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("flag")
    @Expose
    private String flag;

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    public PolicyModule withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 
     * @return
     *     The flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 
     * @param flag
     *     The flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public PolicyModule withFlag(String flag) {
        this.flag = flag;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(flag).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PolicyModule) == false) {
            return false;
        }
        PolicyModule rhs = ((PolicyModule) other);
        return new EqualsBuilder().append(code, rhs.code).append(flag, rhs.flag).isEquals();
    }

}
