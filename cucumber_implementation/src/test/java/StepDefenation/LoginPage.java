package StepDefenation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;

public class LoginPage {
    WebDriver driver ;

    @Given("Launching the chrome browser")
    public void launching_the_chrome_browser() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

    }
    @When("Enter the {string} and {string}")
    public void enter_the_user_name_and_password(String username,String password) {

    }
    @When("Click the login button")
    public void click_the_login_button() {
        System.out.println("this is when 2");
    }
    @Then("Verify the loodo present in the pages")
    public void verify_the_loodo_present_in_the_page() {
        System.out.println("this is then");
        driver.quit();
    }


    @When("^Enter the amazon login (.*) and (.*)$")
    public void enter_the_usernames_and_passwords(String username,String Password) {
        System.out.println(username + "  this the parameter passing  " + Password);
    }

}
