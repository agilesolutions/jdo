package com.agilesolutions.jboss.standalone;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

/**
 * http://www.jsonschema2pojo.org/
 * http://www.jsonschema2pojo.org/
 * @author Carol
 *
 */
public class XMLtoJSON {

	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	private static final String XML_TEXT = "<server xmlns=\"urn:jboss:domain:1.7\"><system-properties><property name=\"port\" value=\"9999\"/></system-properties></server>";

	public static void main(String[] args) {
		new XMLtoJSON().parse();
		// TODO Auto-generated method stub

	}

	// http://stackoverflow.com/questions/26113512/how-to-retrieve-the-values-from-json
	private void parse() {

		try {
			
			PrintWriter out = new PrintWriter("C:\\Development\\Workspaces\\JDO\\JBossDevOps\\documentation\\json.txt");
			
			byte[] encoded = Files.readAllBytes(Paths.get("C:\\Development\\Workspaces\\JDO\\JBossDevOps\\documentation\\config.xml"));
			
			String TEST_XML_STRING = new String(encoded, "UTF-8");
			
			JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
			
			
			String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
			
			out.println(jsonPrettyPrintString);
			
			out.flush();
			
			out.close();
			
			System.out.println(jsonPrettyPrintString);
			
			JSONObject root = XML.toJSONObject(XML_TEXT);
			

			JSONObject heading = root.getJSONObject("server");
			
			String namespace = heading.getString("xmlns");
			
			System.out.println(namespace);
		
		} catch (Exception je) {
			System.out.println(je.toString());
		}

	}

}
