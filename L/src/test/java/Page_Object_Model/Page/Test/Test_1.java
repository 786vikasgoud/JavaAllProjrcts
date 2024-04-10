package Page_Object_Model.Page.Test;

import Page_Object_Model.Page.Page.LogOut;
import Page_Object_Model.Page.Page.Login_Page;
import org.example.ConfigRead;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Test_1 {
    WebDriver driver;
    //@BeforeSuite
    public void beforeSute(){
        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/login/src/main/resources/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

    }
    @AfterSuite
    public void afterSute() {

    }
    @Test
    public void test(){
        ConfigRead con=new ConfigRead();
        String str = con.getData();
        System.out.println(str);
//        Login_Page log=new Login_Page(driver);
//        log.loginPage();
//        LogOut out=new LogOut(driver);
//        out.logOut();
    }
}
