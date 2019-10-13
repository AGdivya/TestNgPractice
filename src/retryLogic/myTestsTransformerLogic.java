package retryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myTestsTransformerLogic 
{
	
	// if  we want to run multiple test cases for  multiple times to reduce number  of failure test cases
	// we don't need to provide analyzer interface everytime in each test methods
	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void  Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void  Test3()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void  Test4()
	{
		Assert.assertEquals(false, true);
	}
}
