package com.agilesolutions.jboss.standalone;

import java.io.File;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

/**
 * https://github.com/joelittlejohn/jsonschema2pojo/wiki/Getting-Started#using-jsonschema2pojo-within-your-java-project-embedded
 * http://www.jsonschema2pojo.org/
 * http://stackoverflow.com/questions/34538493/jsonschema2pojo-with-url-doesnt-works
 * 
 * https://github.com/joelittlejohn/jsonschema2pojo
 * @author Carol
 *
 */
public class GenerateModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GenerateModel().gen();

	}

	private void gen() {

		JCodeModel codeModel = new JCodeModel();

		URL source;
		try {
			source = new URL("file:///C:/Development/Workspaces/JDO/JBossDevOps/documentation/json.txt");

			GenerationConfig config = new DefaultGenerationConfig() {
				@Override
				public boolean isGenerateBuilders() { // set config option by
														// overriding method
					return true;
				}
				
			};

			SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(), new SchemaStore()),
					new SchemaGenerator());
			mapper.generate(codeModel, "ClassName", "com.example", source);

			codeModel.build(new File("C:/Development/Workspaces/JDO/JBossDevOps/generated"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
