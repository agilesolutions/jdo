package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DatasourceRoot {

@SerializedName("jdbc-data-source")
@Expose
private JdbcDataSource jdbcDataSource;

/**
* 
* @return
* The jdbcDataSource
*/
public JdbcDataSource getJdbcDataSource() {
return jdbcDataSource;
 }

/**
* 
* @param jdbcDataSource
* The jdbc-data-source
*/
public void setJdbcDataSource(JdbcDataSource jdbcDataSource) {
this.jdbcDataSource = jdbcDataSource;
 }

}