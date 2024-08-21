package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Browsersetup {

	public static void main(String[] args) {
		
	   

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();    // Webdriver is interface 
	
		/*
		 * driver.get("https://www.facebook.com/"); // To open the URL
		 * 
		 * 
		 * driver.manage().window().maximize(); // Maximize the window
		 * 
		 * driver.manage().window().minimize(); // Minimize the window
		 * 
		 * 
		 * System.out.println("The title of page is :"+driver.getTitle()); // Title of
		 * page
		 * 
		 * System.out.println(driver.getCurrentUrl()); // Current URL
		 * https://www.facebook.com/
		 */
       

       
       
       
     //Navigate() Method :This method is used to open an application, move forward, move backward and refresh browser
       
       
       
       
       driver.navigate().to("https://www.google.com/");   // To Open URL 
       
       
       
       driver.navigate().forward();   // move forward 
       
       
       
       driver.navigate().to("https://www.facebook.com/");  
       
       
       driver.navigate().back();                   // backword from current application 
       
       
       driver.navigate().refresh();    // To refresh the page 
       
       
       
       
     //  driver.close();   //  TO close the current browser 
       
       
      // driver.quit();    // To close all automate browsers 
       
       
       
       

       
       // SetSize(): Browser size change and SetPosition() :position of browser change 
       
       
        Dimension d1 =new Dimension (100,200);
        
       driver.manage().window().setSize(d1);   // SetSize method for to change size of browser 
         
        
        
        Point p=new Point(200,300);
        
     driver.manage().window().setPosition(p);  // SetPostion method for to change position of browser 


	
	}

}
