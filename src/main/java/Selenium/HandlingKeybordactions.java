package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeybordactions {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();    // Webdriver is interface 
		
	       
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	 
	 WebElement email= driver.findElement(By.id("email"));
	 
	 
	 WebElement password = driver.findElement(By.id("pass"));
	  
	  
	  Actions action =new Actions(driver);
	  
	  
//	  
	  action.keyDown(Keys.SHIFT).perform();  // keyDown method used to press the key
	   email.sendKeys("ravikant");
	    action.keyUp(Keys.SHIFT).perform();   // keyup method used to release the pressed key 
//	    
//
//		action.keyDown(Keys.SHIFT).perform(); 
//	    password.sendKeys("kadam");
	   
	  
	  
	  
	  ////Write a program to copy UID text form UID field  and paste into pwd field using keybord actions
	    
	    
	    action.keyDown(Keys.SHIFT).perform();  // keyDown method used to press the key
		email.sendKeys("ravikant");
	     action.keyUp(Keys.SHIFT).perform();   // keyup method used to release the pressed key 
	  
	     
	     
	     action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // select the text in email 
		
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();   // copy the text in email field 
		
		action.keyDown(Keys.TAB).perform();   // cursor go to password field 
	
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();  // paste the text in password filed 
		
		

	}

}
