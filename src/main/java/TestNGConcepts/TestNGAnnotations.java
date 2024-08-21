package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	/*
	 * 
	@BeforeSuite----Setup system properties
	@BeforeTest-----Open the chrome browser 
	@BeforeClass----------Open the Facebook application
	@BeforeMethod---------login to facebook 
	@Test----verify the Title of facebook page 
	@AfterMethod	-------Logout from facebook 
	@BeforeMethod---------login to facebook 
	@Test ---verifyforgotlinkTes
	@AfterMethod	-------Logout from facebook 
	@BeforeMethod---------login to facebook 
	@Test ---verifylogoTest
	@AfterMethod	-------Logout from facebook 
	@AfterClass----Close the browser  
	@AfterTest ----Delete all cookies 
	
	*/
	
	
	
	
	
	// Preconditons annotations
	
		@BeforeSuite   //1
		
		public void stup() {
			
			System.out.println("@BeforeSuite----Setup system properties");
		}
		
		
		@BeforeTest   //2
		
		public void OpenBrowser() {
			System.out.println("@BeforeTest-----Open the chrome browser ");

		}
		
		
		@BeforeClass   //3    // B should be in uppercase and C should be in upper case 
		
		public void OpenApplication() {
			System.out.println("@BeforeClass----------Open the Facebook application");

		}
		

		@BeforeMethod // 4

		public void loginapplication() {
			System.out.println("@BeforeMethod---------login to facebook ");

		}
				
			@Test  //5
			
			public void verifyTitleTest() {
				System.out.println("@Test----verify the Title of facebook page ");
			
			}
			
			
			@Test
			 public void verifylogoTest() { 	
				System.out.println("@Test ---verifylogoTest");
			}
			
			
			@Test
			 public void verifyforgotlinkTest() {
				
				System.out.println("@Test ---verifyforgotlinkTes");
			}
			
			
	// Post conditions 

			@AfterMethod	//6
		
			public void logoutApplication() {
			System.out.println("@AfterMethod	-------Logout from facebook ");

		}

			@AfterClass  //7

			public void closeallbrowsers() {
		
				System.out.println("@AfterClass----Close the browser  ");
	  }
		
			@AfterTest   //8 
		
			public void Deletecookies() {
			System.out.println("@AfterTest ----Delete all cookies ");

		}

	}

	
	
