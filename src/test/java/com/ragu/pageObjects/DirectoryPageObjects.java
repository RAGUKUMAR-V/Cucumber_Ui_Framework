package com.ragu.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPageObjects {
	
	
	private static DirectoryPageObjects directorypageinstance;
	
	private DirectoryPageObjects() {
		
	}
	
	public static DirectoryPageObjects getDirectoryPageObjects() {
		if(directorypageinstance==null) {
			directorypageinstance=new DirectoryPageObjects();
		}
		
		return directorypageinstance;
	}

	@FindBy(xpath="//label[text()='Job Title']/following::div[text()='-- Select --'][1]")
	private WebElement jobtitile_dropdown;
	
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search_button;
	
	@FindBy(xpath="//div[text()='Account Assitant']")
	private WebElement optiontoselect;
	
	
	@FindBy(xpath="//h5[text()='Directory']")
	private WebElement heading;
	
	@FindBy(xpath="//p[text()='HR Manager']")
	private WebElement HR_Manager_Card;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
	private WebElement optiontoselected;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/p[1]")
	private WebElement CEO_name;


	public String getHeading() {
		String header=heading.getText();
		return header;
	}
	
	public void clickDropDown() {
		jobtitile_dropdown.click();
	}
	
	public void clickSearchButton() {
		search_button.click();
	}


	
	
}
