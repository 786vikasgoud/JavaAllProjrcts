package driversetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver_setup {
    public static WebDriver driver = null;
    @BeforeSuite
    public void driver_setup(){
        driver= new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void driver_close(){
        driver.quit();
    }
}
