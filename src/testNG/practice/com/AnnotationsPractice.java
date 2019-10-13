package testNG.practice.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AnnotationsPractice 
{
	//this class is define various annotations in TestNg the order is as below
	 
 static WebDriver driver;
 @BeforeSuite
 public void suite()			//1
 {
	System.out.println("I am in BeforeSuite AnnotationsPractice"); 
 }
 @BeforeTest
 public void setUp()			//2
 {
	 System.out.println("I am in BeforeTest of AnnotationsPractice");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
}
 
 @BeforeClass
 public void classTestNg() //3
 {
	 System.out.println("I am in BeforeClass of AnnotationsPractice"); 
	 String URL = "https://divya-upadhyay.herokuapp.com/admin";
	  driver.get(URL);
 }
 
 @BeforeMethod  		 //4
 public void method()
 {
	 System.out.println("I am in BeforeMethod of AnnotationsPractice"); 
 }
 
 @Test(priority=0)
 public void test() 	 //5
 {
	String str =  driver.getTitle();
	System.out.println(str);
	System.out.println("First Test of AnnotationsPractice");
 }
 
 // here we don't set priority ,test case will run in random order,so to remove this we are setting priority
 @Test(priority=1)
 public void loginButtonCheck()
 {
	boolean b= driver.findElement(By.name("commit")).isEnabled();
	 System.out.println(b);
	 System.out.println("Second Test of AnnotationsPractice");
 }
 
 @AfterMethod
 public void method1() 		//6
 {
	 System.out.println("I am in AfterMethod of AnnotationsPractice"); 
 }
 
 /* THIS IS RUNNING ORDER OF OUR TEST CASES
I am in before Class
I am in before Method
Login | Qa Test
I am in after Method
I am in before Method
true
I am in after Method
I am in after class
I am in after Test
  * 
  */
 @AfterClass
 public void classTestNgAfter()		//7
 {
	 System.out.println("I am in AfterClass of AnnotationsPractice"); 
 }
 
 @AfterTest
 public void close()      //8
 {
	 driver.close();
	 System.out.println("I am in AfterTest of AnnotationsPractice");
 }
 
 @AfterSuite
 public void suiteafter()   //9
 {
	 System.out.println("I am in AfterSuite of AnnotationsPractice");
 }
}
