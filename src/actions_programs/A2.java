package actions_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A2 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
					
			//It launches the Chrome browser//
		     WebDriver driver=new ChromeDriver();
		     
		     //defines the implicit wait of 10sec
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
		     //maximizes the window//
		     driver.manage().window().maximize();
		     
		    //It fetches the web application and waits until it is loaded//
			driver.get("https://www.vtiger.com/");
			
		 List<WebElement> elements = driver.findElements(By.xpath("//a[@class='nav-link dropdown-toggle text-dark custom-nav-bar-heading-font-size']"));
			
			//creates an object of action class
			Actions a=new Actions(driver);
			
			for(WebElement lv:elements) {
				a.moveToElement(lv).perform();
				Thread.sleep(2000);
			}
	}
}
