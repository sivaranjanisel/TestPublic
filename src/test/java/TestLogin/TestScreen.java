package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.qameta.allure.Attachment;

public class TestScreen {
	
	    FirefoxDriver d;
	    @Test
	    public void reportGoogleTest(ITestContext testContext) {
	        d = new FirefoxDriver();
	        testContext.setAttribute("WebDriver", this.d);
	        System.out.println(testContext.getAttribute("WebDriver"));
	        d.get("https://www.google.co.in/");
	        d.findElement(By.name("q")).sendKeys("abcd");
	        // captureScreenshot();
	        throw new AssertionError();
	    }
	    @AfterMethod(alwaysRun = true)
	    public void close(ITestResult testResult) {
	        d.close();
	    }


	// The TestNG listener class

	    @Attachment
	    public byte[] captureScreenshot(WebDriver d) {
	        return ((TakesScreenshot) d).getScreenshotAs(OutputType.BYTES);
	    }
	    public void onTestFailure(ITestResult tr) {
	        Object webDriverAttribute = tr.getTestContext().getAttribute("WebDriver");
	        if (webDriverAttribute instanceof WebDriver) {
	            System.out.println("Screesnshot captured for test case:" + tr.getMethod().getMethodName());
	            captureScreenshot((WebDriver) webDriverAttribute);
	        }
	    }
	
}
