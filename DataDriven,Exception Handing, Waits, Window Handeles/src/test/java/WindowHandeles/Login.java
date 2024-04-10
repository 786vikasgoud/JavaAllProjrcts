package WindowHandeles;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Login {
    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/DataDrivenTesting/src/main/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F%3Futm_source%3Dadwords-brand%26utm_medium%3Dudemyads%26utm_campaign%3DBrand-Udemy_la.EN_cc.INDIA_dev.%26utm_term%3D_._ag_133043842301_._ad_595460368494_._de_c_._dm__._pl__._ti_aud-1738475842996%3Akwd-296956216253_._li_9062015_._pd__._%26utm_term%3D_._pd__._kw_udemy_._%26matchtype%3Db%26gad_source%3D1%26gclid%3DCj0KCQiAn-2tBhDVARIsAGmStVljxb6hNsE_o_kqovcqXwRYnNUXeb0oUAlGfqqjfNEN9_47CIKy0-8aAuhAEALw_wcB");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@data-purpose='google-login']")).click();
        ArrayList<String> windowHandles=new ArrayList<>(driver.getWindowHandles());
        System.out.println(windowHandles.size());
        String str = driver.getTitle();
        System.out.println(str+"this");
        driver.switchTo().window(windowHandles.get(1));
        WebElement sin = driver.findElement(By.xpath("//input[@id='identifierId']"));
        sin.sendKeys("vikkydada421@gmail.com");
        driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
        if(sin.isDisplayed()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        String st=driver.getTitle();
        System.out.println(st);
        

    }
}
