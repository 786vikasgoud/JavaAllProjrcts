import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class selenium_01 {
    @Test
    public void Testing_amazon(){


//        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.amazon.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("umbrella");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//        driver.findElement(By.xpath("//span[contains(text(),'Up to 9.9 oz')]")).click();


//        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.amazon.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco F1");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//        driver.findElement(By.linkText("Include Out of Stock")).click();
//        driver.navigate().to("http://edureka.co/blog");
//        driver.navigate().back();
//        driver.quit();

        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(12,TimeUnit.SECONDS);
        //driver.findElement(By.id("gh-ac")).sendKeys("oneplus 6t");
//        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("oneplus 6t");
        //driver.findElement(By.cssSelector("[class*='gh-tb u']")).sendKeys("oneplus 6t");
//        driver.findElement(By.cssSelector("[class^='gh-tb u']")).sendKeys("oneplus 6t");
//        driver.findElement(By.cssSelector("[class$='gh-tb u']")).sendKeys("oneplus 6t");

        driver.findElement(By.cssSelector("[class*='gh-tb u']")).sendKeys("oneplus 6t");

        WebElement element = driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']"));



    }
}
