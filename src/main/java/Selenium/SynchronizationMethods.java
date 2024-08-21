package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
     1. Thread.sleep();
     2. Implicit wait ();
     3. Explicit wait ();
     4. Fluent wait ();

		 */

		// Thread. sleep();
		
		
		  WebDriverManager.chromedriver().setup();
			
			WebDriver driver =new ChromeDriver();    // Webdriver is interface 
			
		       
		    driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
			

		    
			// Implicit wait ();
		    
		    
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // Best example of Method Overloading 
			   
			   
			   
		    
		    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		   
		    
		  // Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
		    
		       
		 
		    // Explicitly wait   : Expected conditions- seconds -TimeoutException 
		 
		   try { 
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		    
		    wait.until(ExpectedConditions.titleContains("amazon"));
		   } 
		   
		   catch(TimeoutException e) {
			   
			   System.out.println("Explicit condition is getting failed"+e);
		   }
		    
   
		   
		   System.out.println("condition satisfied");
		    
		    driver.quit();
		    
		
		
	}

}
