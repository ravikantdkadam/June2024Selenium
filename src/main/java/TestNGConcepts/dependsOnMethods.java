package TestNGConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsOnMethods {
	
	
	 @Test 

	 public void loginapplication() {
		 
		 int a=10/0;
		
		System.out.println("login to facebook ");

      	}
			
		@Test  
		
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
	
		
		@Test (dependsOnMethods="loginapplication")
		public void imageupload() {
			
			System.out.println("upload the image ");
		}
	
		@Test (dependsOnMethods="loginapplication")
		public void createstory() {
			
			System.out.println("createstory ");
		}
	
		

}
