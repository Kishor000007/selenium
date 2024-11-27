package testNG_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//program for @parameters
public class T9 {

	@Parameters("Heroine")
	@Test
	public void demoScript(String data) {
		System.out.println("from demo script");
		System.out.println("The received data is="+data);
		System.out.println("---------------");
	}
	
	@Parameters("Heroine")
	@BeforeMethod
	public void BeforeMethod(String data) {
		System.out.println("from before method");
		System.out.println("The received data is="+data);
		System.out.println("---------------");
	}
	
	@Parameters("Heroine")
	@AfterMethod
	public void afterMethod(String data) {
		System.out.println("from after method");
		System.out.println("The received data is="+data);
		System.out.println("---------------");
	}
	
	@Parameters("Heroine")
	@BeforeClass
	public void BeforeClass(String data) {
		System.out.println("from before class");
		System.out.println("The received data is="+data);
		System.out.println("---------------");
	}
	
	@Parameters("Heroine")
	@AfterClass
	public void afterClass(String data) {
		System.out.println("from after class");
		System.out.println("The received data is="+data);
	}
}
