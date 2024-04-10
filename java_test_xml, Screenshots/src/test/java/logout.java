import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logout {

    WebDriver driver;
    @BeforeTest
    public void before() {
        System.out.println("i am in the before logout");
    }

    @AfterTest
    public void after() {
        System.out.println("i am in the after logout");
        driver.quit();
    }

    @Test
    public void logout_() {
        driver= new ChromeDriver();
        driver.get("https://www.youtube.com/");
        String str = driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str,"YOU TUBE");
    }


}
