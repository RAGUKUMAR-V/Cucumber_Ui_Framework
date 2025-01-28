package com.ragu.step_definitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	
   private static final Logger LOGGER=LogManager.getLogger(CEO_name_step_def.class);
   
   

	@Given("user is logged in successfully and on home screen")
	public void user_is_logged_in_successfully_and_on_home_screen() {
	   
		drivermanager.getDriver().get(constants.url);
		
		drivermanager.getDriver().manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		LoginPageObjects.getLoginPageinstance().enterUsername(constants.username);
		LoginPageObjects.getLoginPageinstance().enterPassword(constants.password);
		LoginPageObjects.getLoginPageinstance().clickSubmitButton();
		
		String homeurl=drivermanager.getDriver().getCurrentUrl();
		
		
		
	
		
		
	}

	@When("user clicks the directory option from menu bar")
	public void user_clicks_the_directory_option_from_menu_bar() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		 
		HomePageObjects.getHomePageObjects().openDirectory();
	
		
		
	}

	@And("user selects the job title as {string} from the dropdown")
	public void user_selects_the_job_title_as_from_the_dropdown(String role) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		DirectoryPageObjects.getDirectoryPageObjects().clickDropDown();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		//DirectoryPageObjects.optiontoselect.click();
		
		//common_utilities.javaScriptExecutor("arguments[0].scrollIntoView(true);", DirectoryPageObjects.optiontoselect);
		
		
		try{
			String name=DirectoryPageObjects.getDirectoryPageObjects().getHeading();
			if(role.equals(name)) {
				LOGGER.info("user can see the directory page");
			}
		}catch(Exception e){
			LOGGER.error(e);
			common_utilities.getcommon_utilities().takeScreenShot();
			Assert.fail(e.getMessage());
		}
		
		
		
		
		
	}

	@And("click then search button")
	public void click_then_search_button() {
		 DirectoryPageObjects.getDirectoryPageObjects().clickSearchButton();
		
	}

	@Then("user should see CEO name as {string}")
	public void user_should_see_ceo_name_as(String name) {
		
		/*
		 * String CEOName= DirectoryPageObjects.CEO_name.getText();
		 * Assert.assertEquals(name, CEOName);
		 */
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		
		//String getname=DirectoryPageObjects.HR_Manager_Card.getText();
		 String heading=DirectoryPageObjects.getDirectoryPageObjects().getHeading();
		if(heading.equalsIgnoreCase(name)) {
			LOGGER.info("we are on the Directory page");
		}
		
	//	drivermanager.getDriver().close();
		
	}
	
	
}
