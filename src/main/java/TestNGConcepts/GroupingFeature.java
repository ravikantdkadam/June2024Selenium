package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingFeature {
	
	
@BeforeClass

public void opernbrowser() 
{

 System.out.println("Open the Browser");

}
	
	
	@BeforeMethod 

	public void loginapplication() {
		System.out.println("@BeforeMethod---------login to facebook ");

	}
			
		@Test (groups="SmokeTest")
		
		public void Test1() {
			System.out.println("@Test----Test1");
		
		}
		
		
		@Test (priority=-1,groups="SmokeTest")
		 public void Test2() { 	
			System.out.println("@Test ---Test2");
		}
		
		
		@Test (priority=1)
		 public void Test4() {
			
			System.out.println("@Test---Test4");
		}
		
		@Test (groups="SmokeTest")
		 public void Test5() {
			
			System.out.println("@Test---Test5");
		}
		
		@Test 
		 public void Test6() {
			
			System.out.println("@Test---Test6");
		}
		
		@Test(groups="SmokeTest")
		 public void Test7() {
			
			System.out.println("@Test---Test7");
		}
		
		
@AfterMethod
	
		public void logoutApplication() {
		System.out.println("@AfterMethod	-------Logout from facebook ");

	}
	

@AfterClass

public void closebrowser() {
	
	System.out.println("close the browser");
	
}


	
	

}
