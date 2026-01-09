package com.ragu.step_definitions;

import java.util.List;
import java.util.Map;
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

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practice {
	
   private static final Logger LOGGER=LogManager.getLogger(Practice.class);
   
  
   @Given("the following user credentials:")
   public void the_following_user_credentials(DataTable dataTable) {
       List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
       for (Map<String, String> row : credentials) {
           System.out.println("Username: " + row.get("username"));
           System.out.println("Password: " + row.get("password"));
       }
   }

   @When("the users try to login")
   public void the_users_try_to_login() {
       // Write code here that turns the phrase above into concrete actions
       throw new io.cucumber.java.PendingException();
   }
   @Then("they should see their dashboard")
   public void they_should_see_their_dashboard() {
       // Write code here that turns the phrase above into concrete actions
       throw new io.cucumber.java.PendingException();
   }
   
   @Given("the following search keywords:")
   public void the_following_search_keywords(DataTable dataTable) {
       List<String> keywords = dataTable.asList(String.class);
       for (String keyword : keywords) {
           System.out.println("Searching for: " + keyword);
       }
   }

	
	
}
