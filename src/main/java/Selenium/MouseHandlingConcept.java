package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandlingConcept {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//			
//			WebDriver driver =new ChromeDriver();    // Webdriver is interface 
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver= new FirefoxDriver();
			
			//driver.get("https://www.facebook.com/");
		
	//	driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  
		  // MouseActions 
//		  
	  Actions action =new Actions(driver);
//		  
//		WebElement loginbutton=  driver.findElement(By.xpath("//button[text()='Log in']"));
//		  
//		  action.moveToElement(loginbutton).click().build().perform();
		  
		  
		  
		  // DragAnd Drop Method
		  
	//WebElement src=  driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
//	
//		  
	//WebElement dest = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
//		
//		action.dragAndDrop(src, dest).build().perform();
		
		
	
	
		  // ClickandHold  or release methods------>Drag and drop other option 
		
		
		//action.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		  
//ContextClick Method (Right click action)  https://demo.guru99.com/test/simple_context_menu.html
		
		
		//action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		
		
	
	//DoubleClick Method 
		
		action.moveToElement(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).doubleClick().build().perform();
		
		
		  
	}

}
