package Test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DragDrop {
	WebDriver driver;
	
@BeforeSuite
	 public void DragDroppable() {
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
	
		/*
		driver.manage().window().maximize();
	
		Actions a= new Actions(driver);
		
		WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(w);

		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(draggable, droppable).build().perform();
*/
		
	}
@Test	
@AfterSuite
public void close() throws InterruptedException{
	driver.manage().window().maximize();
	Actions a= new Actions(driver);
	
	WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(w);

	WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
	//a.dragAndDrop(draggable, droppable).build().perform();
	a.clickAndHold(draggable);
	Thread.sleep(200);
	a.moveByOffset(100,60).build().perform();
	
}


	
}
