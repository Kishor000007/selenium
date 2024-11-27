package testNG_programs;

import org.testng.annotations.Test;

//program for priority
public class T17 {

	@Test(priority = 2)
	public void contactScript() {
		System.out.println("from contact script");
	}
	@Test(priority = -1)
	public void loginScript() {
		System.out.println("from login script");
	}
	@Test(priority = 3)
	public void addContactScript() {
		System.out.println("from add contact script");
	}
}
