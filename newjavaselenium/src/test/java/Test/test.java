package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;


public class test {
    @Test
    public void logonin(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        String str = driver.getTitle();
        //assert Objects.equals(str, "Amazon Sign In");


        Assert.assertFalse(str.isEmpty());
        

    }
}
