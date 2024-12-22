package com.ragu.step_definitions;

import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ragu.constants.constants;
import com.ragu.utilities.common_utilities;
import com.ragu.webdrivermanager.drivermanager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class common_step_def {
	
	private static final Logger LOGGER=LogManager.getLogger(common_step_def.class);
	
	@Before
	public void beforescenario() {
		LOGGER.info("Execution started");
		try {
			LOGGER.info("Instantiating the common_utilities class");
			common_utilities utils=new common_utilities();
			LOGGER.info("Loading Property files");
			utils.loadproperties();
			LOGGER.info("checking driver is null or not");
			if(drivermanager.getDriver()==null) {
				
				LOGGER.info("driver is null and invoking the chrome browser");
				drivermanager.browserstart();
				utils.initElements();
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * @After public void afterscenario() {
	 * 
	 * drivermanager.getDriver().quit(); }
	 */
	

	
}
