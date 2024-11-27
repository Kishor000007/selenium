package testNG_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//program  for DataProvider
public class T11 {

	@DataProvider
	public Object[] demoDataProvider() {
		Object[] data = { "Samantha", 100, true, '$', 56.4 };
		return data;
	}

	@Test(dataProvider = "demoDataProvider")
	public void demoScript(Object obj) {
		System.out.println("from demoScript");
		System.out.println(obj);
		System.out.println("------------");
	}
}
