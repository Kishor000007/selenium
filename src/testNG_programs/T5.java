package testNG_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T5 extends Basetest1{

	@Test
	public void elorusLoginScript() {  
		    driver.get("https://app.elorus.com/login/");
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys("selenium91@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Selenium@098");
			driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	}
}
