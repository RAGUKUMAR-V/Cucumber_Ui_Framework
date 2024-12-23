package com.ragu.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

	private static HomePageObjects homepageinstance;
	
	private HomePageObjects() {
		
	}
	
	public static HomePageObjects getHomePageObjects() {
		if(homepageinstance==null) {
			homepageinstance=new HomePageObjects();
		}
		return homepageinstance;
	}
	
	@FindBy(xpath="//span[text()='Directory']")
	private WebElement directory;

	public void openDirectory() {
		
		directory.click();
	}
	
	
}
