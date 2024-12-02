
package actions_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//program for drag and drop
public class Drag_Drop {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
//		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://shorturl.at/Ruqxn");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions a=new Actions(driver);
		
		//drags block1 and release on block4
		a.dragAndDrop(block1, block4).perform();
	}
}
