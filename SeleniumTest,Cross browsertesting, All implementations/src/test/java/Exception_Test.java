import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exception_Test {
    @Test
    public void exception_test() throws InterruptedException {
        System.setProperty("webdriver,chromme,driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        try{
            //NoSuchElementException
            driver.findElement(By.name("fake")).click();
            //types of exceptions
            //webdriverexception
            //NosuchElementException
            //nosuchframeException
            //noAlretFoundException
            //TimeOutException
            driver.switchTo().window("Fail");
            driver.switchTo().alert().accept();
            driver.switchTo().frame("Fail");


        }catch(Exception e){
            System.out.println("I am vikas");
            throw(e);
        }
        System.out.println("hello");
    }
}
