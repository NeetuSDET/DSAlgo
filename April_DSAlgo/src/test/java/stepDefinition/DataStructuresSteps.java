package stepDefinition;

import April_DSAlgoPageFactory.PF_04_DataStructures;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.loggerLoad;

public class DataStructuresSteps {
	
	PF_04_DataStructures ds=new PF_04_DataStructures();
	 
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
	loggerLoad.info("User is Home  Page");

	}

	@When("The user clicks  Get Started button below the Data structures-Introduction")
	public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
	ds.getstartedDS();
	}

	@Then("The user should land in Data Structures- Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page() {
	loggerLoad.info("User is on Data Structure Introduction Page");
	}

	@Given("The user is on the Data Structures Introduction after logged in")
	public void the_user_is_on_the_data_structures_introduction_after_logged_in() {
	loggerLoad.info("User is on Data Structure Introduction Page after login");
	}
	
	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
	ds.timec();
	}

	@Then("The user should be redirected to time complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {
	loggerLoad.info("User is on Data Structure Time Complexity");
	}

	@When("The user clicks Try Here button and redirects to try editor")
	public void the_user_clicks_try_here_button_and_redirects_to_try_editor() {
	ds.tryhere();	
	}

	@Then("user enters phython code")
	public void user_enters_phython_code() {
	ds.print();
	}

	@Then("user clicks run button and goes to home page")
	public void user_clicks_run_button_and_goes_to_home_page() throws Exception {
	ds.runbutton();
	loggerLoad.info("data structure phython code run success");
	ds.homepage();
	}
}





