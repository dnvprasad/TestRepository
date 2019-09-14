package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;

public class CreateCustomerPage extends BaseClass{
	
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNameEdt;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement descriptionEdt;
	
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement createCustbtn;

	public WebElement getCustomerNameEdt() {
		return customerNameEdt;
	}

	public WebElement getDescriptionEdt() {
		return descriptionEdt;
	}

	public WebElement getCreateCustbtn() {
		return createCustbtn;
	}
	
	public void createNewCustomer(String customerName)
	{
		getCustomerNameEdt().sendKeys(customerName);
		getCreateCustbtn().click();
	}
	
	public void createCustomerWithDescription(String CustomerName,String desc)
	{
		getCustomerNameEdt().sendKeys(CustomerName);
		getDescriptionEdt().sendKeys(desc);
		getCreateCustbtn().click();
		
	}
}
