package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priorityfeature {
	
// Priority : if priority not provided then will execute test case in alphabetical ascending order .
// if duplicate priority then execute test case in alphabetical ascending order by method name 
	
//If we specify negative value of priority it will execute in ascending order  -1, 1,2

	
@BeforeClass

public void opernbrowser() 
{

 System.out.println("Open the Browser");

}
	
	
	@BeforeMethod 

	public void loginapplication() {
		System.out.println("@BeforeMethod---------login to facebook ");

	}
			
		@Test (priority=2)
		
		public void Test1() {
			System.out.println("@Test----Test1");
		
		}
		
		
		@Test (priority=-1)
		 public void Test2() { 	
			System.out.println("@Test ---Test2");
		}
		
		
		@Test (priority=1)
		 public void Test3() {
			
			System.out.println("@Test---Test3");
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