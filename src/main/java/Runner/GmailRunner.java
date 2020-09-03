package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\ShriHari\\AutomationScripts\\MyFirstFramework\\src\\main\\java\\Features\\Gmail.feature",

        glue = {"stepDefinitions" }, 
		monochrome = true, // display the console output in a proper readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = true // to check the mapping is proper between feature file and step def file

)

public class GmailRunner {

}
