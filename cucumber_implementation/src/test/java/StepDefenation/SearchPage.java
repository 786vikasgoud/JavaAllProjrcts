package StepDefenation;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage {

    WebDriver driver;
    @Given("launch the chrome browser")
    public void launch_the_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @Given("open the Amazon website")
    public void open_the_amazon_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("sucessfully open the browser");
    }

    @When("enter the login details")
    public void enter_the_login_details() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login sucessfull");
    }

    @Then("search for the product")
    public void search_for_the_product() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("search is sucessfull");
    }

    @Then("chech the search is sucessfull")
    public void chech_the_search_is_sucessfull() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("checked the search");
        driver.quit();
    }

}
