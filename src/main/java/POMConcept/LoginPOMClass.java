package POMConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	

		// @FindBy annotation used from pagefatcory class ----------------1st section (object repository )
		
		
		@FindBy(id="email") WebElement userID;
		
		@FindBy(id="pass") WebElement password;
		
		@FindBy(xpath="//button[text()='Log in']") WebElement loginbutton;
		
		@FindBy (xpath="//a[text()='Forgotten password?']") WebElement forgotpasswordlink;
		
		@FindBy(xpath="//a[text()='Create new account']") WebElement createnewaccbutton; 
	
	
		
		
		// To initialize the element we use initElements() method of PageFactory class. It takes two arguments---2nd section 
		

		public LoginPOMClass(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}

		
		// Create methods to perform operation on elements 
		
	
		public void enterusername(String un) {
			
			
			userID.sendKeys(un);
			
		}
			
		public void enterpassword(String pass) {
			
			
			password.sendKeys(pass);
			
			
		}
		
		public void login() {
			
			loginbutton.click();
		}
		
		
		public void forgotpass() {
			
			forgotpasswordlink.click();
		}

	    public void createaccount() {
		
		createnewaccbutton.click();
	}
}
