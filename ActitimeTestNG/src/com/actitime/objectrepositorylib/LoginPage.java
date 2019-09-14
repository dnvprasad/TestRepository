package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	
	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//Business Logic Method
	public void logintoApp(String username,String password)
	{
		getUserNameEdt().sendKeys(username);
		getPasswordEdt().sendKeys(password);
		getLoginBtn().click();
		
	}

	
		
}
	
	
	
		
	



