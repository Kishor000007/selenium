package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p2 {

	WebDriver driver;

	@Test
	public void elorusLoginScript() {
		driver.get("https://app.elorus.com/login/");
		driver.findElement(By.name("email")).sendKeys("selenium92@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Selenium@098");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	}
    @Parameters("BrowserName")
	@BeforeMethod
	public void before(String bn) {
		if (bn.equals("chrome"))
			driver = new ChromeDriver();
		else if (bn.equals("edge"))
			driver = new EdgeDriver();
		else if (bn.equals("firefox"))
			driver = new FirefoxDriver();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
    @AfterMethod
    public void after() {
    	driver.quit();
    }
	
}
