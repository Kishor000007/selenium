package practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class d4 {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void launch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	@Test(priority = 2)
	public void script() {
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/confirm.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		}
	
	@Test(priority = 1)
	public void script2() {
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/selenium7.html");
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("document.getElementById('i1').value='Selenium Java'");
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
