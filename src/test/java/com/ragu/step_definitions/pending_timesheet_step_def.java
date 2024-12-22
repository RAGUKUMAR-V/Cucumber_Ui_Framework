package com.ragu.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pending_timesheet_step_def {

	
	@Given("The user is logged in successfully and on home screen")
	public void user_is_logged_in_successfully_and_on_home_screen() {
		 System.out.println("hi");
	}

	@When("user clicks the time option from menu bar")
	public void user_clicks_the_time_option_from_menu_bar() {
		 System.out.println("hi");
	}

	@And("user enter the name as {string} and select from auto suggestive dropdown")
	public void user_enter_the_name_as_and_select_from_auto_suggestive_dropdown(String string) {
		 System.out.println("hi");
	}

	@And("click on view button")
	public void click_then_view_button() {
		 System.out.println("hi");
	}

	@Then("user should see the message as {string}")
	public void user_should_see_message_as(String string) {
		 System.out.println("hi");
	}

	
	
}
