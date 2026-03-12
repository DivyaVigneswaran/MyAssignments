package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/features/salesforce.feature", glue="stepDefinition", monochrome=true, publish=true,plugin = {"pretty","summary"})
public class salesforce_class extends AbstractTestNGCucumberTests {

}
