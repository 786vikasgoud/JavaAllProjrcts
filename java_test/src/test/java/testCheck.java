import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCheck {
    WebDriver driver;
    @BeforeTest
    public void beforetest(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }
    @Test
    public void launch(){
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("shivaiahgarivikasgoud@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Vikas786@");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        String str = driver.getTitle();
        String s = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(str,s);
    }
    @AfterTest
    public void aftertest(){
        driver.quit();
    }
}
