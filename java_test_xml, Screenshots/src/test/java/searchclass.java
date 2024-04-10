import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@Test(threadPoolSize = 2,invocationCount = 2)
public class searchclass {
    WebDriver driver;

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }

    @AfterTest
    public void after() throws InterruptedException {
        System.out.println("i am in the after search class");
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }

    @Test
//    @Test(threadPoolSize = 1, invocationCount = 1, timeOut = 10000)
    public void log() {
        String str = driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str,str);

    }
//    @Test(threadPoolSize = 1, invocationCount = 1, timeOut = 10000)
    @Test
    public void loginty() {
//        driver = new ChromeDriver();
//        driver.get("https://www.youtube.com/");
        String str = driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str,str);

    }
}
