package PageObjectedModel.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Factory_Home {
    WebDriver driver;

    public void FbHomaPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how= How.XPATH,using = "//a[@id='nav-hamburger-menu']") WebElement profileDropdown;
    @FindBy(how=How.LINK_TEXT,using="Sign Out")WebElement logoutLink;
    public void clickOnProfileDropdown(){
        profileDropdown.click();
    }
    public void clickOnLogoutLink(){
        logoutLink.click();
    }
}
