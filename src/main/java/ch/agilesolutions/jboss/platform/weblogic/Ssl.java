
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Ssl {

    @SerializedName("server-private-key-alias")
    @Expose
    private String serverPrivateKeyAlias;
    @SerializedName("server-private-key-pass-phrase-encrypted")
    @Expose
    private String serverPrivateKeyPassPhraseEncrypted;
    @SerializedName("hostname-verification-ignored")
    @Expose
    private Boolean hostnameVerificationIgnored;
    @SerializedName("listen-port")
    @Expose
    private Integer listenPort;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;

    /**
     * 
     * @return
     *     The serverPrivateKeyAlias
     */
    public String getServerPrivateKeyAlias() {
        return serverPrivateKeyAlias;
    }

    /**
     * 
     * @param serverPrivateKeyAlias
     *     The server-private-key-alias
     */
    public void setServerPrivateKeyAlias(String serverPrivateKeyAlias) {
        this.serverPrivateKeyAlias = serverPrivateKeyAlias;
    }

    public Ssl withServerPrivateKeyAlias(String serverPrivateKeyAlias) {
        this.serverPrivateKeyAlias = serverPrivateKeyAlias;
        return this;
    }

    /**
     * 
     * @return
     *     The serverPrivateKeyPassPhraseEncrypted
     */
    public String getServerPrivateKeyPassPhraseEncrypted() {
        return serverPrivateKeyPassPhraseEncrypted;
    }

    /**
     * 
     * @param serverPrivateKeyPassPhraseEncrypted
     *     The server-private-key-pass-phrase-encrypted
     */
    public void setServerPrivateKeyPassPhraseEncrypted(String serverPrivateKeyPassPhraseEncrypted) {
        this.serverPrivateKeyPassPhraseEncrypted = serverPrivateKeyPassPhraseEncrypted;
    }

    public Ssl withServerPrivateKeyPassPhraseEncrypted(String serverPrivateKeyPassPhraseEncrypted) {
        this.serverPrivateKeyPassPhraseEncrypted = serverPrivateKeyPassPhraseEncrypted;
        return this;
    }

    /**
     * 
     * @return
     *     The hostnameVerificationIgnored
     */
    public Boolean getHostnameVerificationIgnored() {
        return hostnameVerificationIgnored;
    }

    /**
     * 
     * @param hostnameVerificationIgnored
     *     The hostname-verification-ignored
     */
    public void setHostnameVerificationIgnored(Boolean hostnameVerificationIgnored) {
        this.hostnameVerificationIgnored = hostnameVerificationIgnored;
    }

    public Ssl withHostnameVerificationIgnored(Boolean hostnameVerificationIgnored) {
        this.hostnameVerificationIgnored = hostnameVerificationIgnored;
        return this;
    }

    /**
     * 
     * @return
     *     The listenPort
     */
    public Integer getListenPort() {
        return listenPort;
    }

    /**
     * 
     * @param listenPort
     *     The listen-port
     */
    public void setListenPort(Integer listenPort) {
        this.listenPort = listenPort;
    }

    public Ssl withListenPort(Integer listenPort) {
        this.listenPort = listenPort;
        return this;
    }

    /**
     * 
     * @return
     *     The enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     * @param enabled
     *     The enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Ssl withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serverPrivateKeyAlias).append(serverPrivateKeyPassPhraseEncrypted).append(hostnameVerificationIgnored).append(listenPort).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssl) == false) {
            return false;
        }
        Ssl rhs = ((Ssl) other);
        return new EqualsBuilder().append(serverPrivateKeyAlias, rhs.serverPrivateKeyAlias).append(serverPrivateKeyPassPhraseEncrypted, rhs.serverPrivateKeyPassPhraseEncrypted).append(hostnameVerificationIgnored, rhs.hostnameVerificationIgnored).append(listenPort, rhs.listenPort).append(enabled, rhs.enabled).isEquals();
    }

}
