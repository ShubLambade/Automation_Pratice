package testPack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Key_Words 
{
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test (enabled=false) // disabled // isEnabled=false
	public void test0()
	{
		System.out.println("Test0");
	}
	
	@Test (priority = -1 , dependsOnMethods = {"test3" , "test2"})
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test (invocationCount = 3 )
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test (priority = 1)
	public void test3()
	{
		System.out.println("Test3");
	  Assert.fail();
	}
	
	@Test (timeOut=2000)
	public void test4() throws InterruptedException
	{
		System.out.println("Test4");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}

}
