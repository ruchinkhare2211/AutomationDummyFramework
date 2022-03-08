package com.basepage;

import java.util.concurrent.TimeUnit;

import com.utility.ScreenShots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//with the help of this class lunch the web browser and close it //
public class BasePage {
	
	public WebDriver driver;
	//==============for browser lunch==========================//
	@BeforeTest
		public void startBroser()
		{
			System.setProperty("webdriver.chrome.driver","../Chaayas_Framework/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://localhost:8080/");
			driver.manage().deleteAllCookies();
		}
	//===========================for browser close==================//
//	@AfterMethod
//	public void closeConnection(ITestResult result) throws Exception
//	{
//		if(ITestResult.FAILURE==result.getStatus())
//		{
//			ScreenShots.takeScreenShot(driver, result.getName());
//			System.out.println("Screenshot Taken");
//		}
//		driver.close();
//	}
}
