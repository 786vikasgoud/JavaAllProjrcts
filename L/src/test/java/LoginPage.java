import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    @Test
    public void LoginPage(){


        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/login/src/main/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("shivaiahgarivikasgoud@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Vikas786@");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();



    }
}
