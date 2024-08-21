package TestNGConcepts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGConcepts.CustomListener1.class)
//	if you want to run same test case multiple time then we can use invactionCount keyword in TestNG

public class invocationCount {
	

	 @Test 

	 public void loginapplication() {
		 
		// int a=10/0;
		
		System.out.println("login to facebook ");

     	}
			
		@Test  
		
		public void verifyTitleTest() {
			System.out.println("@Test----verify the Title of facebook page ");
		
		}
		
		
		@Test(invocationCount=5)
		 public void verifylogoTest() { 	
			System.out.println("@Test ---verifylogoTest");
		}
		
		
		@Test(invocationCount=2)
		 public void verifyforgotlinkTest() {
			
			System.out.println("@Test ---verifyforgotlinkTes");
		}
	
		
		@Test (dependsOnMethods="loginapplication")
		public void imageupload() {
			
			System.out.println("upload the image ");
		}
	
		@Test (dependsOnMethods="loginapplication")
		public void createstory() {
			
			System.out.println("createstory ");
		}
	
		


}
