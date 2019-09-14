package com.customerTest;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

public class CustomerTest extends BaseClass{
	
		@Test
		public void createCustomerTest()
		{
			System.out.println("Execute all Create Customer Scripts");
		}
		
		@Test
		public void modifyCustomerTest()
		{
			System.out.println("Execute all Modify Customer Scripts");
		}
		@Test
		public void deleteCustomerTest()
		{
			System.out.println("Execute all Delete Customer Scripts");
		}

	}


