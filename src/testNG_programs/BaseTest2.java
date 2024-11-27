package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//program for beforeclass and afterclass
public class BaseTest2 {

	WebDriver driver ;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");	
	    driver=new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
