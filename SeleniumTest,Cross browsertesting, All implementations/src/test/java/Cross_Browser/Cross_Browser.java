package Cross_Browser;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Cross_Browser {
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser) throws Exception {
        if(browser.equalsIgnoreCase("chrome")){
           driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else {
            driver=new ChromeDriver();
        }
    }
    @Test
    @Parameters({"username","password"})
    public void testcrossbroswer(String username,String password) throws InterruptedException {
        driver.get("https://stackoverflow.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("collections in java");
        System.out.println(username+"  "+password);
    }
    @AfterTest
    public void aftertest(){
        driver.quit();
    }
}
