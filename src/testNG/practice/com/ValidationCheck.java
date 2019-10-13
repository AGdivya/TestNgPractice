package testNG.practice.com;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ValidationCheck 
{
	static WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void launchURL()
	{
		String url = "https://www.google.co.in/";
		driver.get(url);
		
	}
	
	@Test
	public void verifyTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		//verify title is correct or not
		Assert.assertEquals(title, "Google","Title is not matched"); //if our title doesnot match , our test case will get fail ex Google123
	}
	
	@Test
	public void logoCheck()
	{
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		System.out.println(b);
	//	Assert.assertTrue(true, "logo is not display");
		Assert.assertTrue(b);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
