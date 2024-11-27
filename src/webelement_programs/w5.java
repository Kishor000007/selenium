package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

//program for getLocation()
public class w5 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.actitime.com/");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.partialLinkText("Time Tracking"));
		
		//identifies the coordinate x
		int x = link.getLocation().getX();
		
		//identifies the coordinate y
		int y = link.getLocation().getY();
		
		System.out.println(x+","+y);
		
		
		
	
	}
}
