package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskImg;
	
	@FindBy(linkText="Logout")
	private WebElement logoutlnk;
	
	
	public WebElement getTaskImg() {
		return taskImg;
	}


	public WebElement getLogoutlnk() {
		return logoutlnk;
	}

  //Business Logic Method
	public void logout()
	{
		getLogoutlnk().click();
	}
	

}
