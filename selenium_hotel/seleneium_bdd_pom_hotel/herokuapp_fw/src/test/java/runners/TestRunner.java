package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\giriprasad.vasudeva\\Downloads\\selenium_hotel\\selenium_hotel\\seleneium_bdd_pom_hotel\\herokuapp_fw\\features\\validateHomePageTItle.feature",
				glue={"stepdefinition"}
		)
public class TestRunner {

}
