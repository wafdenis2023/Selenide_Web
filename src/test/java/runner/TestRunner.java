package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"hooks", "stepdefinitions"},
        tags = "@LoginRequired or @login",
        plugin = {
                "pretty",
                "summary",
                "html:target/reports/cucumber-reports",
                "json:target/reports/cucumber.json",
                "progress:target/reports/cucumber-progress.txt",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
