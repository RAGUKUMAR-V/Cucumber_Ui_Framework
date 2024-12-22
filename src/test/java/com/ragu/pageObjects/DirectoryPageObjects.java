package com.ragu.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPageObjects {

	@FindBy(xpath="//label[text()='Job Title']/following::div[text()='-- Select --'][1]")
	public static WebElement jobtitile_dropdown;
	
	
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement search_button;
	
	@FindBy(xpath="//div[text()='HR Manager']")
	public static WebElement optiontoselect;
	
	
	

	@FindBy(xpath="//p[text()='manda akhil user ']")
	public static WebElement CEO_name;
}
