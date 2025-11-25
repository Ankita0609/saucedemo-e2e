package utils;

import driver.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {

    private String screenshotDir = ConfigReader.get("screenshotDir");

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            File src = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
            String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String name = result.getName() + "_" + time + ".png";
            File target = new File(screenshotDir, name);
            FileUtils.forceMkdirParent(target);
            FileUtils.copyFile(src, target);
            System.out.println("Saved screenshot: " + target.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("Unable to capture screenshot: " + e.getMessage());
        }
    }

    // other ITestListener methods left no-op or for logging
    @Override public void onTestStart(ITestResult result) {}
    @Override public void onTestSuccess(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    @Override public void onStart(ITestContext context) {}
    @Override public void onFinish(ITestContext context) {}
}
