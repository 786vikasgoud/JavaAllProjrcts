package comtest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ui_automation {
    @Test
    public void android() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(System.getProperty("user.dir")+"/apps/Android-MyDemoAppRN.1.3.0.build-244 (1).apk");
        AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("open menu")).click();
        driver.findElement(AppiumBy.accessibilityId("menu item log in")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");
        driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Login button")).click();
    }
//    @Test
//    public void perform_all_gestures(){
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setApp(System.getProperty("user.dir")+"")
//    }
}

//    {
//        "appium:deviceName": "samsung fold",
//            "platformName": "android",
//            "appium:automationName": "UiAutomator2",
//            "appium:app": "/home/vikas/IdeaProjects/Aapium2.0/apps/Android-MyDemoAppRN.1.3.0.build-244.apk"
//    }
//    @Test
//    public void android1() throws MalformedURLException, InterruptedException {
//        UiAutomator2Options options  = new UiAutomator2Options();
//        options.setDeviceName("samsung")
//                .setPlatformName("android")
//                .setAutomationName("UiAutomator2")
//                .setApp(System.getProperty("user.dir")+"/apps/Android-NativeDemoApp-0.4.0.apk");
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
//        Thread.sleep(4000);
//        driver.quit();
//    }

