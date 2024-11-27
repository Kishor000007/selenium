package syncronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//[program for explicitwait
public class ExplicitWait_S6 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
	     
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://app.elorus.com/login/");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		 //identifies the email and enters the data//
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("selenium92@gmail.com");
		
		 //identifies the password and enters the data//
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@098");
		
		 //identifies the xpath and enters the data//
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		
		//waits until sign in button is invisible
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@value='SIGN IN']")));
		
		//waits until user menu is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='User menu']")));
		
		//identifies user menu and clicks
		driver.findElement(By.xpath("//a[@title='User menu']")).click();
		
		//waits until logout button is clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));
		
		//identifies logout button and clicks
		driver.findElement(By.xpath("//a[text()='Logout']")).click();		
	}
}
