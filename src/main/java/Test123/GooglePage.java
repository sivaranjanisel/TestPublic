package Test123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePage {
  WebDriver driver;
  @Test
  
  
  public void Google() {
	  
	  driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	//  driver.findElement(By.linkText("Gmail")).click();
	 
	  driver.findElement(By.id("APjFqb")).sendKeys("java");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys(Keys.ENTER);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
      driver.close();
	  
  }
  

}
