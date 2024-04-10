package utlities;
import driversetup.Driver_setup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class capturescreenshots extends Driver_setup {
    public void getScreenShot() throws IOException {
        File ScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenshotFile, new File("/home/vikas/IdeaProjects/java_test_xml/screenchots/ScreenShots/screen.png"));
    }
}
