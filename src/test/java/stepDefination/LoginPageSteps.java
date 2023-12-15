package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.sauce_signin;

public class LoginPageSteps {
	sauce_signin login = new sauce_signin ();
	
	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String u, String p) {
	    login.user_enter_username_and_password(u, p);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    login.user_click_on_login_button();
	}

	@Then("validate successfull login")
	public void validate_successfull_login() {
	 login.validate_successfull_login();  
	}


	
	
	
	
	
	
	
	
	
}


