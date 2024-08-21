package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsoluteAndRelativeXpath {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();    // Webdriver is interface 
		
	       
	       driver.navigate().to("https://www.facebook.com/");
	       
	       // Absolute Xpath 
	       

/*	We navigate from root of Parent element to immediate child .
	To achieve absolute Xpath we need to use single fwd slash. 
	We never recommend to use this absolute Xpath 
	/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button
*/

	       
	       //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/form/div[2]/button")).click();
	       
	     
	       
	       
	       // Relative xpath: 
	     /*  
	       	We navigate from root of Parent element to any child .
	       	To achieve relative Xpath we need to use double fwd slash. 
        */
	       
	       
	       driver.findElement(By.xpath("//div[2]//button")).click();
	       
	       
	       
	}
	
	

}
