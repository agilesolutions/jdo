package ch.agilesolutions.jboss.platform.weblogic;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Properties {

	@SerializedName("property")
	@Expose
	private List<Property> property = new ArrayList<Property>();

	/**
	 * 
	 * @return The property
	 */
	public List<Property> getProperty() {
		return property;
	}

	/**
	 * 
	 * @param property
	 *            The property
	 */
	public void setProperty(List<Property> property) {
		this.property = property;
	}

}
