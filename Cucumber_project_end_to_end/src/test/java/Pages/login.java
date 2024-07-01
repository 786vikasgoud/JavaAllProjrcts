package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
    WebDriver driver;
    public login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    WebElement signInBtn;
    @FindBy(xpath = "//input[@id='ap_email']") WebElement email;
    @FindBy(xpath = "//input[@id='continue']") WebElement Continue;
    @FindBy(xpath = "//input[@id='ap_password']") WebElement password;
    @FindBy(xpath = "//input[@id='signInSubmit']") WebElement signIn;
    @FindBy(xpath = "//span[contains(text(),'Your password is incorrect')]") WebElement error;
    public void signInBtnClick(){
        signInBtn.click();
    }
    public void sign(String emails,String passwordd){
        email.sendKeys(emails);
        Continue.click();
        password.sendKeys(passwordd);
    }
    public void signingIn(){
        signIn.click();
    }

    public String errorMsg(){
        String str = error.getText();
        return str;
    }
}
