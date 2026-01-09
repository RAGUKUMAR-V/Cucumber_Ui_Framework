package com.ragu.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ragu.utilities.common_utilities;

public final class LoginPageObjects {
	
	private static LoginPageObjects loginpageinstance;
	
	private LoginPageObjects() {
		
	}
	
	public static LoginPageObjects getLoginPageinstance() {
		if(loginpageinstance==null) {
			loginpageinstance=new LoginPageObjects();
		}
		return loginpageinstance;
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton; 
	
	public void enterUsername(String USERNAME) {
		common_utilities.getcommon_utilities().highlightElements(username);
		username.sendKeys(USERNAME); 
	}
	
    public void enterPassword(String PASSWORD) {
    	common_utilities.getcommon_utilities().highlightElements(password);
		password.sendKeys(PASSWORD); 
	}
    
    public void clickSubmitButton() {
    	common_utilities.getcommon_utilities().highlightElements(loginButton);
    	loginButton.click(); 
	}
	
}
