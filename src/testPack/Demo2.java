package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeSuite
	public void beforeuite()
	{
		System.out.println("BeforeSuite_Demo2");
	}


	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest_Demo2");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass_Demo2");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod_Demo2");
	}
	
	@Test 
	public void test1()
	{
		System.out.println("Test1_Demo2");
	}
	
	@Test 
	public void test2()
	{
		System.out.println("Test2_Demo2");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod_Demo2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass_Demo2");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest_Demo2");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite_Demo2");
	}

	
	
}
