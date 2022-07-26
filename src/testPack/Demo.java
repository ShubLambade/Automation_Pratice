package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass_Demo");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod_Demo");
	}
	
	@Test 
	public void test1()
	{
		System.out.println("Test1_Demo");
	}
	
	@Test 
	public void test2()
	{
		System.out.println("Test2_Demo");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod_Demo");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass_Demo");
	}


}
