package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotMethod {

	public static void main(String[] args) throws IOException {
		
		

		  WebDriverManager.chromedriver().setup();
			
			WebDriver driver =new ChromeDriver();    // Webdriver is interface 
			
		       
		  driver.get("https://www.facebook.com/");
		    
		
		    
		  TakesScreenshot ts = (TakesScreenshot) driver ;   // TakesScreenshot interface-----upcasting
		    
//            File Src    = ts.getScreenshotAs(OutputType.FILE);  // getScreenshotAs  method used to take screenshot 
//                
//            File dest = new File ("D:\\New Workspace\\JuneSelenium2024\\target\\screenshot2.png");
//                       
//            FileUtils.copyFile(Src, dest);    // copied file from src to dest
//                
             
                
		// Screenshot of webelement 
            
            
            
            WebElement loginbutton= driver.findElement(By.xpath("//button[text()='Log in']"));
            
              
//            File src= loginbutton.getScreenshotAs(OutputType.FILE);
//            
//            File dest= new File ("D:\\New Workspace\\JuneSelenium2024\\target\\WebElementScreen.png");
//            
//            FileUtils.copyFile(src, dest);
//            
            
            
            // Screenshot of logo (image)
            
            
            
           WebElement logo= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
            
           File src= logo.getScreenshotAs(OutputType.FILE);
           
           File dest= new File ("D:\\New Workspace\\JuneSelenium2024\\target\\Facebookimage.png");
           
           FileUtils.copyFile(src, dest);

	}

}
