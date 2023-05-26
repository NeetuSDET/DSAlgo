package stepDefinition;

import April_DSAlgoPageFactory.*;
import Utils.loggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	PF_02_RegisterPage regpage = new PF_02_RegisterPage();
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		regpage.url();
	//R regpage = new R();
		regpage.register();
		loggerLoad.info("User opened DS Algo URL and is trying to Registrer");
		}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() throws Exception {
		regpage.emptyfeilds();
		regpage.takescreenshot("Emptyfields.png");
	}

	@Then("It should display an error")
	public void it_should_display_an_error() throws InterruptedException {
	loggerLoad.info("Please fill out this field");
	regpage.register();
	}

	@Given("The user opens Register Page for Invalid username")
	public void the_user_opens_register_page_for_invalid_username() throws Exception {

		regpage.invalidusernameonly();
		regpage.registerclick();
		
	regpage.takescreenshot("InvalidUsername.png");
	     
	}

	@When("The user enters invalid username")
	public void the_user_enters_invalid_username() throws InterruptedException {
		loggerLoad.info("User is trying with Invalid username");
		regpage.register(); 
	}

	@Then("It should display an error message Invalid username")
	public void it_should_display_an_error_message_invalid_username() throws Exception {

		regpage.invalidpassword();

		regpage.registerclick();
		
		regpage.takescreenshot("Invalidpassword.png");   
	}

	@Given("The user opens Register Page for Invalid password")
	public void the_user_opens_register_page_for_invalid_password() throws InterruptedException {
		loggerLoad.info("User is trying with Invalid password");
		regpage.register(); 
	}

	@When("The user enters valid username and invalid password")
	public void the_user_enters_valid_username_and_invalid_password() throws Exception {

		regpage.mismatchdata();
		
		regpage.registerclick();
	
	
		//regpage.takescreenshot("Invalidconfirmation.png");  
	}

	@Then("It should display an error message Invalid password")
	public void it_should_display_an_error_message_invalid_password() throws InterruptedException {
		loggerLoad.info("User is trying with Invalid confirm pwd");
		regpage.register();
	}
	   
	@Given("The user opens Register Page for mismatch data")
	public void the_user_opens_register_page_for_mismatch_data() throws Exception {
		regpage.validdata();
		regpage.registerclick();
		regpage.takescreenshot("reg_success.png"); 
	}

	@When("The user enters a valid username and password but different password_confirmation and the user clicks Register button")
	public void the_user_enters_a_valid_username_and_password_but_different_password_confirmation_and_the_user_clicks_register_button() {
		loggerLoad.info("User successfully created New Account");
	}

	@Then("It should display an error mismatch password")
	public void it_should_display_an_error_mismatch_password() {
		regpage.signout();
		  //  DriverFactory.closedriver();  
	}

	@Given("The user opens Register Page for valid username and password")
	public void the_user_opens_register_page_for_valid_username_and_password() {
		 loggerLoad.info("User opens with Invalid username");
	}

	@When("The user enters a valid username and password and password confirmation and the user clicks Register button")
	public void the_user_enters_a_valid_username_and_password_and_password_confirmation_and_the_user_clicks_register_button() {
		 loggerLoad.info("User opens with Invalid password");
			}  
	
	@Then("The user should be redirected to Homepage with New Account Created")
	public void the_user_should_be_redirected_to_homepage_with_new_account_created() {
	  
		 loggerLoad.info("User opens with Invalid confirm pwd");
	}

	@Then("User signs out from the account")
	public void user_signs_out_from_the_account() {
		loggerLoad.info("User opens valid credentials");
	}


}
