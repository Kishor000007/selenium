package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//program for @Test
public class T2 {

	@Test
	public void fbLoginScript() {
		 
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");	
		    WebDriver driver=new ChromeDriver(); 
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.manage().window().maximize();		    
			driver.get("https://www.facebook.com");			 
		    driver.findElement(By.name("email")).sendKeys("Dhoni");			
			driver.findElement(By.id("pass")).sendKeys("12344567");			
			driver.findElement(By.name("login")).click();
			driver.quit();
	}
}
