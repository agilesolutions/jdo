package com.agilesolutions.jboss.weblogic;


import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ConnectionFactories {

@SerializedName("weblogic-jms")
@Expose
private WeblogicJms weblogicJms;

/**
* 
* @return
* The weblogicJms
*/
public WeblogicJms getWeblogicJms() {
return weblogicJms;
 }

/**
* 
* @param weblogicJms
* The weblogic-jms
*/
public void setWeblogicJms(WeblogicJms weblogicJms) {
this.weblogicJms = weblogicJms;
 }

}