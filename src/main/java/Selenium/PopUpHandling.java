package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();    // Webdriver is interface 
		
	     // Alert popup 
		
		
	//  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");   alert popup
		  
	 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	 // driver.findElement(By.name("proceed")).click();
	  
	  // switchTo() method used to to swith from main webpage to popup
	  
	 // Alert alert = driver.switchTo().alert();     
	  
//      String alerttext= alert.getText();
//	  
//	  System.out.println("alert text is :"+alerttext);   // to retrive the text from popup 
//	  
//	  
//	  Thread.sleep(2000);
//	  
//	  alert.accept();  // accept method used to click on okay button
//	  
	
	  // Prompt alert popup
	  
	  driver.get("file:///E:/Testing/March%202024/Automation%20Testing/Selenium/promtalert.html");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  
	  Alert alert = driver.switchTo().alert();
	    
      System.out.println(alert.getText());
      
   
	  alert.sendKeys("Vishwatech solutions");
	  	  
	  //alert.accept();
	  
	  alert.dismiss();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}

}
