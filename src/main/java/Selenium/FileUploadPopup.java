package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();   // open the Firefox browser
		
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.name("uploadfile_0")).sendKeys("E:\\Testing\\JUNE2024\\Selenium\\Book1.xlsx");  // sendkeys method used to upload file 
		
        driver.findElement(By.id("terms")).click();
        
        driver.findElement(By.id("submitbutton")).click();
   
   
   
	}

}
