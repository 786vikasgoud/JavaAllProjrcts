package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class A_Base {
    WebDriver driver;
    @BeforeSuite
    public void base(){
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }
    @AfterSuite
    public void close_base(){
        driver.quit();
    }
}
