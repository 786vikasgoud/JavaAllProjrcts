package Test_Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature_File/", glue = "StepDefenation",
        monochrome = true,
        plugin = {"pretty", "junit:target/JunitReports/report.xml"}
)
public class Test_Runner {
}
