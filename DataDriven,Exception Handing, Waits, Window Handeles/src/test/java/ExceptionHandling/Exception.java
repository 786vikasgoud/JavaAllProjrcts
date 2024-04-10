package ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception extends Throwable {
    public void exceptionHandling(){
        WebDriver driver=new ChromeDriver();
        try{
            driver.findElement(By.xpath("//fake")).click();//it throws Exxception not present
        }
        catch (java.lang.Exception e){
            System.out.println("vikas");
            throw (e);
        }
    }
}
