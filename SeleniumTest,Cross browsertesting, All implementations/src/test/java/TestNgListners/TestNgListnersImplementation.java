package TestNgListners;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners (ListnersTest.class)
public class TestNgListnersImplementation {
    @Test
    public void Loginin() throws InterruptedException {
//        System.setProperty("webdriver,chrome,driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(10000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.manage().window().maximize();
      //  driver.findElement(By.className("open_search_overlay")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f2");
        driver.findElement(By.id("nav-search-submit-button")).click();
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);

    }
    @Test
    public void forcedFail(){
        Assert.assertTrue(false);
    }
}
