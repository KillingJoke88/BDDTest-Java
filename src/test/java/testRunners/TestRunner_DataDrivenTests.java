package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/essai/DataDrivenTests.feature",
		glue="",
		monochrome = true
		)
public class TestRunner_DataDrivenTests {

}
