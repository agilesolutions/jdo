package ch.agilesolutions.jboss.standalone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONObject;
import org.json.XML;

import com.google.gson.Gson;

import ch.agilesolutions.jboss.platform.jboss.JBossJson;
import ch.agilesolutions.jboss.platform.weblogic.WeblogicJson;

public class TestImport {
	
	private static final int PRETTY_PRINT_INDENT_FACTOR = 4;

	public static void main(String[] args) {
		new TestImport().test();

	}

	
	private void test() {
		
		try {
			
			Gson gson = new Gson();
			
			byte[] encoded = Files.readAllBytes(Paths.get("Y:\\jbossdev\\workspaces\\workspace_docker\\jdo\\documentation\\standalone.xml"));
			
			List<String> lines = Files.readAllLines(Paths.get("Y:\\jbossdev\\workspaces\\workspace_docker\\jdo\\documentation\\standalone.xml"));
			
			StringBuilder listString = new StringBuilder();

			for (String s : lines)
			     listString.append(s);
			
			JSONObject xmlJSONObj = XML.toJSONObject(listString.toString());

			String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);

			//System.out.println(jsonPrettyPrintString);

			
			jsonPrettyPrintString = jsonPrettyPrintString.replaceAll("\\$\\{.*\\}", "100");
			
			System.out.println(jsonPrettyPrintString);
			
			try {
				JBossJson jj = gson.fromJson(jsonPrettyPrintString, JBossJson.class);

				System.out.println(jj.getServer().toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
