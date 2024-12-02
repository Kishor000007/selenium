 package actions_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//program to scroll
public class Scrolling {

	public static void main(String[] args) {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();
		
		/* defines an implicitly wait of 30 sec */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/* maximizes the window */
		driver.manage().window().maximize();
		
		/* fetches the web app and waits until it is loaded */
		driver.get("https://www.actitime.com");
		
		//identifies architect
		WebElement architects = driver.findElement(By.xpath("//a[text()=' Architects ']"));
		
		//creates an object of an action class
		Actions a= new Actions(driver);
		
		//scroll to specified element
		a.scrollToElement(architects).perform();
	}
}
