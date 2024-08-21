//package StepDefinationJune;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class HooksConcept {
//	
//	WebDriver driver;
//	
//	
//	@Before("@First")
//	
//	public void browsersetup() {
//
//		WebDriverManager.chromedriver().setup();
//		
//		 driver =new ChromeDriver();    // Webdriver is interface 
//		 
//		 System.out.println("Before hook working as expected ");
//		
//		
//	}
//	
//	
//	@After("First")
//	
//	public void tear() {
//		
//		driver.quit();
//		
//		System.out.println("After hook wokring as expected ");
//	}
//	
//	
//
//@Given("^User is alrady on login page$")
//public void user_is_alrady_on_login_page() {
//	
//	
//	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//	
//	
//}
//
//@When("^Title of page is Amazon Sign In$")
//public void title_of_page_is_amazon_sign_in() {
//	
//	String actualpageTitle= driver.getTitle();
//	
//	Assert.assertEquals(actualpageTitle, "Amazon Sign In");
//	System.out.println("Tite of page is matched ");
//	
//   
//}
//
//@When("^Enter the email or mobile phone number \"(.*)\"$")
//public void enter_the_email_or_mobile_phone_number(String username) throws InterruptedException {
//	
//	Thread.sleep(10);
//   
//	driver.findElement(By.name("email")).sendKeys(username);
//	
//}
//
//@When("^click on continue button$")
//public void click_on_continue_button() {
//	
//	driver.findElement(By.xpath("//input[@id='continue']")).click();
//    
//}
//
//@When("^Enter the password \"(.*)\"$")
//public void enter_the_password(String pass) {
//	
//	driver.findElement(By.name("password")).sendKeys(pass);
//   
//}
//
//@When("^Click on signin button$")
//public void click_on_signin_button() {
//	
//	driver.findElement(By.id("signInSubmit")).click();
//   
//}
//
//@Then("^user able to login successful$")
//public void user_able_to_login_successful() {
//	
//	
//	WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
//	
//	      boolean b= logo.isDisplayed();
//	      
//	      Assert.assertTrue(b);
//    
//}
//
//@Then("^Close the browser$")
//public void close_the_browser() {
//	
//	driver.close();
//    
//}
//	
//
//}
