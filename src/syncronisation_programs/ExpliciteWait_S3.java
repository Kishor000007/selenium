package syncronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait_S3 {

	public static void main(String[] args) {
		 
		 //sets the path for chromrdriver.exe//
//			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
					
	      //It launches the Chrome browser//
		  WebDriver driver=new ChromeDriver();
		  
		 driver.manage().window().maximize();
		  
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		 driver.get("https://app.elorus.com/login/");
		 
		 wait.until(ExpectedConditions.titleIs("Log in | Elorus"));
		 driver.getTitle();
		 
		 //identifies the email and enters the data//
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("selenium96@gmail.com");
			
		 //identifies the password and enters the data//
	   	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@098");
			
			 //identifies the xpath and enters the data//
			driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		 
	}
}
