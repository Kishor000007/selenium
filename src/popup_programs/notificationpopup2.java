package popup_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationpopup2 {

public static void main(String[] args) {
		
		//creates an object ogf cheomeoptions
		ChromeOptions options=new ChromeOptions();
		
		//disable notifications
		options.addArguments("--disable-notifications");
		
		//disable geolocation
		options.addArguments("--disable-geolocation");
		
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.icicibank.com/");
	}
}
