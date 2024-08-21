package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor1 {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		
	 driver = new FirefoxDriver();   // open the Firefox browser 
		
		driver.get("https://www.facebook.com/");
      
		
		
		
		//WebElement link= driver.findElement(By.linkText("Forgotten password?"));
		
		
		javascript();
		
		
		
	}
		
		public static void javascript() {
			
			WebElement loginbutton= driver.findElement(By.xpath("//button[text()='Log in']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  // upcast the webdriver 
		
		js.executeScript("arguments[0].click()", loginbutton);
		
		}
		
		
		
		
	


	
	
	
		

}
