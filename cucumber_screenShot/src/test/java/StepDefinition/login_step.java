package StepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class login_step {

WebDriver driver;
    @Given("Lanching the chrome browser")
    public void lanching_the_chrome_browser() {
       driver = new ChromeDriver();
    }
    @When("Enter the login details")
    public void enter_the_login_details() {
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }
    @When("Click the login button")
    public void click_the_login_button() throws InterruptedException {
        System.out.println("driver open");
        Thread.sleep(4000);
//        fail("Intentaionally failing the screenshots");
    }
    @Then("User should login to login page")
    public void user_should_login_to_login_page() {
        System.out.println("this is good");
    }
    @After(order = 1)
    public void takeScreenShotsOnFailure(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
            System.out.println("test fail");
        }
    }

    @After(order = 0)
    public void tearDown() {
        driver.close();

    }

}
