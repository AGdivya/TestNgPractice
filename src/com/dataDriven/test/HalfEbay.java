//package com.dataDriven.test;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//
//public class HalfEbay 
//{
//	static WebDriver driver;
//	@BeforeMethod 
//	public void setUp()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		String url = "http://halfebay.com/";
//		driver.get(url);
//	}
//	
//	@Test
//	public void register()
//	{
//		//driver.findElement(By.linkText("Ebay")).click();
//		driver.findElement(By.xpath("//*[@id=\"adBlock\"]/table/tbody/tr[1]/td/div/div/div/div/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"e2\"]/div[2]/div[1]/a")).click();
//	}
//	
//	@AfterMethod
//	public void tearDown() 
//	{
//		driver.close();
//	}
//}
