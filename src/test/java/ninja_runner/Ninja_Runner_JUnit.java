package ninja_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Ninja_feature_files"},
		glue = {"ninja_factory", "ninja_hooks", "ninja_step_defination_files"},
		publish = true,
		plugin = {"pretty", "html:target/site/NinjaReportForCucumber.html", "json:target/NinjaReportForCucumber/json"},
		tags = ""
		
		)

public class Ninja_Runner_JUnit {

}
