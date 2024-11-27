package testNG_programs;

import org.testng.annotations.Test;

//program for invocation count
public class T19 {

	@Test(invocationCount = 4)
	public void contactScript() {
		System.out.println("from contact script");
	}
	@Test(priority = 2,invocationCount = 3)
	public void loginScript() {
		System.out.println("from login script");
	}
	@Test(priority = 3,invocationCount = 5)
	public void addContactScript() {
		System.out.println("from add contact script");
	}
}
