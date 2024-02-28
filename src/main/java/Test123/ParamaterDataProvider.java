package Test123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParamaterDataProvider {

	WebDriver driver;

		@BeforeTest
		 public void beforetest() {
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			}
		@Test(dataProvider ="dataprovider", dataProviderClass=Testprovider.class)
		public void testmethod(String username, String pwd) throws InterruptedException{
			try {
			WebElement user= driver.findElement(By.name("username"));
			String username1= user.getAttribute(username);
			user.sendKeys(username);
			WebElement pwd1= driver.findElement(By.name("password"));
			String password1= user.getAttribute(pwd);
			pwd1.sendKeys(pwd);
			Thread.sleep(50);
			user.clear();
			pwd1.clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			}
			catch(Exception e) {
			System.out.print("the err" +e.getMessage());
			}
			 
		}

}
