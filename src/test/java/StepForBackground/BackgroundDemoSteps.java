package StepForBackground;

import io.cucumber.java.en.*;

public class BackgroundDemoSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	}
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	}
	
	@Given("user is logged in")
	public void user_is_logged_in() {
		// code to log in the user
	}

	@When("user click on sidebar")
	public void user_click_on_sidebar() {
		// code to simulate a user clicking on the sidebar
	}

	@Then("log out feature is displayed")
	public void log_out_feature_is_displayed() {
		// code to verify that the log out feature is displayed
	}

	@When("when user click on one product")
	public void when_user_click_on_one_product() {
		// code to simulate a user clicking on a product
	}

	@Then("product detail is displayed")
	public void product_detail_is_displayed() {
		// code to verify that the product detail is displayed
	}

}
