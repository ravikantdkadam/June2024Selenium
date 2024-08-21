//package StepDefinationJune;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateContactStepDefination {
//	
//WebDriver driver;
//
//@Given("user is on login page")
//public void user_is_on_login_page() {
//	
//	
//
//	WebDriverManager.chromedriver().setup();
//	
//	 driver =new ChromeDriver();    // Webdriver is interface 
//	 
//	 driver.get("https://ui.cogmento.com/");
//	 
//   
//}
//
//@When("user enter the username and password")
//public void user_enter_the_username_and_password(DataTable logindata) {
//	
//	
//	List<List<String>> crmlogin =logindata.cells();
//	
//	
//	driver.findElement(By.name("email")).sendKeys(crmlogin.get(0).get(0));
//	driver.findElement(By.name("password")).sendKeys(crmlogin.get(0).get(1));
//	
//  
//}
//
//@When("Click on login button")
//public void click_on_login_button() {
//	
//	
//	driver.findElement(By.xpath("//div[text()='Login']")).click();
//    
//}
//
//@Then("user should on the homepage")
//public void user_should_on_the_homepage() {
//	
//	
//	String PageTitle= driver.getTitle();
//	
//	Assert.assertEquals("Cogmento CRM", PageTitle);	
//	
//	System.out.println("user is on homepage ");
//  
//}
//
//@When("user move and click on the contact tab")
//public void user_move_and_click_on_the_contact_tab() throws InterruptedException {
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/a/span")).click();
//
//
//	System.out.println("user clicked on contact tab");
//	
//	
//   
//}
//
//@Then("user is on contact page")
//public void user_is_on_contact_page() throws InterruptedException {
//	
//	
//	Thread.sleep(2000);
//	
//	WebElement text= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/span"));
//	
//	Assert.assertTrue(text.isDisplayed());
//	
//	System.out.println("user is on contact page");
// 
//}
//
//@Then("Click on Create button")
//public void click_on_create_button() throws InterruptedException {
//	
//	Thread.sleep(3000);
//	
//   driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
//  
//}
//
//@Then("Enter the following details and click on save Butto")
//public void enter_the_following_details_and_click_on_save_button(DataTable Contactdetails) {
//	
//	
//	List<List<String>> contactdetails=Contactdetails.cells();
//	
//	
//	driver.findElement(By.name("first_name")).sendKeys(contactdetails.get(0).get(0));  //first-name= Rivansh
//	driver.findElement(By.name("middle_name")).sendKeys(contactdetails.get(0).get(1));   // middle-name= Ravikant
//	driver.findElement(By.name("last_name")).sendKeys(contactdetails.get(0).get(2));     // Last-name= Kadam
//	driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(contactdetails.get(0).get(3));   //email=riva235@gmail.com
//	
//	
//	driver.findElement(By.xpath("//button[text()='Save']")).click();
//
//}
//
//
//
//
//}
