import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Alerts_test {
    @Test
    public void alertTest(){
        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("");
        driver.findElement(By.id("#something"));

    }

}
