package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        //tags = "@ui",
        features = "src/test/resources",
        glue = "stepDefinitions",
        stepNotifications = true
        //,dryRun = true
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
        ,plugin = {
                 //"pretty",
                 "html:target/cucumber-built-in-report.html",
                 "json:target/cucumber.json",
                 //"rerun:target/failed.txt"
        }
)

public class CucumberRunner {
}
