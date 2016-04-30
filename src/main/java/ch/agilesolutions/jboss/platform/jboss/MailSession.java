
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class MailSession {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("smtp-server")
    @Expose
    private SmtpServer smtpServer;
    @SerializedName("jndi-name")
    @Expose
    private String jndiName;

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

    public MailSession withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The smtpServer
     */
    public SmtpServer getSmtpServer() {
        return smtpServer;
    }

    /**
     * 
     * @param smtpServer
     *     The smtp-server
     */
    public void setSmtpServer(SmtpServer smtpServer) {
        this.smtpServer = smtpServer;
    }

    public MailSession withSmtpServer(SmtpServer smtpServer) {
        this.smtpServer = smtpServer;
        return this;
    }

    /**
     * 
     * @return
     *     The jndiName
     */
    public String getJndiName() {
        return jndiName;
    }

    /**
     * 
     * @param jndiName
     *     The jndi-name
     */
    public void setJndiName(String jndiName) {
        this.jndiName = jndiName;
    }

    public MailSession withJndiName(String jndiName) {
        this.jndiName = jndiName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(smtpServer).append(jndiName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MailSession) == false) {
            return false;
        }
        MailSession rhs = ((MailSession) other);
        return new EqualsBuilder().append(name, rhs.name).append(smtpServer, rhs.smtpServer).append(jndiName, rhs.jndiName).isEquals();
    }

}
