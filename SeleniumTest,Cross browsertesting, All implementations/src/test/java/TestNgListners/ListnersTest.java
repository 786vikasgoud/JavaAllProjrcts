package TestNgListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        Reporter.log("test is sucess");
        System.out.println("on test start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("sucess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("test failure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
