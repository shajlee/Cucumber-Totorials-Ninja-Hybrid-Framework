package ninja_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Ninja_feature_files"},
		glue = {"ninja_factory", "ninja_hooks", "ninja_step_defination_files"},
		publish = true,
		plugin = {"pretty", "html:target/site/NinjaReportForCucumber.html", "json:target/NinjaReportForCucumber/json"},
		tags = ""
		
		)

public class Ninja_Runner_TestNG extends AbstractTestNGCucumberTests {
	
	

}
