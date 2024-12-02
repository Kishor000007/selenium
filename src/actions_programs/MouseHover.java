package actions_programs;

import java.awt.AWTException;
//import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//program for mouseover operation
public class MouseHover {

	public static void main(String[] args) throws AWTException {
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
		
		WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		
	   /*	int x = resources.getLocation().getX();
		int y = resources.getLocation().getY();
		
		Robot r=new Robot();
		r.mouseMove(x, y);  */ 
		
		//creates an object of action class
		Actions a=new Actions(driver);
		//performs mouseover operation
		a.moveToElement(resources).perform();		
	}
}
