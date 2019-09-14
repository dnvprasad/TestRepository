package com.actitime.assertionTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertEqualsTest {
	
	@Test
	public void alertWindowPopUpMsg() throws Throwable
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		//enter Customer ID in the Edit Box
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("aaa");
		
		//Click on Submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		//Pass Driver control to Alert Window
		Alert alt=driver.switchTo().alert();
		
		//Verify the alert message in popup window
		/*if(alt.getText().equals("Do you really want to delete this Customer?")) 
		{
		System.out.println("Alert Message is verified == PASS");
		}
		else
		{
			System.out.println("Alert Message is not verified == FAIL");
		}*/
		String expMessage="Do you really want to delete this Customer?";
		String actmessage=alt.getText();
		
		//Assert.assertEquals("Do you really want to delete this Customer?", alt.getText());
		
		Assert.assertEquals(expMessage, actmessage);
		
			
		//Click on OK button 
		//alt.accept();
		
		//Close the current Browser
		//driver.close();
	}

}
