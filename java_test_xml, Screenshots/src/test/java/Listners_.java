import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utlities.capturescreenshots;

import java.io.IOException;

public class Listners_ extends capturescreenshots implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("test start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("test sucess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            getScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("test fail  with build sucess");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("test starrt");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("on finish");
    }
}
