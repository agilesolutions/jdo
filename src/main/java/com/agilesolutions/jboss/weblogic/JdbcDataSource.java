package com.agilesolutions.jboss.weblogic;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class JdbcDataSource {

@SerializedName("jdbc-connection-pool-params")
@Expose
private JdbcConnectionPoolParams jdbcConnectionPoolParams;
@SerializedName("xmlns")
@Expose
private String xmlns;
@SerializedName("jdbc-driver-params")
@Expose
private JdbcDriverParams jdbcDriverParams;
@SerializedName("xsi:schemaLocation")
@Expose
private String xsiSchemaLocation;
@SerializedName("name")
@Expose
private String name;
@SerializedName("xmlns:sec")
@Expose
private String xmlnsSec;
@SerializedName("xmlns:xsi")
@Expose
private String xmlnsXsi;
@SerializedName("xmlns:wls")
@Expose
private String xmlnsWls;
@SerializedName("jdbc-data-source-params")
@Expose
private JdbcDataSourceParams jdbcDataSourceParams;

/**
* 
* @return
* The jdbcConnectionPoolParams
*/
public JdbcConnectionPoolParams getJdbcConnectionPoolParams() {
return jdbcConnectionPoolParams;
 }

/**
* 
* @param jdbcConnectionPoolParams
* The jdbc-connection-pool-params
*/
public void setJdbcConnectionPoolParams(JdbcConnectionPoolParams jdbcConnectionPoolParams) {
this.jdbcConnectionPoolParams = jdbcConnectionPoolParams;
 }

/**
* 
* @return
* The xmlns
*/
public String getXmlns() {
return xmlns;
 }

/**
* 
* @param xmlns
* The xmlns
*/
public void setXmlns(String xmlns) {
this.xmlns = xmlns;
 }

/**
* 
* @return
* The jdbcDriverParams
*/
public JdbcDriverParams getJdbcDriverParams() {
return jdbcDriverParams;
 }

/**
* 
* @param jdbcDriverParams
* The jdbc-driver-params
*/
public void setJdbcDriverParams(JdbcDriverParams jdbcDriverParams) {
this.jdbcDriverParams = jdbcDriverParams;
 }

/**
* 
* @return
* The xsiSchemaLocation
*/
public String getXsiSchemaLocation() {
return xsiSchemaLocation;
 }

/**
* 
* @param xsiSchemaLocation
* The xsi:schemaLocation
*/
public void setXsiSchemaLocation(String xsiSchemaLocation) {
this.xsiSchemaLocation = xsiSchemaLocation;
 }

/**
* 
* @return
* The name
*/
public String getName() {
return name;
 }

/**
* 
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
 }

/**
* 
* @return
* The xmlnsSec
*/
public String getXmlnsSec() {
return xmlnsSec;
 }

/**
* 
* @param xmlnsSec
* The xmlns:sec
*/
public void setXmlnsSec(String xmlnsSec) {
this.xmlnsSec = xmlnsSec;
 }

/**
* 
* @return
* The xmlnsXsi
*/
public String getXmlnsXsi() {
return xmlnsXsi;
 }

/**
* 
* @param xmlnsXsi
* The xmlns:xsi
*/
public void setXmlnsXsi(String xmlnsXsi) {
this.xmlnsXsi = xmlnsXsi;
 }

/**
* 
* @return
* The xmlnsWls
*/
public String getXmlnsWls() {
return xmlnsWls;
 }

/**
* 
* @param xmlnsWls
* The xmlns:wls
*/
public void setXmlnsWls(String xmlnsWls) {
this.xmlnsWls = xmlnsWls;
 }

/**
* 
* @return
* The jdbcDataSourceParams
*/
public JdbcDataSourceParams getJdbcDataSourceParams() {
return jdbcDataSourceParams;
 }

/**
* 
* @param jdbcDataSourceParams
* The jdbc-data-source-params
*/
public void setJdbcDataSourceParams(JdbcDataSourceParams jdbcDataSourceParams) {
this.jdbcDataSourceParams = jdbcDataSourceParams;
 }

}