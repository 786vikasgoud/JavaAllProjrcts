import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;




import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.Key;
import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;


public class test_windowhandle {
    WebDriver driver;
    String s = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

    @BeforeTest
    public void beforetest(){
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elememt_some=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));
        driver.manage().window().maximize();
    }
    @Test
    public void windowhandle() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9951962196");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Vikas786@");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
        String str = driver.getTitle();
        Assert.assertEquals(str,s);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s22ultra"+ Keys.ENTER);
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),' (Green, 12GB, 256GB Storage) with No Cost EMI/Additional Exchange Offers')]")));
        driver.findElement(By.xpath("//span[contains(text(),' (Green, 12GB, 256GB Storage) with No Cost EMI/Additional Exchange Offers')]")).click();
        String originalwindow = driver.getWindowHandle();
        wait.until(numberOfWindowsToBe(2));
        for(String windows:driver.getWindowHandles()){
            if(!originalwindow.contentEquals(windows)){
                driver.switchTo().window(windows);
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(originalwindow);
        String str1 = driver.getTitle();
        Assert.assertNotEquals(str1,s);


    }
    @AfterTest
    public void aftertest(){
        driver.quit();
    }

}
