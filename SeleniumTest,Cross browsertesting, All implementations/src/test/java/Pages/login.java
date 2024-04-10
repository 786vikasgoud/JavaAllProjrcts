package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login {
    WebDriver driver;
    public login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='H6-NpN _3N4_BX']")
    WebElement login_btn;
    @FindBy(xpath =  "//input[@class='_2IX_2- VJZDxU']")
    WebElement input;

    public void login_perform() throws InterruptedException {
        login_btn.click();
        input.sendKeys("9951962196");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }

}
