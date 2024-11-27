package syncronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait_S4 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
	     
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.actitime.com/");
		
	   wait.until(ExpectedConditions.titleIs("actiTIME - Time Tracking Software for Cost-Effective Projects"));
	   
	   System.out.println(driver.getTitle());
	   
	   driver.findElement(By.xpath("//a[text()='Get started']")).click();
	   
	  wait.until(ExpectedConditions.titleContains("Free Timesheet"));
	  System.out.println(driver.getTitle());
	     
	     
	}
}
