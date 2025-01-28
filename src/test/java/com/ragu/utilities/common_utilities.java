package com.ragu.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ragu.constants.constants;
import com.ragu.pageObjects.DirectoryPageObjects;
import com.ragu.pageObjects.HomePageObjects;
import com.ragu.pageObjects.LoginPageObjects;
import com.ragu.step_definitions.common_step_def;
import com.ragu.webdrivermanager.drivermanager;

public class common_utilities {
	
	private static final Logger LOGGER=LogManager.getLogger(common_utilities.getcommon_utilities());
	private static common_utilities utilitiesInstance=null;
	
	private common_utilities() {
		
	}
	
	public static common_utilities getcommon_utilities() {
		if(utilitiesInstance==null) {
			utilitiesInstance=new common_utilities();
		}
		return utilitiesInstance;
	}


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
		PageFactory.initElements(drivermanager.getDriver(), LoginPageObjects.getLoginPageinstance());
		PageFactory.initElements(drivermanager.getDriver(), HomePageObjects.getHomePageObjects());
		PageFactory.initElements(drivermanager.getDriver(), DirectoryPageObjects.getDirectoryPageObjects());
	}
	
	public void javaScriptExecutor(String argument, WebElement element) {
		
		JavascriptExecutor js=((JavascriptExecutor)drivermanager.getDriver());
		js.executeScript(argument, element);
	}
	
	public void takeScreenShot() {
		File screenshot=((TakesScreenshot)drivermanager.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("/ui_cucumber_project"+common_step_def.getScenarioName()+".png"));
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
	}	
	
	public void highlightElements(WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)drivermanager.getDriver());
		js.executeScript("arguments[0].setAttribute('style', 'border :3px solid blue');", element);
	}
	
	public void selectFromDropdown(WebElement element, String howToSelect, String whatToSelect) {
		Select select=new Select(element);
		switch (howToSelect) {
		case "Text":
			select.selectByVisibleText(whatToSelect);
			break;
		case "Index":
			select.selectByIndex(Integer.parseInt(whatToSelect));

			break;
		case "Value":
			select.selectByValue(whatToSelect);

			break;

		default:
			LOGGER.info("Provide the valid Selects, Those are: Text, Index, Value");
			break;
		}
	}
	
	public void alertHandlingAccept() {
		Alert alert=drivermanager.getDriver().switchTo().alert();
		alert.accept();
	}
	
	public void alertHandlingDismiss() {
		Alert alert=drivermanager.getDriver().switchTo().alert();
		alert.dismiss();
	}
	
	public void moveToElement(WebElement element) {
		Actions action=new Actions(drivermanager.getDriver());
		action.moveToElement(element).build().perform();
	}
	
}
