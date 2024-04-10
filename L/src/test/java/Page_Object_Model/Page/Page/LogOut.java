package Page_Object_Model.Page.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
    WebDriver driver;
    public LogOut(WebDriver driver){
       this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how= How.XPATH,using = "")
    WebElement menu;
    @FindBy(how=How.XPATH,using = "")WebElement signOut;
    public void logOut(){
        menu.click();
        signOut.click();
    }
}
