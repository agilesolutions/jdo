package com.agilesolutions.jboss.standalone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.agilesolutions.jboss.model.Profile;
import com.agilesolutions.jboss.weblogic.Server;
import com.agilesolutions.jboss.weblogic.WeblogicJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * http://www.jsonschema2pojo.org/
 * http://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
 * 
 * @author Carol
 *
 */
public class ImportJSON {
	
	private List<Profile> profiles = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImportJSON().importJson();
	}

	private void importJson() {

		Gson gson = new Gson();

		try {

			BufferedReader br = new BufferedReader(new FileReader("C:\\Development\\Workspaces\\JDO\\JBossDevOps\\documentation\\json.txt"));
			
			//convert the json string back to object
			WeblogicJson obj = gson.fromJson(br, WeblogicJson.class);

			gson = new GsonBuilder().setPrettyPrinting().create();
			
			// Pretty print
			String prettyStaff1 = gson.toJson(obj);
			System.out.println(prettyStaff1);


			// map to profiles
			for (Server server : obj.getDomain().getServer()) {
				
				Profile profile = new Profile();
				
				profile.setName(server.getName());
				profile.setHostName(server.getListenAddress());
				profile.getSocketBindings().put("http", server.getListenPort());
				
				
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
