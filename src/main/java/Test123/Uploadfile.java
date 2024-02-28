package Test123;

import java.awt.*;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Uploadfile{

WebDriver driver; 

@Test

public void uploadfile() throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/div/img")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Thread.sleep(500);
	
	Robot rb= new Robot();
	
	StringSelection str= new StringSelection("C:\\Users\\sivar\\Pictures\\Saved Pictures\\2.jpeg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	rb.delay(400);
  
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.delay(500);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    rb.delay(500);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.delay(500);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
	
}
}
