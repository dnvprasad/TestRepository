package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCustomer {
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerbtn;

	public WebElement getCreateCustomerbtn() {
		return createCustomerbtn;
	}
	
	

}
