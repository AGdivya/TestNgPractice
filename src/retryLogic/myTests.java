package retryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myTests 
{

	@Test(retryAnalyzer = com.analyzer.RetryAnalyzer.class)
	// By using this logic atleast your testcase will run 3 times and then final status of your test should display
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void  Test2()
	{
		Assert.assertEquals(false, true);
	}
}
