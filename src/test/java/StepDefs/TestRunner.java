package StepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)

@CucumberOptions(
		
//		monochrome=true,
		plugin= {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
		glue ="StepDefs",
//		tags = {"@WIP"},
//		tags = {"@Sanity"},
//		tags = {"@Regression or @Sanity"}  // either regression or sanity
//		tags = {"@Regression and @Sanity"}  // both the tags should be there then that scenario will be executed.
//		tags = {"@Calculator"} // feature level tag
//		tags = {"not @WIP"}  // It'll run all other scenarios except the @WIP scenario
		tags = {"@Browser and not @WIP"} // Run all @Browser scenarios but not @WIP

		)

public class TestRunner {
	
	

}
