package stepDefinition;

import April_DriverFactory.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import April_DSAlgoPageFactory.PF_01_GetStarted;

public class GetStartedSteps {
	
	private PF_01_GetStarted gp = new PF_01_GetStarted(driverFactory.getdriver());
	
	@Given("user enters into dsalgo page")
	public void user_enters_into_dsalgo_page() {
	 driverFactory.getdriver().get("https://dsportalapp.herokuapp.com/");
	}

	@Then("user clicks Get started")
	public void user_clicks_get_started() {
		gp.getstartclick();
	}
}