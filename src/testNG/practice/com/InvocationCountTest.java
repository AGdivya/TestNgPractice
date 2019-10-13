package testNG.practice.com;

import org.testng.annotations.Test;

public class InvocationCountTest 
{
	/*
	 * If you want to run this test case for ex 10 times ,
	 * you need to pass a keyword Invocation count
	 * Generally we use this keyword when we want to dump large number of data in our system
	 */
@Test(invocationCount = 10)
public void Sum()
{
	int a = 10;
	int b = 70;
	int c = a+b;
	System.out.println("sum is ===" +c);
	
}
}
