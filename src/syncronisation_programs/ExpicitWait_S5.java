package syncronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//program for explicit wait
public class ExpicitWait_S5 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
	     
	     //creates an object of webdriverwait
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	     //It fetches the web application and waits until it is loaded//
			driver.get("https://www.actitime.com/");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Get started']")));
			
			driver.findElement(By.xpath("//a[text()='Get started']")).click();
	}
}
