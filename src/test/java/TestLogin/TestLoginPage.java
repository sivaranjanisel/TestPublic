package TestLogin;

import static org.testng.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import PageFactoryConcept.Login;
import Test123.Testprovider;
import Utility.ReadValue;

import Utility.SetupDriver;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;



@Epic("Regression Test Suite")
@Feature("Test the Login page")
class TestLoginPage extends SetupDriver{
	
	WebDriver driver;
    Login PageFactory;
    ReadValue rv;
   
    @BeforeSuite
    public void beforetest() {
          TSetupDriver();
          PageFactory = new Login();
          rv= new ReadValue();
      }
    
   
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Login credentials Test")
	@Story("Testcase 1")
   public void TestLoginPage1()throws IOException {		
		String user_name= rv.readConfigFile("username");
		String pwdwe= rv.readConfigFile("pwds");
		PageFactory.LoginPage(user_name,pwdwe);
		
  }
   
	
   @Test
	@Severity(SeverityLevel.MINOR)
	@Description("Test the assertion 2")
	@Story("Testcase2 ")
	
	public void Test3() {
		Assert.assertEquals(true, false);	
	}
   @AfterMethod
	public void tearDown(ITestResult result) throws IOException {
	    if (result.getStatus() == ITestResult.FAILURE) {
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(screenshot, new File("./allure-results/screenshots/" + result.getName() + ".png"));
          Allure.addAttachment("Screenshot on failure", FileUtils.openInputStream(screenshot));
	    }
	}

	
}



//Testprovider dataprovider;

	/*	@BeforeTest//@Beforesuite
	 public void beforetest() {// create utility folder
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		*/
 
