package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImpClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	String fTestName=result.getMethod().getMethodName();
	System.out.println(fTestName);
	EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.driver);
	File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
	File destFile=new File("./Screenshot/test_"+fTestName+".png");
	 try
	  {
		FileUtils.copyFile(srcFile, destFile);
	  }
	 catch(IOException e)
	  {
		
	  }
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
