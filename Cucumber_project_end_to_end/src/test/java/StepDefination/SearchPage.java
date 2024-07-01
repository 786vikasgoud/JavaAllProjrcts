package StepDefination;

import Pages.Search;
import Pages.login;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage {
    WebDriver driver;
    login LoginPage;
    Search searchPage;
    String oldWindow;
    String currentWindow;

    @Given("lanch the chrome browser")
    public void lanching_the_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @When("Login into the login page")
    public void login_into_the_login_page() {
        System.out.println("1 when");
       LoginPage = new login(driver);
       LoginPage.signInBtnClick();
       LoginPage.sign("shivaiahgarivikasgoud@gmail.com","Vikas786@");
       LoginPage.signingIn();
    }
    @When("Search for the product")
    public void search_for_the_product() {
        searchPage = new Search(driver);
        searchPage.searchProduct();
        oldWindow = driver.getWindowHandle();

    }
    @When("click the product link")
    public void click_the_product_link() {
        searchPage.productLink();
    }
    @Then("new tab will open")
    public void new_tab_will_open() {
        searchPage.windowShift();
        currentWindow = driver.getWindowHandle();
        Assert.assertEquals(oldWindow,currentWindow);
    }
    @Then("validate the correct product is displayed or not")
    public void validate_the_correct_product_is_displayed_or_not() {
        System.out.println("all are sucessfull");
//        driver.close();
//        driver.switchTo().window(oldWindow);
        driver.quit();
    }

}
