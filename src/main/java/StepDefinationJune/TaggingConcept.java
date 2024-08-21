package StepDefinationJune;

import io.cucumber.java.en.Given;

public class TaggingConcept {
	
	
	
	@Given("user login Test with valid credentials")
	public void user_login_test_with_valid_credentials() {
		System.out.println("valid credentials ");
	    
	}

	@Given("user login Test with invalid credentials")
	public void user_login_test_with_invalid_credentials() {
		System.out.println("Invalid credentials ");
	   
	}

	@Given("user create contact")
	public void user_create_contact() {
		System.out.println("Create Contact Test ");
	   
	}

	@Given("user create Deals")
	public void user_create_deals() {
		System.out.println("Create Deals Test ");
	   
	}

	@Given("user create Task")
	public void user_create_task() {
		System.out.println("Create Task Test ");
	    
	}

	@Given("user create Case")
	public void user_create_case() {
		System.out.println("Create Case Test ");
	}

	@Given("user create Document")
	public void user_create_document() {
		System.out.println("Create Document Test ");
	    
	}

	@Given("user create Companies")
	public void user_create_companies() {
		System.out.println("Create Comapnies Test ");
	    
	}




}
