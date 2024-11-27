package testNG_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T1 {

	@BeforeSuite 
	public void BeforeSuite() {
		System.out.println("From before suit");
	}
	@AfterSuite 
	public void AfterSuite() {
		System.out.println("From after suit");
	}
	@BeforeClass 
	public void BeforeClass() {
		System.out.println("From Before class");
	}
	@AfterClass 
	public void AfterClass() {
		System.out.println("From after class");
	}
	@BeforeMethod 
	public void BeforeMethod() {
		System.out.println("From before method");
	}
	@AfterMethod 
	public void AfterMethod() {
		System.out.println("From after method");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("From before test");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("From after test");
	}
	@Test
	public void Test() {
		System.out.println("from test");
	}
	
}
