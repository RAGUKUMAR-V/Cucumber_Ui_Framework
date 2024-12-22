package com.ragu.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ragu.constants.constants;
import com.ragu.pageObjects.DirectoryPageObjects;
import com.ragu.pageObjects.HomePageObjects;
import com.ragu.pageObjects.LoginPageObjects;
import com.ragu.utilities.common_utilities;
import com.ragu.webdrivermanager.drivermanager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CEO_name_step_def {

	@Given("user is logged in successfully and on home screen")
	public void user_is_logged_in_successfully_and_on_home_screen() {
	   
		drivermanager.getDriver().get(constants.url);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		LoginPageObjects.username.sendKeys(constants.username);
		LoginPageObjects.password.sendKeys(constants.password);
		LoginPageObjects.loginButton.click();
		
		String homeurl=drivermanager.getDriver().getCurrentUrl();
		
		
		
	
		
		
	}

	@When("user clicks the directory option from menu bar")
	public void user_clicks_the_directory_option_from_menu_bar() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		 
		HomePageObjects.directory.click();
	
		
		
	}

	@And("user selects the job title as {string} from the dropdown")
	public void user_selects_the_job_title_as_from_the_dropdown(String role) {
		
		/*
		 * Select select =new Select(DirectoryPageObjects.jobtitile_dropdown);
		 * 
		 * select.selectByVisibleText(role);
		
		 */
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		DirectoryPageObjects.jobtitile_dropdown.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		//DirectoryPageObjects.optiontoselect.click();
		
		common_utilities.javaScriptExecutor("arguments[0].scrollIntoView(true);", DirectoryPageObjects.optiontoselect);
		
		
		
	}

	@And("click then search button")
	public void click_then_search_button() {
		 DirectoryPageObjects.search_button.click();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
	}

	@Then("user should see CEO name as {string}")
	public void user_should_see_ceo_name_as(String name) {
		String CEOName= DirectoryPageObjects.CEO_name.getText();
		
		Assert.assertEquals(name, CEOName);
	}
	
	
}
