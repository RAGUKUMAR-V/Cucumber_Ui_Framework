package com.ragu.step_definitions;

import com.ragu.constants.constants;
import com.ragu.pageObjects.LoginPageObjects;
import com.ragu.webdrivermanager.drivermanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_step_def {


@Given("When user is on login page")
public void when_user_is_on_login_page() {
	drivermanager.getDriver().get(constants.url);
	
	drivermanager.getDriver().manage().window().maximize();
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	

}
@When("Enter {string} and {string}")
public void enter_and(String username, String password) {
	

	LoginPageObjects.getLoginPageinstance().enterUsername(username);
	LoginPageObjects.getLoginPageinstance().enterPassword(password);
	LoginPageObjects.getLoginPageinstance().clickSubmitButton();
	
	
}
@Then("Verify user is logged in Successfully")
public void verify_user_is_logged_in_successfully() {
   
	String homeurl=drivermanager.getDriver().getCurrentUrl();
	
}

	
	
}
