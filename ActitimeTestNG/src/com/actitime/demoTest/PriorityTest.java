package com.actitime.demoTest;

import org.testng.annotations.Test;

public class PriorityTest {
	
	//In Order to change the order of Execution, we go for Priority
	@Test(priority=1)
	public void demoCreateTest()
	{
		System.out.println("Execute Demo Create Test");
		
	}
	
	@Test(priority=2)
	public void demoModifyTest()
	{
		System.out.println("Execute Demo Modify Test");
	}
	@Test(priority=3)
	public void demoDeleteTest()
	{
		System.out.println("Execute Demo delete Test");		
	}

}
