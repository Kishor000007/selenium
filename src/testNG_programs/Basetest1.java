package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest1 {

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
}
