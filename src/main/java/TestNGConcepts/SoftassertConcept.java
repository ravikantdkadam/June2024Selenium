package TestNGConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;



//@Listeners(TestNGConcepts.CustomListener1.class)
public class SoftassertConcept {
	
	
WebDriver driver;
SoftAssert soft;
	
	@BeforeClass
	
	public void preconditions() {
   
	WebDriverManager.firefoxdriver().setup();
	
     driver = new FirefoxDriver();   // open the Firefox browser
	
	
	driver.get("https://www.Google.com/");
	
   soft= new SoftAssert();
	
	
	}
	
	
	@Test
	public void pageTitleTest() {
		
	   String ActualPageTitle=driver.getTitle();
	   
	   System.out.println("Actual page title is "+ActualPageTitle);
	   
	 // assertEquals() : If both results are equal then Pass. 
	   
	      soft.assertEquals(ActualPageTitle, "Google123", "Actual title is not match with expected title");
	
	   
	//   Assert.assertEquals(ActualPageTitle, "Google", "Expected is not match with actual");
	   
	   
	  // Click on gmail link 
	  
	  driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	  
	  System.out.println("gmail button is working ");
	  
	  

	   //assertNotEquals():If both results are equal then Fail.
	  
	  soft.assertNotEquals(ActualPageTitle, "google");
	   
	   
	 
	  
	  
	  soft.assertAll();
	}   
		
	
	
	
	
	
	@Test
	
	public void logodipalyed() {
		
	 WebElement logo=  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		
		  boolean b =logo.isDisplayed();
		  
		  
		  System.out.println(b);
	
		  // assertTrue() : TC Pass if result is true. 
	
		soft.assertTrue(b);
		
		  
		  
		 // assertFalse():TC Pass if result is false
		  
		soft.assertFalse(b);
		
		soft.assertAll();
		  
	}
	  
	  
	  
	  @Test
	  
	  public void assernull() {
		  
		  String name = "Vishwatech" ;
		
		  
		//  AssertNull():TC Pass if result is null.
		  
		  soft.assertNull(name);
		
		  
		//  AssertNotNull():TC Pass if result is not null.  
		  
		  
		soft.assertNotNull(name);
		
		
		soft.assertAll();
	  }
	  
	  
	  
	
	
	@AfterClass
	
      public void postcondition() {
		
		driver.close();
		
	}
	
	
	
	

}
