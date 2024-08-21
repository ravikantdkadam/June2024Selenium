package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleListbox {

	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
			
			WebDriver driver =new ChromeDriver();    // Webdriver is interface 
			
		       
		  driver.get("file:///E:/Testing/JUNE2024/Selenium/Multiselectlistbox.html");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  
		  
		  WebElement cars=driver.findElement(By.id("cars"));
		  
		  
		  Select cartypes= new Select(cars);
		  
		 System.out.println(cartypes.isMultiple());  // isMultiple method used to check list is multiselected or not 
		 
		 List <WebElement> Allcartypes= cartypes.getOptions();  // getoptions method used to gett all options from list box 
		 
		 
		System.out.println(Allcartypes.size());   // count number of options in list 
		
	
		
		
		for (WebElement list: Allcartypes) {    // for each loop to print all options from list box 
			
			
			//System.out.println(list.getText());
			
			
			if(list.getText().equals("Saab")) {
				
				
				list.click();
				
			}
		}
		
		
		 // select 1st option from list box =   getFirstSelectedOption()
		
		
		WebElement firstselectedoption=cartypes.getFirstSelectedOption();
		
		firstselectedoption.click();
		
		System.out.println("The 1st options"+firstselectedoption.getText());
		
		  
		  

	}

}
