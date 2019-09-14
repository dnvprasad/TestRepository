package com.actitime.customerTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.objectrepositorylib.ActiveProjectAndCustomer;
import com.actitime.objectrepositorylib.CreateCustomerPage;
import com.actitime.objectrepositorylib.HomePage;
import com.actitime.objectrepositorylib.OpenTask;


public class CreateCustomerTest extends BaseClass{

	@Test
	public void createCustomerTest() throws Throwable 
	{
		System.out.println("========== Test Script 1 Started=============");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Read data from Excel
		String CUSTOMERNAME=flb.getExcelData("Sheet1", 1, 2);
		//String CUSTOMERNAME1=flb.getExcelData("Sheet1", 4,2);
		//String DESCRIPTIONNAME=flb.getExcelData("Sheet1", 4, 3);
		
	    //Step 1 : Click on Task Image
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		home.getTaskImg().click(); 
		
		//Step 2 : Click on project&Customer Link button
		OpenTask oTask=PageFactory.initElements(driver, OpenTask.class);
		oTask.getProjAndcustLnk().click();
		
		//Step 3 : Click on Create Customer Button
		ActiveProjectAndCustomer projAndCust= PageFactory.initElements(driver, ActiveProjectAndCustomer.class);
		projAndCust.getCreateCustomerbtn().click();
		
		//Step 4 : Create New Customer
		CreateCustomerPage createcustomerpage=PageFactory.initElements(driver, CreateCustomerPage.class);
		createcustomerpage.createNewCustomer(CUSTOMERNAME);
		
	}
		
		@Test
		public void CreateCustomerwithDesc() throws Throwable
		{
			System.out.println("========== Test Script 2 Started=============");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//Read data from excel
			//String CUSTOMERNAME=flb.getExcelData("Sheet1", 1, 2);
			String CUSTOMERNAME1=flb.getExcelData("Sheet1", 4,2);
			String DESCRIPTION=flb.getExcelData("Sheet1", 4, 3);
			
		    //Step 1 : Click on Task Image
			HomePage home=PageFactory.initElements(driver, HomePage.class);
			home.getTaskImg().click(); 
			
			//Step 2 : Click on project&Customer Link button
			OpenTask oTask=PageFactory.initElements(driver, OpenTask.class);
			oTask.getProjAndcustLnk().click();
			
			//Step 3 : Click on Create Customer Button
			ActiveProjectAndCustomer projAndCust= PageFactory.initElements(driver, ActiveProjectAndCustomer.class);
			projAndCust.getCreateCustomerbtn().click();
			
			
			//Step 4 : Create New Customer
			CreateCustomerPage createcustomerpage=PageFactory.initElements(driver, CreateCustomerPage.class);
			createcustomerpage.createCustomerWithDescription(CUSTOMERNAME1, DESCRIPTION);
			
			
		}
		
	}




