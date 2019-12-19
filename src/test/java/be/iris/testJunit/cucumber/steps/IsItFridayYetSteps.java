package be.iris.testJunit.cucumber.steps;

import org.junit.Assert;

import be.iris.testJunit.services.IsItFridayService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IsItFridayYetSteps {
	
	private IsItFridayService service = new IsItFridayService();
	private String today;
	private String result;
	
	@Given("today is {string}")
	public void todayIs(String day) {
	    // Write code here that turns the phrase above into concrete actions
	    today = day;
	}
	

	@When("I ask if it is Friday")
	public void i_ask_if_it_is_Friday() {
	    // Write code here that turns the phrase above into concrete actions
	    result = service.isIt(today);
	}

	@Then("I get a {word}")
	public void i_get_a_YES(String response) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(response, result);
	}
}
