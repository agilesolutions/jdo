package ch.agilesolutions.jboss.model;


import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.Expose;


public class Domains {
	@Expose(serialize = true)
	private Map<String,String> instances = new HashMap<>();

	public Map<String, String> getInstances() {
		return instances;
	}
	
	

	
}
