package com.actitime.assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	
	@Test
	public void createCustomerTest()
	{
		System.out.println("===STEP1=====");
		System.out.println("===STEP2=====");
		Assert.assertEquals("HDFC", "HDCC");
		System.out.println("===STEP3=====");
		Assert.assertEquals("ICICI", "ICI");
		System.out.println("===STEP4=====");	
	}
	
	@Test
	public void modifyCustomerTest()
	{
		System.out.println("===STEP1=====");
		System.out.println("===STEP2=====");
		//Assert.assertEquals("HDFC", "HDCC");
		System.out.println("===STEP3=====");
		//Assert.assertEquals("ICICI", "ICI");
		System.out.println("===STEP4=====");
	}

}
