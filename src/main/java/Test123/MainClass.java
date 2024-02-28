package Test123;
import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;

public class MainClass {

	WebDriver driver;
	@Test
	
	public void superclass() {
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
        driver.findElement(By.xpath("//div[text()='-- Select --']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//span[text()='ESS']")).click();
        driver.findElement(By.xpath("//button[text()=' Search ']")).click();
      
     
        driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent'][1]")).click();
        driver.findElement(By.xpath("//li/a[contains(text(),'Pay Grades')]")).click();
        driver.findElement(By.xpath("//div[@class='oxd-table-card'][3]//div[@class='oxd-table-card-cell-checkbox']")).click();
        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        List<WebElement> selecttest=driver.findElements(By.xpath("//div[@class='oxd-table-card-cell-checkbox']"));
       
        for(int i=0; i<selecttest.size();i=i+2) {
        
        	selecttest.get(i).click();
        	
        }*/
        
        }

      

}
