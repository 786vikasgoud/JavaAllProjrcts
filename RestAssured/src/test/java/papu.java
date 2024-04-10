import org.testng.ITestContext;
import org.testng.annotations.Test;

public class papu {

    @Test
    public void setAttribute(ITestContext context) {
        context.setAttribute("username", "Vikas");
    }
}
