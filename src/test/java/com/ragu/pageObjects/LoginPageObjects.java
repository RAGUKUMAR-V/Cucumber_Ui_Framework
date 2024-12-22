package com.ragu.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	
	@FindBy(xpath = "//input[@name='username']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginButton;
	
	
}
