
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class NetworkAccessPoint {

    @SerializedName("client-certificate-enforced")
    @Expose
    private Boolean clientCertificateEnforced;
    @SerializedName("listen-address")
    @Expose
    private String listenAddress;
    @SerializedName("custom-private-key-pass-phrase-encrypted")
    @Expose
    private CustomPrivateKeyPassPhraseEncrypted customPrivateKeyPassPhraseEncrypted;
    @SerializedName("tunneling-enabled")
    @Expose
    private Boolean tunnelingEnabled;
    @SerializedName("outbound-enabled")
    @Expose
    private Boolean outboundEnabled;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("channel-identity-customized")
    @Expose
    private Boolean channelIdentityCustomized;
    @SerializedName("protocol")
    @Expose
    private String protocol;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("listen-port")
    @Expose
    private Integer listenPort;
    @SerializedName("two-way-ssl-enabled")
    @Expose
    private Boolean twoWaySslEnabled;
    @SerializedName("custom-private-key-alias")
    @Expose
    private CustomPrivateKeyAlias customPrivateKeyAlias;
    @SerializedName("http-enabled-for-this-protocol")
    @Expose
    private Boolean httpEnabledForThisProtocol;

    /**
     * 
     * @return
     *     The clientCertificateEnforced
     */
    public Boolean getClientCertificateEnforced() {
        return clientCertificateEnforced;
    }

    /**
     * 
     * @param clientCertificateEnforced
     *     The client-certificate-enforced
     */
    public void setClientCertificateEnforced(Boolean clientCertificateEnforced) {
        this.clientCertificateEnforced = clientCertificateEnforced;
    }

    public NetworkAccessPoint withClientCertificateEnforced(Boolean clientCertificateEnforced) {
        this.clientCertificateEnforced = clientCertificateEnforced;
        return this;
    }

    /**
     * 
     * @return
     *     The listenAddress
     */
    public String getListenAddress() {
        return listenAddress;
    }

    /**
     * 
     * @param listenAddress
     *     The listen-address
     */
    public void setListenAddress(String listenAddress) {
        this.listenAddress = listenAddress;
    }

    public NetworkAccessPoint withListenAddress(String listenAddress) {
        this.listenAddress = listenAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The customPrivateKeyPassPhraseEncrypted
     */
    public CustomPrivateKeyPassPhraseEncrypted getCustomPrivateKeyPassPhraseEncrypted() {
        return customPrivateKeyPassPhraseEncrypted;
    }

    /**
     * 
     * @param customPrivateKeyPassPhraseEncrypted
     *     The custom-private-key-pass-phrase-encrypted
     */
    public void setCustomPrivateKeyPassPhraseEncrypted(CustomPrivateKeyPassPhraseEncrypted customPrivateKeyPassPhraseEncrypted) {
        this.customPrivateKeyPassPhraseEncrypted = customPrivateKeyPassPhraseEncrypted;
    }

    public NetworkAccessPoint withCustomPrivateKeyPassPhraseEncrypted(CustomPrivateKeyPassPhraseEncrypted customPrivateKeyPassPhraseEncrypted) {
        this.customPrivateKeyPassPhraseEncrypted = customPrivateKeyPassPhraseEncrypted;
        return this;
    }

    /**
     * 
     * @return
     *     The tunnelingEnabled
     */
    public Boolean getTunnelingEnabled() {
        return tunnelingEnabled;
    }

    /**
     * 
     * @param tunnelingEnabled
     *     The tunneling-enabled
     */
    public void setTunnelingEnabled(Boolean tunnelingEnabled) {
        this.tunnelingEnabled = tunnelingEnabled;
    }

    public NetworkAccessPoint withTunnelingEnabled(Boolean tunnelingEnabled) {
        this.tunnelingEnabled = tunnelingEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The outboundEnabled
     */
    public Boolean getOutboundEnabled() {
        return outboundEnabled;
    }

    /**
     * 
     * @param outboundEnabled
     *     The outbound-enabled
     */
    public void setOutboundEnabled(Boolean outboundEnabled) {
        this.outboundEnabled = outboundEnabled;
    }

    public NetworkAccessPoint withOutboundEnabled(Boolean outboundEnabled) {
        this.outboundEnabled = outboundEnabled;
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

    public NetworkAccessPoint withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 
     * @return
     *     The channelIdentityCustomized
     */
    public Boolean getChannelIdentityCustomized() {
        return channelIdentityCustomized;
    }

    /**
     * 
     * @param channelIdentityCustomized
     *     The channel-identity-customized
     */
    public void setChannelIdentityCustomized(Boolean channelIdentityCustomized) {
        this.channelIdentityCustomized = channelIdentityCustomized;
    }

    public NetworkAccessPoint withChannelIdentityCustomized(Boolean channelIdentityCustomized) {
        this.channelIdentityCustomized = channelIdentityCustomized;
        return this;
    }

    /**
     * 
     * @return
     *     The protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * 
     * @param protocol
     *     The protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public NetworkAccessPoint withProtocol(String protocol) {
        this.protocol = protocol;
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

    public NetworkAccessPoint withName(String name) {
        this.name = name;
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

    public NetworkAccessPoint withListenPort(Integer listenPort) {
        this.listenPort = listenPort;
        return this;
    }

    /**
     * 
     * @return
     *     The twoWaySslEnabled
     */
    public Boolean getTwoWaySslEnabled() {
        return twoWaySslEnabled;
    }

    /**
     * 
     * @param twoWaySslEnabled
     *     The two-way-ssl-enabled
     */
    public void setTwoWaySslEnabled(Boolean twoWaySslEnabled) {
        this.twoWaySslEnabled = twoWaySslEnabled;
    }

    public NetworkAccessPoint withTwoWaySslEnabled(Boolean twoWaySslEnabled) {
        this.twoWaySslEnabled = twoWaySslEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The customPrivateKeyAlias
     */
    public CustomPrivateKeyAlias getCustomPrivateKeyAlias() {
        return customPrivateKeyAlias;
    }

    /**
     * 
     * @param customPrivateKeyAlias
     *     The custom-private-key-alias
     */
    public void setCustomPrivateKeyAlias(CustomPrivateKeyAlias customPrivateKeyAlias) {
        this.customPrivateKeyAlias = customPrivateKeyAlias;
    }

    public NetworkAccessPoint withCustomPrivateKeyAlias(CustomPrivateKeyAlias customPrivateKeyAlias) {
        this.customPrivateKeyAlias = customPrivateKeyAlias;
        return this;
    }

    /**
     * 
     * @return
     *     The httpEnabledForThisProtocol
     */
    public Boolean getHttpEnabledForThisProtocol() {
        return httpEnabledForThisProtocol;
    }

    /**
     * 
     * @param httpEnabledForThisProtocol
     *     The http-enabled-for-this-protocol
     */
    public void setHttpEnabledForThisProtocol(Boolean httpEnabledForThisProtocol) {
        this.httpEnabledForThisProtocol = httpEnabledForThisProtocol;
    }

    public NetworkAccessPoint withHttpEnabledForThisProtocol(Boolean httpEnabledForThisProtocol) {
        this.httpEnabledForThisProtocol = httpEnabledForThisProtocol;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientCertificateEnforced).append(listenAddress).append(customPrivateKeyPassPhraseEncrypted).append(tunnelingEnabled).append(outboundEnabled).append(enabled).append(channelIdentityCustomized).append(protocol).append(name).append(listenPort).append(twoWaySslEnabled).append(customPrivateKeyAlias).append(httpEnabledForThisProtocol).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetworkAccessPoint) == false) {
            return false;
        }
        NetworkAccessPoint rhs = ((NetworkAccessPoint) other);
        return new EqualsBuilder().append(clientCertificateEnforced, rhs.clientCertificateEnforced).append(listenAddress, rhs.listenAddress).append(customPrivateKeyPassPhraseEncrypted, rhs.customPrivateKeyPassPhraseEncrypted).append(tunnelingEnabled, rhs.tunnelingEnabled).append(outboundEnabled, rhs.outboundEnabled).append(enabled, rhs.enabled).append(channelIdentityCustomized, rhs.channelIdentityCustomized).append(protocol, rhs.protocol).append(name, rhs.name).append(listenPort, rhs.listenPort).append(twoWaySslEnabled, rhs.twoWaySslEnabled).append(customPrivateKeyAlias, rhs.customPrivateKeyAlias).append(httpEnabledForThisProtocol, rhs.httpEnabledForThisProtocol).isEquals();
    }

}
