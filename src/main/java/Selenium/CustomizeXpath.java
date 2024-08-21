package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomizeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		//	######  Xpath by attribute :######
	
		
		
		//tagname [@attribute=’value’]
		//button[@name=’login’]

		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();    // Webdriver is interface 
		
	       
	    driver.navigate().to("https://www.facebook.com/");
	    
	    
	   // driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    //driver.findElement(By.xpath("//button[@name='login']")).click();
	    
 
	    
	   //	#######Xpath by Contains():To handle dynamic element #####
	    
	    
	    /*		Any element html code contains text .
	    		If we use Xpath by text then entire text need to be mention.
	    		If we use Xpath by contains then few character of text in sequence need to be used  

	
	/
	    
	  //tagname [contains(@attribute, ’attributevalue’]
	  //button[contains(@id,’ u_0_5_’)]

		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		
	    

//start-with function 
	     
		//tagname[starts-with(@attribute, ’attributevalue’)
	      
	      driver.findElement(By.xpath("// button[starts-with(@id,'u_0_5_']")).click();
	      
	      
//ends-with function 
	    /*   tagname[ends-with(@attribute, ’attributevalue’)

	      t_0_5_bb
	      a_0_5_bb
	      f_0_5_bb  */

	      
	      //driver.findElement(By.xpath("// button[ends-with(@id,'0_5_bb']")).click();
	      

	    
//xpath by text
	 //   	Sometimes developer may create an element using tagname and text.
	  //  	To identify the text we cant use locator type css selector and Xpath by attribute
	    
	    //tagname[text()='text value']
	    
	    
	   // driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    
	    
	    
	//xpath by index 
	    
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
	    
	    
	
	    
	    
	    
	    

	}

}
