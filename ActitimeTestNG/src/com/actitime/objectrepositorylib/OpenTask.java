package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projAndcustLnk;

	public WebElement getProjAndcustLnk() {
		return projAndcustLnk;
	}
	
	
	

}
