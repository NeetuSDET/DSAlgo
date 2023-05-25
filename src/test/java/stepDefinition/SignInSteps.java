package stepDefinition;

//import April_DSAlgoPageFactory.PF_02_RegisterPage;
import April_DSAlgoPageFactory.PF_03_SignInPage;
import April_DriverFactory.driverFactory;
import Utils.loggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps {
	//PF_02_RegisterPage regpage = new PF_02_RegisterPage();
	PF_03_SignInPage S = new PF_03_SignInPage(driverFactory.getdriver()); 
	@Given("User is in homepage")
	public void user_is_in_homepage() {
		S.url();
		loggerLoad.info("User is in home page");
	}

	@Then("user clicks signin and redirects to signin page")
	public void user_clicks_signin_and_redirects_to_signin_page() {
		S.signin_link();
	}

	@When("The user enters a valid username and password")
	public void the_user_enters_a_valid_username_and_password() throws Exception {
	    S.enter_username();
	    S.enter_pwd();
	}

	@When("user clicks login button and redirects to home page")
	public void user_clicks_login_button_and_redirects_to_home_page() throws InterruptedException {
		S.login_click();
		Thread.sleep(1000);
		//S.signout(); 
	}


}


	
//	private PF_03_SignInPage sp = new PF_03_SignInPage(driverFactory.getdriver());
//	String homeurl=configReader.getHomePage();
//	
//	@Given("User is in homepage")
//	public void user_is_in_homepage() {
//		//driverFactory.getdriver().get(home_url);
//		loggerLoad.info("User is on home page");
//	    
//	}
//
//	@Then("user clicks signin and redirects to signin page")
//	public void user_clicks_signin_and_redirects_to_signin_page() {
//		sp.signin_link();
//		  
//	}
//
//	@When("user enters username as {string} password as {string}")
//	public void user_enters_username_as_password_as(String string, String string2) {
//		sp.enter_username(string);
//	    sp.enter_pwd(string2);
//	}
//
//	@And("user clicks login button and redirects to home page")
//	public void user_clicks_login_button_and_redirects_to_home_page() throws InterruptedException {
//		sp.login_click();
//		Thread.sleep(1000);
//		// sp.signout(); 
//	}
//
//}
//
