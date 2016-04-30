
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
public class AdminObjects {

    @SerializedName("admin-object")
    @Expose
    private List<AdminObject> adminObject = new ArrayList<AdminObject>();

    /**
     * 
     * @return
     *     The adminObject
     */
    public List<AdminObject> getAdminObject() {
        return adminObject;
    }

    /**
     * 
     * @param adminObject
     *     The admin-object
     */
    public void setAdminObject(List<AdminObject> adminObject) {
        this.adminObject = adminObject;
    }

    public AdminObjects withAdminObject(List<AdminObject> adminObject) {
        this.adminObject = adminObject;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(adminObject).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdminObjects) == false) {
            return false;
        }
        AdminObjects rhs = ((AdminObjects) other);
        return new EqualsBuilder().append(adminObject, rhs.adminObject).isEquals();
    }

}
