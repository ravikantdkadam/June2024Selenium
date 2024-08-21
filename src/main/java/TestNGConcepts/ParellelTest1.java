package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelTest1 {
	
	@Test
	
	   public void preconditionsfacebook() {
		   
		   WebDriverManager.firefoxdriver().setup();
		   
		   WebDriver driver = new FirefoxDriver();
		   
		   
		   driver.get("https://www.facebook.com");
		   
		 
		   
		   
	   }


}
