package ch.agilesolutions.jboss.standalone;

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

	public static void main(String[] args) {
		new XMLtoJSON().parse();

	}

	// http://stackoverflow.com/questions/26113512/how-to-retrieve-the-values-from-json
	private void parse() {

		try {
			
			PrintWriter out = new PrintWriter("Y:\\jbossdev\\workspaces\\workspace_docker\\jdo\\documentation\\json.txt");
			
			byte[] encoded = Files.readAllBytes(Paths.get("Y:\\jbossdev\\workspaces\\workspace_docker\\jdo\\documentation\\standalone.xml"));
			
			String TEST_XML_STRING = new String(encoded, "UTF-8");
			
			JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
			
			String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
			
			out.println(jsonPrettyPrintString);
			
			out.flush();
			
			out.close();
			
			System.out.println(jsonPrettyPrintString);
			
		
		} catch (Exception je) {
			System.out.println(je.toString());
		}

	}

}
