package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Set;

public class Search {
    WebDriver driver;
    String currentWindow;
    Set<String> allWindows;
    public Search(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBar;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement SearchBtn;
    @FindBy(xpath = "(//span[contains(text(),'Smartphone (Titanium Gray, 12GB, 256GB Storage)')])[1]")
    WebElement link;
//    samsung s24 ultra

    public void searchProduct(){
        searchBar.sendKeys("samsung s24 ultra");
        SearchBtn.click();
    }
    public void productLink(){
        currentWindow = driver.getWindowHandle();
        link.click();
    }
    public void windowShift(){
        allWindows = driver.getWindowHandles();
        for(String window:allWindows){
            if(window.contentEquals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
    }

}
