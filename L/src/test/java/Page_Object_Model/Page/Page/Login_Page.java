package Page_Object_Model.Page.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    WebDriver driver;
    public Login_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.XPATH,using = "//a[@id='nav-link-accountList']") WebElement login;
    @FindBy(how=How.XPATH,using = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")WebElement username;
    public void loginPage(){
        login.click();
        username.sendKeys("shivaiahgarivikasgoud@gmail.com");
    }
}
