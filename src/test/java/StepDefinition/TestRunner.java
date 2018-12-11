package StepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="./src/test/java/Feature",
        //tags = {"@regression"},
        glue={"StepDefinition"},
        //format = {"json:target/cucumber.json" +
        //        ""}
        plugin = { "pretty", "html:target/cucumber-reports" }
        //plugin = { "pretty", "json:target/cucumber.json" }
)
public class TestRunner {
}
