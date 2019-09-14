package com.actitime.projectTest;

import org.testng.annotations.Test;

public class ProjectTest {
	
	@Test(groups={"smokeTest"})
	public void createProjectTest()
	{
		System.out.println("Execute create Project Scripts");
	}
	@Test(groups={"regressionTest"})
	public void modifyProjectTest()
	{
		System.out.println("Execute modify project Scripts");
	}
	@Test(groups={"regressionTest"})
	public void deleteProjectTest()
	{
		System.out.println("Execute delete project Scripts");
	}
	

}
