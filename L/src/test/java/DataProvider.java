import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {


    @Test(dataProvider = "loginData")
    public void run(String userName,String Pass){
        System.setProperty("webdriver.chrome.driver","/home/vikas/IdeaProjects/login/src/main/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(Pass);
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

    }
    @org.testng.annotations.DataProvider (name="loginData")
    public String[][] loginData(){
        String arr[][]=new String[2][2];
        arr[0][0]="shivaiahgarivikasgoud@gmail.com";
        arr[0][1]="Vikas786@";
        arr[1][0]="shivaiahgarivikasgoud@gmail.com";
        arr[1][1]="Vikas786";
        return arr;
    }
}
