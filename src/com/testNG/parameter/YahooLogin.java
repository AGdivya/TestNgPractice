package com.testNG.parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YahooLogin 
{
	static WebDriver driver;
	@BeforeTest
	@Parameters({"env","browser"})
	public void launchBrowser(String env , String browser)
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Divya\\Downloads\\Softwares\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	// when we dont want to give hardcode value for TestNg then we use parameter annotation
	@Parameters({"url","emailId"})
	public void launchURL(String url , String emailId)
	{
		
		driver.get(url);
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailId); 
		driver.findElement(By.name("signin")).click();
		System.out.println("clicked");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
