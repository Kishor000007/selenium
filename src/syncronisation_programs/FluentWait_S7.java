package syncronisation_programs;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait_S7 {

	public static void main(String[] args) {
		//sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.actitime.com/");
		
	   FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	   wait.pollingEvery(Duration.ofMillis(250));
	   wait.withTimeout(Duration.ofSeconds(30));
	   wait.ignoring(NoSuchElementException.class);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Get started']")));
		
		driver.findElement(By.xpath("//a[text()='Get started']")).click();
		
	}
}
