package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationMethods {

	public static void main(String[] args) {
	
		
		//###### isDisplayed(): To check or verify the element is present and displayed. 
		//If element is displayed return value True ,if not displayed return value is False .
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();    // Webdriver is interface 
//		
//		driver.get("https://www.facebook.com/");
//		
//	WebElement logo =driver.findElement(By.xpath("//img[@alt='Facebook']"));
//	
//	if (logo.isDisplayed()) {
//		
//		System.out.println("Logo is displayed");
//	}
//	else {
//		
//		System.out.println("logo is not displayed ");
//	}
		
	
	//###### isEnabled() : This method is used to verify element is enabled  and it return True value .
	//If element is not enable then return False value .
	
	
	
//      driver.get("https://demoqa.com/browser-windows");
//	
//	WebElement button =driver.findElement(By.id("windowButton"));
//	
//	if (button.isEnabled())
//	{
//		
//		System.out.println("button is enabled ");
//	}
//	
//	
//	else 
//	{
//		
//		System.out.println("button is disabled ");
//	}
	
	
//##### isSelected () : This method used on radio buttons ,checkbox or options in a menu . Used to determine element is selected or not. 
// If selected return value True if not selected return value is False.

	            driver.get("https://www.facebook.com/");
	            
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();   // create new account button 
			
			WebElement malebutton=driver.findElement(By.xpath("(//input[@name='sex'] )[2]"));  // male button click 
			
			malebutton.click();
			
			
			if (malebutton.isSelected()) {
		
			System.out.println("Button is selected ");
			}
			
			
			else {
				
				System.out.println("Button is not selected ");
			}
		 	
			
			}



	}


