package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepositorylib.HomePage;
import com.actitime.objectrepositorylib.LoginPage;


public class BaseClass {
	
	public static WebDriver driver;
	public FilelibClass flb=new FilelibClass();
	
	@BeforeClass
	public void configBT() throws Throwable {
			
		String BROWSER =flb.getpropertyfileKeyValue("browser");
		System.out.println("=======Launching Browser=======");
		if(BROWSER.equals("firefox"))
		{
		driver =new FirefoxDriver();
		}
		else if(BROWSER.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(BROWSER.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
	}
		
		@BeforeMethod
		public void configBM() throws Throwable
		{
			System.out.println("==========Login============");
			String URL=flb.getpropertyfileKeyValue("url");
			String USERNAME=flb.getpropertyfileKeyValue("username");
			String PASSWORD=flb.getpropertyfileKeyValue("password");
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(URL);
			
			LoginPage login=PageFactory.initElements(driver, LoginPage.class);
			login.logintoApp(USERNAME, PASSWORD);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
		}
		
		@AfterMethod
		public void configAM()throws Throwable
		{
			System.out.println("=========Logout===========");
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//WebDriverWait wait= new WebDriverWait(driver,20);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
			Thread.sleep(2000);
			HomePage home=PageFactory.initElements(driver, HomePage.class);
			home.logout();
			
			
		}
		
		@AfterClass
		public void configAC()throws Throwable
		{
			System.out.println("============Closing Browser=========");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Thread.sleep(2000);
			driver.close();
		}
		
		/*@BeforeTest
		@Parameters("browser")
		public void configBT(String browser) throws Throwable
		{
			System.out.println("=======Launching Browser=======");
			if(browser.equals("firefox"))
			{
			driver =new FirefoxDriver();
			}
			else if(browser.equals("chrome"))
			{
				driver =new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(5000);
			}
			else if(browser.equals("ie"))
			{
				driver=new InternetExplorerDriver();
			}
			
		}*/
		
		/*@AfterTest
		public void configAT() throws Throwable
		{
			System.out.println("============Closing Browser=========");
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.close();
		}*/

}
