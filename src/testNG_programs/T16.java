package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//program for SoftAssert class
public class T16 {

	@Test
	public void elorusLoginScript() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://app.elorus.com/login/");

		SoftAssert s = new SoftAssert();

		WebElement welcomePageText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		// s.assertEquals(welcomePageText.isDisplayed(), true);
		s.assertTrue(welcomePageText.isDisplayed());

		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("selenium92@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Selenium@098");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();

		Thread.sleep(2000);

		String expectedHomePageTitle = "lorus";
		String expectedHomePageUrl = "tps://excel.elorus.com/";

		String actualHomePageTitle = driver.getTitle();
		String actualHomePageurl = driver.getCurrentUrl();

		// validates wheather the home page is loaded
		s.assertEquals(actualHomePageTitle, expectedHomePageTitle);
		s.assertEquals(actualHomePageurl, expectedHomePageUrl);

		driver.quit();
		s.assertAll();
	}
}
