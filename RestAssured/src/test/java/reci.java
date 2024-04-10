import org.testng.ITestContext;
import org.testng.annotations.Test;

public class reci {
    @Test
    public void retrieveAttribute(ITestContext context) {
        String username = (String) context.getAttribute("username");
        System.out.println("Retrieved Username: " + username);
    }
}
