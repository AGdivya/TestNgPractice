package testNG.practice.com;

import org.testng.annotations.Test;

public class TestNGFeatures 
{
	@Test
	public void LoginTest()
	{
		System.out.println("Login Test Success");
		int i= 9/0;
		// here Arithmetic Exception occur
	}

	@Test(dependsOnMethods = "LoginTest")  //depends on keyword saves our time
	public void HomePageTest()
	{
		System.out.println("Home Page Test Success");
	}
}
