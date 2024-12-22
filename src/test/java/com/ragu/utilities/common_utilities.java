package com.ragu.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ragu.constants.constants;
import com.ragu.pageObjects.DirectoryPageObjects;
import com.ragu.pageObjects.HomePageObjects;
import com.ragu.pageObjects.LoginPageObjects;
import com.ragu.webdrivermanager.drivermanager;

public class common_utilities {


	public void loadproperties() {
		

		Properties property =new Properties();
	try {
		property.load(getClass().getResourceAsStream("/config.properties"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}


		constants.url=property.getProperty("url");
		constants.browser =property.getProperty("browser");
		constants.username=property.getProperty("username");
		constants.password=property.getProperty("password");
		constants.chrome_driver_location=property.getProperty("chrome_driver_location");
		constants.firefox_driver_location=property.getProperty("firefox_driver_location");
		constants.edge_driver_location=property.getProperty("edge_driver_location");

	}
	
	public void initElements() {
		PageFactory.initElements(drivermanager.getDriver(), LoginPageObjects.class);
		PageFactory.initElements(drivermanager.getDriver(), HomePageObjects.class);
		PageFactory.initElements(drivermanager.getDriver(), DirectoryPageObjects.class);
	}
	
	public static void javaScriptExecutor(String argument, WebElement element) {
		
		JavascriptExecutor js=((JavascriptExecutor)drivermanager.getDriver());
		js.executeScript(argument, element);
	}
}
