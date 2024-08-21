package TestNGConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertConcept {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void preconditions() {
   
	WebDriverManager.firefoxdriver().setup();
	
     driver = new FirefoxDriver();   // open the Firefox browser
	
	
	driver.get("https://www.Google.com/");
	
	
	}
	
	
	@Test
	public void pageTitleTest() {
		
	   String ActualPageTitle=driver.getTitle();
	   
	   System.out.println("Actual page title is "+ActualPageTitle);
	   
	 // assertEquals() : If both results are equal then Pass. 
	   
	   
	  Assert.assertEquals(ActualPageTitle, "Google");
	   
	//   Assert.assertEquals(ActualPageTitle, "Google", "Expected is not match with actual");
	   
	   
	  // Click on gmail link 
	  
	  driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	  
	  System.out.println("gmail button is working ");
	  
	  
	  
	  
	   //assertNotEquals():If both results are equal then Fail. 
	   
	   
	 // Assert.assertNotEquals(ActualPageTitle, "Google"); 
	}   
		
	
	
	
	
	
	@Test
	
	public void logodipalyed() {
		
	 WebElement logo=  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		
		  boolean b =logo.isDisplayed();
		  
		  
		  System.out.println(b);
	
		  // assertTrue() : TC Pass if result is true. 
	
		  Assert.assertTrue(b);
		
		  
		  
		 // assertFalse():TC Pass if result is false
		  
		 // Assert.assertFalse(b);
		  
	}
	  
	  
	  
	  @Test
	  
	  public void assernull() {
		  
		  String name = "Vishwatech" ;
		
		  
		//  AssertNull():TC Pass if result is null.
		  
		  
		 // Assert.assertNull(name, "String is not null");
		  
		  
		//  AssertNotNull():TC Pass if result is not null.  
		  
		  
		  Assert.assertNotNull(name, "String is not null");
	  }
	  
	  
	  
	
	
	@AfterClass
	
      public void postcondition() {
		
		driver.close();
		
	}
	
	
	
	
	
}
