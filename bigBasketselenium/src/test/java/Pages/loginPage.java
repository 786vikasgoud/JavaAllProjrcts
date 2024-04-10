package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class loginPage {
    WebDriver driver;
    Actions actions;
    public loginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@id='headlessui-menu-button-:R5bab6:']")
    WebElement Category;
    @FindBy(xpath = "(//a[@class='CategoryTree___StyledLink-sc-8wbym9-0 gTvqBK'])[12]")
    WebElement Fruits;
    @FindBy(xpath = "(//a[@class='CategoryTree___StyledLink2-sc-8wbym9-1 mLodv'])[9]")
    WebElement Flowers;
    @FindBy(xpath = "(//a[@class='CategoryTree___StyledLink3-sc-8wbym9-2 kTPRNM'])[6]")
    WebElement mariGold;

    public void getAllFlowers(){
        Category.click();
        actions = new Actions(driver);
        actions.moveToElement(Fruits).pause(Duration.ofSeconds(3)).moveToElement(Flowers).click().perform();

        //.pause(Duration.ofSeconds(3)).moveToElement(mariGold).pause(Duration.ofSeconds(3))
    }
}
