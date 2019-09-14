package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebCommLibClass extends BaseClass {
	
	//Implicitly Wait
	public void waitForPageToLoad()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//Explicitly Wait 
		public void WaitforExpElementToLoad(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	//Dropdown with Select Class
		public void select(WebElement element , String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		
	//Dropdown using Index
		public void select(WebElement element , int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}

}
