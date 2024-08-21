package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingConcept {

	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();    // Webdriver is interface 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/guru99home/");
	
		// By webelment 
		
//		WebElement rv=driver.findElement(By.id("a077aa5e"));
//		
//		
//		driver.switchTo().frame(rv);    // move selenium from main window to frame
//		
//		
//		driver.findElement(By.xpath("/html/body/a/img")).click();
//		
		
		
		// By Name or ID 
		
		
//		driver.switchTo().frame("a077aa5e");   // name or ID
//		
//		
//		driver.findElement(By.xpath("/html/body/a/img")).click();
//		
		
		
		// By index
		
	
		int framecount= driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("number of frames on webpage :"+framecount);
		
		
      driver.switchTo().frame(2);   // pass index in frame 
	
     driver.findElement(By.xpath("/html/body/a/img")).click();
	
		

	}

}
