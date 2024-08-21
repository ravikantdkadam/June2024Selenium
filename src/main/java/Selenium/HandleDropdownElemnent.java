package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownElemnent {

	public static void main(String[] args) {

		  WebDriverManager.chromedriver().setup();
			
			WebDriver driver =new ChromeDriver();    // Webdriver is interface 
			
		       
		    driver.navigate().to("https://www.facebook.com/");
		    
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    
		    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		    
		    
		    
		    
		    
		   /* To handle the dropdown in selenium we are using select class . And in select class there are some methods to insepct the dropdwon elments 
		    1.	SelectByVisibleText(Str)- Takes string argument
		    2.	SelectByIndex(int) - Takes int argument
		    3.	SelectByValue(Str)- Takes string argument

		    
		*/
		    
		    
		    // Select birthdate from dropdown by index method 
		    
		 WebElement day= driver.findElement(By.name("birthday_day")) ; 
		      
		    Select Birthdate=new Select(day);      
		    
		    
		    Birthdate.selectByIndex(30);
		    
		    
		    
		 // Select Birthmonth from dropdown by "selectbyvisibletext"  method 
		    
		    
		    
		  WebElement month=  driver.findElement(By.name("birthday_month"));
		  
		    Select Birthmonth=new Select(month); 
		    
		    Birthmonth.selectByVisibleText("Dec");
		    
		    
		  
		    // Select Birthyear from dropdown by "selectbyValue"  method 
		  
		    
		   WebElement year= driver.findElement(By.name("birthday_year"));
		    
		   Select Birthyear=new Select(year); 
		   
		   Birthyear.selectByValue("2023");
		    

	}

}
