package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "./src/main/java/Feature/demo.feature",
        glue = {"stepDefinition"},
        dryRun= false,
        format = {"pretty", "html:test-output", "json:json-output/cucumber.json", "junit:junit-out/cucumber.xml"},
		monochrome = true,
		strict = false
		//tags= {"@InvalidTest", "@ValidTest"}
)
public class testRunner {

}
