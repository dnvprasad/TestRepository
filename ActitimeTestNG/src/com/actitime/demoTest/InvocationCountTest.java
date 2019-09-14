package com.actitime.demoTest;

import org.testng.annotations.Test;

public class InvocationCountTest {
	 // This is the feature in TestNG , which is used to Execute same Test Case multiple times
	//with same data
	@Test(invocationCount=5)
	public void demoCreateTest()
	{
		System.out.println("Execute Demo Create Test");		
	}
	
	

}
