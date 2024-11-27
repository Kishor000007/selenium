package testNG_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T8 extends BaseTest2{

	@Test
	public void fbLoginScript() {	    
			driver.get("https://www.facebook.com");			 
		    driver.findElement(By.name("email")).sendKeys("Dhoni");			
			driver.findElement(By.id("pass")).sendKeys("12344567");			
			driver.findElement(By.name("login")).click();
		}
}
