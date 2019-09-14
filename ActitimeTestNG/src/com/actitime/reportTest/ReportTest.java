package com.actitime.reportTest;

import org.testng.annotations.Test;

public class ReportTest {
	
	@Test(groups={"smokeTest"})
	public void createReportTest()
	{
		System.out.println("Execute Create Report Scripts");
	}
	@Test(groups={"regressionTest"})
	public void modifyReportTest()
	{
		System.out.println("Execute modify Report Scripts");
	}
	@Test(groups={"regressionTest"})
	public void deleteReportTest()
	{
		System.out.println("Execute delete Report Scripts");
	}

}
