package PageFactoryConcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SetupDriver;

public class Login extends SetupDriver{
  
public Login() {  
		PageFactory.initElements(driver,this);	
	}
/*
       @FindBy(linkText = "Sign in") 
       public WebElement signin;
       
       @FindBy(className = "a-input-text a-span12 auth-autofocus auth-required-field")
       public WebElement email;
       
       @FindBy(xpath="//*[@id=\"continue\"]")
       public WebElement sub;
       */
       
       
		@FindBy(xpath="//input[@name='username']")
		public WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		public WebElement pwd;
		
		@FindBy(xpath="//button[@type='submit']")
		public WebElement sub;
  /*     
public void Signin() {
	 signin.click();
}
*/		
public void LoginPage(String uname, String pwd1) {	
    
       
		username.sendKeys(uname);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		pwd.sendKeys(pwd1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    sub.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

		
}
