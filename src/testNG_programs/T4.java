package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//program for beforemethod and aftermethod
public class T4 {
	
	 WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");	
	    driver=new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void fbLoginScript() {	    
			driver.get("https://www.facebook.com");			 
		    driver.findElement(By.name("email")).sendKeys("Dhoni");			
			driver.findElement(By.id("pass")).sendKeys("12344567");			
			driver.findElement(By.name("login")).click();
		}
	
	@Test
	public void elorusLoginScript() {  
		    driver.get("https://app.elorus.com/login/");
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys("selenium91@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Selenium@098");
			driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	}
}
