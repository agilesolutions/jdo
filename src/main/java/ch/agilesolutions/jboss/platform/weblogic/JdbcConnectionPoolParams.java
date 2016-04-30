package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class JdbcConnectionPoolParams {

	@SerializedName("max-capacity")
	@Expose
	private Integer maxCapacity;
	@SerializedName("test-connections-on-reserve")
	@Expose
	private Boolean testConnectionsOnReserve;
	@SerializedName("initial-capacity")
	@Expose
	private Integer initialCapacity;
	@SerializedName("min-capacity")
	@Expose
	private Integer minCapacity;
	@SerializedName("test-table-name")
	@Expose
	private String testTableName;

	/**
	 * 
	 * @return The maxCapacity
	 */
	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * 
	 * @param maxCapacity
	 *            The max-capacity
	 */
	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	/**
	 * 
	 * @return The testConnectionsOnReserve
	 */
	public Boolean getTestConnectionsOnReserve() {
		return testConnectionsOnReserve;
	}

	/**
	 * 
	 * @param testConnectionsOnReserve
	 *            The test-connections-on-reserve
	 */
	public void setTestConnectionsOnReserve(Boolean testConnectionsOnReserve) {
		this.testConnectionsOnReserve = testConnectionsOnReserve;
	}

	/**
	 * 
	 * @return The initialCapacity
	 */
	public Integer getInitialCapacity() {
		return initialCapacity;
	}

	/**
	 * 
	 * @param initialCapacity
	 *            The initial-capacity
	 */
	public void setInitialCapacity(Integer initialCapacity) {
		this.initialCapacity = initialCapacity;
	}

	/**
	 * 
	 * @return The minCapacity
	 */
	public Integer getMinCapacity() {
		return minCapacity;
	}

	/**
	 * 
	 * @param minCapacity
	 *            The min-capacity
	 */
	public void setMinCapacity(Integer minCapacity) {
		this.minCapacity = minCapacity;
	}

	/**
	 * 
	 * @return The testTableName
	 */
	public String getTestTableName() {
		return testTableName;
	}

	/**
	 * 
	 * @param testTableName
	 *            The test-table-name
	 */
	public void setTestTableName(String testTableName) {
		this.testTableName = testTableName;
	}

}
