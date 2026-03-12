package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/features/createlead.feature", glue="stepDefinition", monochrome=true, publish=true,plugin = {"pretty","summary"})
public class runnerClass1  extends AbstractTestNGCucumberTests{
	


}
