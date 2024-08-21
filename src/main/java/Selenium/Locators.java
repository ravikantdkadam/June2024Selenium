package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
	      // findElement(): method used to find the element on webpage 
	      // sendKeys(): method used to enter the text in field 
	      //clear(); method used to delete the text 

		
	// ## id locators:
		
		
		driver.get("https://www.facebook.com/");   // To open the facebook application 
		
		
	// Email : 
		
//		WebElement email= driver.findElement(By.id("email"));
//		
//		email.sendKeys("Ravikant");	  // enter text
//		
//		Thread.sleep(2000);
//		
//		email.clear();
		
		
		
		// Optimization code : This optimization we can use when single action need to per form on element 
		
		
//		driver.findElement(By.id("email")).sendKeys("rvkadam25@gmail.com");  // Email
//		
//		
//		driver.findElement(By.id("pass")).sendKeys("vishwatech@25");  // Password
		
	    
	
		
		
 // ## name locators:
		
	
		//driver.findElement(By.name("email")).sendKeys("Divya");
		
		//driver.findElement(By.name("pass")).sendKeys("Divaya@123");
		
		
	    
 // ##LinkText ()  Locators--------Use this one on priority 
		   		// Copy total link text
			    
			    
			   // driver.findElement(By.linkText("Forgotten password?")).click();


 // ## PartialLinkText()  locators 
			    
			  //  Copy the partial text of link 


			  	 //   driver.findElement(By.partialLinkText("Forgotten")).click();

		
// ## CSS Selector locators: 
			  	    
	//If tagname is duplicate then also we use CSS selector 

//id , Name , class name attributes are not present or duplicates then we can use CSS selector 
	    
			  	    
			  	      
			  	   // driver.findElement(By.cssSelector("#email")).sendKeys("Akshay");
			  	   // driver.findElement(By.cssSelector("#pass")).sendKeys("Akshay@123");
			  	    
			  	    
			  	  
			  	 // Id:     #Id 
			  	 // Classname= .classname 

		  	    
// ##Tagname() locators :
			  	    
			  	    
		 // driver.findElement(By.tagName("input")).sendKeys("Tagname");

		//  In a webpage multiple elements are present with same tag name .So selenium will perform action on 1st element present in webpage. 

		
		  
		 List <WebElement> links= driver.findElements(By.tagName("a"));
		 
		
		System.out.println(links.size());                  // size of all links on webpage 
		 
		  for (int i=0; i<links.size();i++) {
			  
			  System.out.println(links.get(i).getText());     // all links on webpage 
		  }
		  
		  
		links.get(0).click();                                  // click 3rd link on webpage 
		 
		
	}

}
