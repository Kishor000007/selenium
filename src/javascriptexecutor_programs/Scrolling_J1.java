package javascriptexecutor_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program to scroll using javascript
public class Scrolling_J1 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
//		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.actitime.com/");
		
		//maximizes the window// 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement link = driver.findElement(By.partialLinkText("Time Tracking"));
		
		//identifies the coordinate x
		int x = link.getLocation().getX();
		
		//identifies the coordinate y
		int y = link.getLocation().getY();
		
		System.out.println(x+","+y);
		
		System.out.println("--------------");
		
		//converts the object from webdriver to javascript
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		//scroll to time tracking
//    	j.executeScript("window.scrollBy(559,6693)");
		
		j.executeScript("window.scrollBy("+x+","+y+")");
	}
}
