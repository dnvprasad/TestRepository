package com.actitime.demoTest;

import org.testng.annotations.Test;

public class DependentOnMethodsTest {
	 //Dependency is the feature which is used to create dependency between two test cases , in case of dependency 
	//if one test case is failed , dependent test case is skipped automatically
	
	@Test
	public void demoCreateTest()
	{
		System.out.println("Execute Demo Create Test");
		int[] arr= {1,2,3,4};
		System.out.println(arr[5]);
	}
	
	@Test(dependsOnMethods="demoCreateTest")
	public void demoModifyTest()
	{
		System.out.println("Execute Demo Modify Test");
	}
	@Test(dependsOnMethods="demoModifyTest")
	public void demoDeleteTest()
	{
		System.out.println("Execute Demo delete Test");		
	}
	
	
	
	
	

}
