import driversetup.Driver_setup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;

//@Listeners(Listners_.class)
public class login extends Driver_setup {
    @Test
    public void log() throws IOException {
        String str = driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str,"youtube");
    }
}
