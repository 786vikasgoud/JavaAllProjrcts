package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Annotation_all {
    WebDriver driver;
    String str;
    @BeforeTest
    public void beforeTest(){
        String baseUrl="http://www.edureka.co/";
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/SeleniumTest/src/main/chromedriver");
        driver.get(baseUrl);
        System.out.println("beforeTest");
    }
    @Test
    public void Example(){
        str=driver.getTitle();
        String exceptedStr="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
        Assert.assertEquals(str,exceptedStr);
        System.out.println(str);
    }
    @AfterTest
    public void afterTest(){
        driver.close();
        System.out.println("afterTest");
        System.out.println("afterTest the driver is closed");
    }
    @BeforeSuite
    public void beforeSute(){
        System.out.println("before sute");
    }
    @AfterSuite
    public void afterSute(){
        System.out.println("after sute");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after calss");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afer Method");
    }
}
