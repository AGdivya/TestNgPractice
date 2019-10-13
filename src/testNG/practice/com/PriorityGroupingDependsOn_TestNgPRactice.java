package testNG.practice.com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class PriorityGroupingDependsOn_TestNgPRactice 
{
  static WebDriver driver;
  
  @BeforeSuite
  public void suite()			//1
  {
 	System.out.println("I am in BeforeSuite PriorityGroupingDependsOn_TestNgPRactice"); 
  }
  
  @BeforeTest
  public void setUp()			//2
  {
 	 System.out.println("I am in BeforeTest of PriorityGroupingDependsOn_TestNgPRactice");
 	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
 	  driver = new ChromeDriver();
 	  driver.manage().deleteAllCookies();
 	  driver.manage().window().maximize();
 	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
 }
  
  @BeforeClass
  public void launchURL()
  {
	  String url = "https://www.google.co.in/";
	  driver.get(url);
	  System.out.println("I am Google ---> BeforeClass of PriorityGroupingDependsOn_TestNgPRactice");
  }
  
  @BeforeMethod
  public void logoTest()
  {
	  boolean c = driver.findElement(By.id("hplogo")).isDisplayed();
	  System.out.println(c + "----" + "BeforeMethod of PriorityGroupingDependsOn_TestNgPRactice");
  }
  
  @Test(priority=0,groups= {"A"})
  public void searchByVoice()
  {
	 boolean voice = driver.findElement(By.className("JC0tCe")).isEnabled(); //check this later
	 System.out.println(voice + "----" + "first Test of PriorityGroupingDependsOn_TestNgPRactice");
	 System.out.println("I am in group A");
  }
  
  @Test(priority=1,groups= {"B"})
  public void Test1()
  {
	  System.out.println("I am in group B");
  }
  
  @Test(priority=4,groups= {"A"})
  public void Test2()
  {
	  System.out.println("I am in group A");
  }
  
  @Test(priority=2,groups= {"B"})
  public void Test3()
  {
	  System.out.println("I am in group B");
  }
  
  @Test(priority=3,groups= {"A"})
  public void Test4()
  {
	  System.out.println("I am in group A");
  }
  
  @AfterMethod
  public void navigateBack()
  {
	  driver.navigate().back();
	  System.out.println("back to normal page --- AfterMethod of PriorityGroupingDependsOn_TestNgPRactice");
  }
  
  @AfterClass
  public void navigateForward()
  {
	  driver.navigate().forward();
	  System.out.println("Again at Google --- AfterClass  of PriorityGroupingDependsOn_TestNgPRactice");
  }
  
  @AfterTest
  public void close()
  {
	  driver.close();
	  System.out.println("Browser closed -----AfterTest of PriorityGroupingDependsOn_TestNgPRactice");
  }
  
  @AfterSuite
  public void suiteafter()   //9
  {
 	 System.out.println("I am in AfterSuite of PriorityGroupingDependsOn_TestNgPRactice");
  }
}
