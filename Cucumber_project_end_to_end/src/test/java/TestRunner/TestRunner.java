package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFile",
        glue = "StepDefination",
        monochrome = true,
        tags = "@smoke"
)
public class TestRunner {
}
