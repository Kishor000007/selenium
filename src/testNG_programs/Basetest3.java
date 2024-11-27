package testNG_programs;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//program for parellel execution or cross browser testing
public class Basetest3 {

WebDriver driver ;
	
    @Parameters("BrowserName")
	@BeforeMethod
	public void launchBrowser(String bn) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");	
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Selenium\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\Selenium\\drivers\\msedgedriver.exe");
	   
		if(bn.equals("chrome"))
	      driver=new ChromeDriver();
		else if(bn.equals("firefox"))
		  driver=new FirefoxDriver();
		else if(bn.equals("edge"))
		  driver=new EdgeDriver();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Parameters("BrowserName")
	@BeforeTest
	public void beforeTest(String bn) {
		System.out.println(bn+" test started the execution");
	}
	
	@Parameters("BrowserName")
	@AfterTest
	public void afterTest(String bn) {
		System.out.println(bn+" test completed the execution");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Automation suite started the execution");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Automation suite completed the execution");
	}
}
