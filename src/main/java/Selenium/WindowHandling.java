package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
      
		//WebDriverManager.chromedriver().setup();
		
		//WebDriver driver =new ChromeDriver();    // Webdriver is interface 
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		
		//driver.manage().deleteAllCookies();
	
		driver.get("https://demoqa.com/browser-windows");
		
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	     Thread.sleep(2000);
		
		
		driver.findElement(By.id("windowButton")).click();      // click on new window button 
		
		
		//getWindowHandle():  to get address of parent window
		// use to get address of current window ------Return type is string
		
		
		String parentwindow =driver.getWindowHandle();
		
		System.out.println("Address of parent window is : "+parentwindow);
		 
		

// getWindowHandles(): To get address of parent window + all child window	
		 // Return type is Set <String>
		
		
		
           Set<String> childbrowser	= driver.getWindowHandles();
           
           
		System.out.println("Address of all child browser is : "+childbrowser);
		
		
		
		for(String childwindow:childbrowser ) {
			
			
		           if (!parentwindow.equalsIgnoreCase(childwindow)) {
		        	   
		        	   driver.switchTo().window(childwindow);  // switch to child window
		        	   
		        	   
		        	   String Childwindowtext=  driver.findElement(By.id("sampleHeading")).getText();
		       		
		        		
		      		 System.out.println("This is text on child browser or window :"+Childwindowtext);
		           
		           }
			
			
		}
		
		

	}

}
