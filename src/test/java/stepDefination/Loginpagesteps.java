package stepDefination;

import static org.junit.Assert.assertTrue;

import helper.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.loginpage;

 public class Loginpagesteps extends Baseclass {
	
	loginpage login = new loginpage();
	
	

	@When("Enter the valid credentials")
	public void enter_the_valid_credentials() {
		//login.enter_the_valid_credentials();
	    
	}

	@And("Click the login button")
	public void click_the_login_button() {
		login.click_the_login_button();
	}

	@Then("validate successfull login")
	public void validate_the_successfull_login() {
	  assertTrue(login.validate_successfull_login());
	}
	
	@When("Enter the valid {string} and {string} credentials")
	public void enter_the_valid_and_credentials(String uname, String pass) {
	    login.enter_the_valid_credentials(uname, pass);
	}
	
}
