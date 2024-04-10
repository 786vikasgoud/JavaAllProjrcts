package PageObjectedModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Page_Factory_Login {
    WebDriver driver;
    public void FbLoginPage(WebDriver driver){
        this.driver=driver;
//        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.XPATH,using = "//a[@id='nav-link-accountList']") WebElement signIn;
    @FindBy(how=How.XPATH,using = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']") WebElement email;
    @FindBy(how = How.XPATH,using = "//input[@class='a-button-input']")WebElement Continue;
    @FindBy(how=How.XPATH,using = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']") WebElement password;
    @FindBy(how=How.ID,using = "signInSubmit") WebElement signInButton;


    public void setSignIn(){
        signIn.click();
    }
    public void setEmail(String strMail){
        email.sendKeys(strMail);
    }

    public void setContinue(){
        Continue.click();
    }
    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }
    public void setSignInButton() throws InterruptedException {
        signInButton.click();
    }
}
