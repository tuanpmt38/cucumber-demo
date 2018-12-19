package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/Login.feature",
        glue = "stepDefinitions",
        plugin = {"pretty","html:target/cucumber","json:jsonOutput/login.json"},
        monochrome = true,
        strict = true,
        dryRun = false) // mapping class test runner and file feature
public class LoginTestRunner {
}
