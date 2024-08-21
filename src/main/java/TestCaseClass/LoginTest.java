package TestCaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMConcept.LoginPOMClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();    // Webdriver is interface 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		

		LoginPOMClass loginpag= new LoginPOMClass(driver);  // create object of pom class
		
		
		loginpag.enterusername("ravikant");   // enter username 
		
		loginpag.enterpassword("kadam");     // enter password
		
		loginpag.login();   // click on loginbutton 
		

		
	}

}
