package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    WebElement login;
    @FindBy(xpath = "//input[@id='ap_email']")WebElement email;
    @FindBy(xpath = "//input[@id='continue']")WebElement continueButton;
}
