package Test123;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;



public class Testprovider {
 @DataProvider(name ="dataprovider")

 public static Object[][] testmethod() {
	 return new Object[][] {
		 {"admin", "133"},
		 {"123456","pi"},
		 {"Admin", "admin123"}
	 };
 }
}