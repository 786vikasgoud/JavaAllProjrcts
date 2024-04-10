package PageObjectedModel.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver=null;
    @BeforeSuite
    public void initialize(){
//        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void TeardownTest(){
        TestBase.driver.quit();
    }
}
