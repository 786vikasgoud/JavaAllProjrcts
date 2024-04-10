package PageObjectedModel.Tests;

import PageObjectedModel.Pages.Page_Factory_Home;
import PageObjectedModel.Pages.Page_Factory_Login;
import TestNgListners.ListnersTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(ListnersTest.class)
public class FbLoginTest extends TestBase{
    @Test
    public void init() throws Exception{
        WebElement searchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Page_Factory_Login loginpage_1= PageFactory.initElements(driver,Page_Factory_Login.class);
        loginpage_1.setSignIn();
        loginpage_1.setEmail("shivaiahgarivikasgoud@gmail.com");
        loginpage_1.setContinue();
        loginpage_1.setPassword("Vikas786@");
        loginpage_1.setSignInButton();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
//        Page_Factory_Home logout_1=PageFactory.initElements(driver,Page_Factory_Home.class);
//        logout_1.clickOnProfileDropdown();
//        Thread.sleep(2000);
//        logout_1.clickOnLogoutLink();
    }
}
