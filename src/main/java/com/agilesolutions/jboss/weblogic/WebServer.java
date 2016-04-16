
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class WebServer {

    @SerializedName("web-server-log")
    @Expose
    private WebServerLog webServerLog;

    /**
     * 
     * @return
     *     The webServerLog
     */
    public WebServerLog getWebServerLog() {
        return webServerLog;
    }

    /**
     * 
     * @param webServerLog
     *     The web-server-log
     */
    public void setWebServerLog(WebServerLog webServerLog) {
        this.webServerLog = webServerLog;
    }

    public WebServer withWebServerLog(WebServerLog webServerLog) {
        this.webServerLog = webServerLog;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(webServerLog).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebServer) == false) {
            return false;
        }
        WebServer rhs = ((WebServer) other);
        return new EqualsBuilder().append(webServerLog, rhs.webServerLog).isEquals();
    }

}
