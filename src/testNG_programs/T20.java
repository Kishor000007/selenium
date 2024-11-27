package testNG_programs;

import org.testng.annotations.Test;

public class T20 {

	@Test(dependsOnMethods = {"loginScript"})
	public void contactScript() {
		System.out.println("from contact script");
	}
	@Test
	public void loginScript() {
		System.out.println("from login script");
	}
	@Test(dependsOnMethods = {"loginScript","contactScript"})
	public void addContactScript() {
		System.out.println("from add contact script");
	}
}
