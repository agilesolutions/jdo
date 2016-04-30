
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
public class LoginModule {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("flag")
    @Expose
    private String flag;
    @SerializedName("module-option")
    @Expose
    private List<ModuleOption> moduleOption = new ArrayList<ModuleOption>();

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

    public LoginModule withCode(String code) {
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

    public LoginModule withFlag(String flag) {
        this.flag = flag;
        return this;
    }

    /**
     * 
     * @return
     *     The moduleOption
     */
    public List<ModuleOption> getModuleOption() {
        return moduleOption;
    }

    /**
     * 
     * @param moduleOption
     *     The module-option
     */
    public void setModuleOption(List<ModuleOption> moduleOption) {
        this.moduleOption = moduleOption;
    }

    public LoginModule withModuleOption(List<ModuleOption> moduleOption) {
        this.moduleOption = moduleOption;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(flag).append(moduleOption).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoginModule) == false) {
            return false;
        }
        LoginModule rhs = ((LoginModule) other);
        return new EqualsBuilder().append(code, rhs.code).append(flag, rhs.flag).append(moduleOption, rhs.moduleOption).isEquals();
    }

}
