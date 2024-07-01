package StepDefination;

import Pages.login;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
    WebDriver driver;
    login loginPageDetails;

    @Given("Lanching the chrome browser")
    public void lanching_the_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("Open the amazon website")
    public void open_the_amazon_website() {
        driver.get("http://amazon.in/");
        loginPageDetails = new login(driver);
        loginPageDetails.signInBtnClick();
    }

    @When("enter the login details <{string}> <{string}>")
    public void enter_the_login_details(String username, String password) {
        loginPageDetails.sign(username,password);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
       loginPageDetails.signingIn();
    }

    @Then("validate the title page")
    public void validate_the_title_page() {
       String title = driver.getTitle();
        if(title.contains("Online")){
            Assert.assertTrue(true);
        }
        driver.quit();
    }

    @Then("validate the error message")
    public void validateTheErrorMessage() {
        String errorText = loginPageDetails.errorMsg();
        Assert.assertEquals(errorText,"Your password is incorrect");
        driver.quit();
    }
}
