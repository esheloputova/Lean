package pages;

import io.qameta.allure.Attachment;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }


    @Override
    public void onTestFailure(ITestResult iTestResult) {
        LoginPage app = (LoginPage) iTestResult.getTestContext().getAttribute("LoginPage");
        saveScreenshot(LoginPage.takeScreenshot()) ;
//        saveScreenshot(BusinessIdeaPage.takeScreenshot());
//        saveScreenshot(BusinessModelPage.takeScreenshot());

    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot){
        return screenShot;
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }


    @Override
    public void onFinish(ITestContext iTestContext) {

    }

}
