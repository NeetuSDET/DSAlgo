package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import April_DSAlgoPageFactory.PF_06_LinkedList;
import Utils.loggerLoad;

public class LinkedListSteps {
	
	PF_06_LinkedList LL=new PF_06_LinkedList();
	@Given("user is on home page")
	public void user_is_on_home_page() {
		loggerLoad.info("User is on Home page");    
	}

	@When("user clicks get started button of Linked List")
	public void user_clicks_get_started_button_of_linked_list() {
		 LL.getstartedLL();
	}

	@Then("user redirected to Linked List")
	public void user_redirected_to_linked_list() {
		loggerLoad.info("User is on Linked List page");
	}

	@Given("user is on the Linked List page")
	public void user_is_on_the_linked_list_page() {
		LL.introduction();  
	}

	@When("user clicks Introduction link")
	public void user_clicks_introduction_link() {
		loggerLoad.info("User is on Introduction Linked List Page");
	}

	@Then("user should be directed to Introduction of Linked List Page")
	public void user_should_be_directed_to_introduction_of_linked_list_page() {
		LL.tryhere();
	}

	@Then("user clicks Try Here button in the introduction page")
	public void user_clicks_try_here_button_in_the_introduction_page() {
		loggerLoad.info("User is on page having tryeditor with run button");
	}

	@Then("user redirected to the page having an tryEditor with a Run button to test")
	public void user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
		loggerLoad.info("User is sending code");
	}

	@Given("user is using tryEditor with a Run button to test")
	public void user_is_using_try_editor_with_a_run_button_to_test() {
		LL.printstatement();
	}

	@When("user Enter code")
	public void user_enter_code() {
		 LL.run();
	}

	@When("user click on Run button")
	public void user_click_on_run_button() {
		loggerLoad.info("User received output");
	}

	@Then("user should be presented with the Run output")
	public void user_should_be_presented_with_the_run_output() {
		LL.backLL();
	}

	@Then("user redirected to previous page")
	public void user_redirected_to_previous_page() {
		loggerLoad.info("User is on Linked List page");
	}

	@When("user clicks Creating Linked List link")
	public void user_clicks_creating_linked_list_link() {
		LL.createlinkedlist();

	}

	@Then("user should be directed to Creating Linked List Page")
	public void user_should_be_directed_to_creating_linked_list_page() {
		loggerLoad.info("User is on creating Linked List page");
		 LL.tryhereLL();
	}

	@Then("user clicks Try Here button in the Creating Linked List page")
	public void user_clicks_try_here_button_in_the_creating_linked_list_page() {
		loggerLoad.info("user navigate to tryeditor and run button");
	}

	@Then("user redirected to tryEditor with a Run button to test")
	public void user_redirected_to_try_editor_with_a_run_button_to_test() {
	    
	}

	@Given("user is using tryEditor and Run button to test")
	public void user_is_using_try_editor_and_run_button_to_test() {
		LL.printstatementLL();
	}

	@When("user Enter print code")
	public void user_enter_print_code() throws Exception {
		 LL.runLL();
	}

	@When("user to click on Run button")
	public void user_to_click_on_run_button() {
		System.out.println("user get output");
	}

	@Then("user should get Run output")
	public void user_should_get_run_output() {
		System.out.println("user get output");
	}

	@Then("user redirected to home page after Linked List")
	public void user_redirected_to_home_page_after_linked_list() {
		LL.homeurl();
	}

}






