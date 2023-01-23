import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/example/features",
        plugin = {"pretty", "html:target/reports/cucumber-html-report.html", "json:target/reports/cucumber.json",
                "junit:target/Cucumber.xml"},
        glue = {"org/example/stepsDefinition"},
        tags = "@smoke"
)
public class TestRunner {

}
