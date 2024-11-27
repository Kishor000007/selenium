package webdriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3 {

	public static void main(String[] args) {
		//sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.ajio.com");
		
		/*maximizes the browser window*/
		//driver.manage().window().maximize();
		
		/*fullscreen the browser window*/
		//driver.manage().window().fullscreen();
		
		/*minimizes the browser window*/
		driver.manage().window().minimize();
}
}
