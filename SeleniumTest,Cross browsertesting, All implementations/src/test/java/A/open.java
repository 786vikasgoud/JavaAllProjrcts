package A;

import org.testng.annotations.Test;

import java.time.Duration;

public class open extends A_Base{
    @Test
    public void openurl(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
    }
}
