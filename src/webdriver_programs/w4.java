package webdriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for navigate(),forward(),back() and refresh() methods// 
public class w4 {

	public static void main(String[] args) {
		//sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.ajio.com");
		
		/*navigate to specified url*/
		driver.navigate().to("https://www.myntra.com");
		
		/*navigates back*/
		driver.navigate().back();
		
		/*navigates forward*/
		driver.navigate().forward();
		
		/*refreshes the web page*/
		driver.navigate().refresh();
}
}
