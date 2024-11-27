package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Basetest {

	public static final String Userdir = System.getProperty("user.dir");
	public static final String chromekey = "webdriver.chrome.driver";
	public static final String chromeValue = Userdir + "/drivers/chromedriver.exe";

	public WebDriver driver;

	public void setPath() {
		System.setProperty(chromekey, chromeValue);
	}

	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://app.elorus.com/login/");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void killDriver() {
		try {
			Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
		} catch (Exception e) {

		}
	}
}
