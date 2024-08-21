package TestNGConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class enabledFeature {
	
	//if you don’t want to execute test case in TestNG class the you can use enabled=false .
//	We can include or exclude methods from testing.xml file


	@BeforeMethod 
	
	public void openBrowser() {
		
		System.out.println("@BeforeMethod ===========================Open the browser");
		
	}
	
	
	@Test()
	
public void verifylaunchapplication() {
		
	
		System.out.println("@Test======================verifylaunchapplication");
		
		
	}
	
	@Test(dependsOnMethods="verifylaunchapplication")
	
public void verifyloginsuccess() {              
		System.out.println("@Test======================verifyloginsuccess");
		
		
	}
	
	@Test ()
	
	public void Verifylogodiaplayed() {                  
		System.out.println("@Test======================Verifylogodiaplayed");
		
		
	}
	
	@Test(priority=-1,groups="sanity")
	
	public void VerifypageTitle() {                             
		System.out.println("@Test======================VerifypageTitle");
		
	
	}
	
	@Test(enabled=false)
	
public void verifyforgotlink() {              
		System.out.println("@Test======================verifyforgotlink");
		
		
	}
	
	@Test(groups="sanity",dependsOnMethods="verifylaunchapplication")
	
	public void Verifycreateaccountbutton() {                  
		System.out.println("@Test======================Verifycreateaccountbutton");
		
		
	}
	
	@Test(dependsOnMethods="verifylaunchapplication")
	
	public void Verifynoteuderloginbox() {                             
		System.out.println("@Test======================Verifynoteuderloginbox");
		
	
	}
	
	
	
	@AfterMethod 
	
public void closebrowser() {
		
		System.out.println("@AfterMethod========================browser close");
		
	}
	
	

	
	
	

}
