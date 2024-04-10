package WebDriverListners;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ListenerMainClass {
    @Test
    public void implementOfWebDriverListners() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        EventFiringWebDriver eventHandler=new EventFiringWebDriver(driver);
        EventCapture eCapture = new EventCapture();
        eventHandler.register(eCapture);
        eventHandler.navigate().to("https://www.edureka.co/blog/");
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(3000);
        eventHandler.findElement(By.linkText("Software Testing")).click();
        eventHandler.navigate().to("https://www.edureka.co/all-courses");
        eventHandler.navigate().back();
        eventHandler.quit();
        eventHandler.unregister(eCapture);
        System.out.println("End of theListners Class");


    }
}
