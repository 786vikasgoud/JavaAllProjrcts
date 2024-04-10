package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mytest {
    @Test
    public void print(){
        System.out.println("hoo");
        System.out.println("hello");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chat.openai.com/");
    }
}
