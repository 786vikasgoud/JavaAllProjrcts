package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Data_Provider {
    @Test(dataProvider = "loginData")
    public void TestDataProvider(String userName,String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys(password);
        driver.findElement(By.cssSelector("#signInSubmit")).click();
    }
    @DataProvider(name="loginData")
    public String[][] loginData(){
        String[][] data=new String[2][2];
        data[0][0]="shivaiahgarivikasgoud@gmail.com";
        data[0][1]="Vikas786@";

        data[1][0]="shivaiah@gmail.com";
        data[1][1]="Vikas786@";

        return data;
    }

}
