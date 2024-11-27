package testNG_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T7 extends BaseTest2 {

	@Test
	public void elorusLoginScript() {  
		    driver.get("https://app.elorus.com/login/");
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys("selenium96@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Selenium@098");
			driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	}
}
