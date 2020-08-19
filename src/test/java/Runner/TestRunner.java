package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\eclipse\\EcomBDDFramework\\src\\main\\java\\com\\flipkart\\features\\com.feature", //the path of the feature files
		glue={"stepDefinitions"}, //the path of the step definition files
		
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, 
		strict = true, 
		dryRun = true 
				
		)

public class TestRunner {

}
