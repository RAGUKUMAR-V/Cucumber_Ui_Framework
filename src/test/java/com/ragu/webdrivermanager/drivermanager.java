package com.ragu.webdrivermanager;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ragu.constants.constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drivermanager {

	
	private static WebDriver driver=null;
	
	//private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
	private static final Logger LOGGER=LogManager.getLogger(drivermanager.class);
	
	public static void browserstart() {
		
		try {
			
			switch (constants.browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching"+constants.browser);
				driver=new ChromeDriver();
				
				
		      // driver.set( new ChromeDriver());
		        
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				break;
			case "safari":
				WebDriverManager.safaridriver().setup();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching"+constants.browser);
				driver=new ChromeDriver();
				
				// driver.set( new ChromeDriver());
				break;
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static WebDriver getDriver() {
		return driver;
		
		//return driver.get();
	}
}
