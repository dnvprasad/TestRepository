package com.actitime.demoTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterTest {
	
	@Test
	public void createReportTest()
	{
		Reporter.log("Step1:Login to the App");
		Reporter.log("Step2:Create Customer");
		Reporter.log("Step3:Verify the Test");
		Reporter.log("Step4:Logout");
	}
	
	@Test
	public void modifyCustomerTest()
	{
		Reporter.log("Step1:Login to the App");
		Reporter.log("Step2:Modify Customer Name");
		Reporter.log("Step3:Verify the Test");
		Reporter.log("Step4:Logout");
	}
	
	@Test
	public void deleteCustomerTest()
	{
		Reporter.log("Step1:Login to the App",true);
		Reporter.log("Step2:Delete Customer Name",true);
		Reporter.log("Step3:Verify the Test",true);
		Reporter.log("Step4:Logout",true);
		
	}
	
	@Test
	public void clearCustomerTest()
	{
		Reporter.log("Step1:Login to the App",false);
		Reporter.log("Step2:Delete Customer Name",false);
		Reporter.log("Step3:Verify the Test",false);
		Reporter.log("Step4:Logout",false);
	}

}
