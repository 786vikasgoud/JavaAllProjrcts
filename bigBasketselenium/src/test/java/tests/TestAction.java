package tests;

import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestAction {
    @Test
    public void actionPerform(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com");
        loginPage login = new loginPage(driver);
        login.getAllFlowers();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
