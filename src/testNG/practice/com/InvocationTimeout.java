package testNG.practice.com;

import org.testng.annotations.Test;

public class InvocationTimeout 
{
/*
 * This keyword we basically use to stop infinite loop conditions in our code
 * But,it is not advisable to use this kind of logic in our code
 */
//	@Test(invocationTimeOut = 20,expectedExceptions = NumberFormatException.class)  //after 20 ms  script will automatically stop
//	
//	//How you handle exception --> You need to use keyword "expectedExceptions" to handle this kind of situation
//	public void invocationTimeout()
//	{
//		int i=1;
//		while(i==1)
//		{
//			System.out.println("Value of i=="+i);
//		}
//	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void exception()
	{
		String x = "110A";
		Integer.parseInt(x);
	}
}
