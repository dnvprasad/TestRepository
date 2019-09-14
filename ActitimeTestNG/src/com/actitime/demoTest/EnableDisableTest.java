package com.actitime.demoTest;

import org.testng.annotations.Test;

public class EnableDisableTest {
	
	//Enabled is the feature in TestNG , which is used to disable the test execution in runtime
	@Test(enabled=false)
	public void demoCreateTest()
	{
		System.out.println("Execute Demo Create Test");
		
	}
	
	@Test(enabled=true)
	public void demoModifyTest()
	{
		System.out.println("Execute Demo Modify Test");
	}
	@Test(enabled=true)
	public void demoDeleteTest()
	{
		System.out.println("Execute Demo delete Test");		
	}

}
