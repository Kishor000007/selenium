package webdriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for get() and close() methods//
public class w1 {

	public static void main(String[] args) {
		
		//It launches the chrome browser//
		WebDriver driver=new ChromeDriver();
		
		//It fetches the web application and waits until it is loaded//
		driver.get("https://www.youtube.com");
		//writing https is mandatory if we dont write we get invalidargumentexception//
		
		//closes the browser window//
		driver.close();
	}
}
