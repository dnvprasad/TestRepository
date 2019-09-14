package com.actitime.assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void createCustomerTest()
	{
		SoftAssert s=new SoftAssert();
		System.out.println("===STEP1=====");
		System.out.println("===STEP2=====");
		s.assertEquals("HDFC", "HDCC");
		System.out.println("===STEP3=====");
		s.assertEquals("ICICI", "ICI");
		System.out.println("===STEP4=====");
		s.assertAll();
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
