package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for submit
public class w7 {
	
public static void main(String[] args) {
	 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.facebook.com");
		
		//maximizes the window//
		driver.manage().window().maximize();
		 
		 //identifies the login and submit//
       // driver.findElement(By.name("login")).submit();
		
		//identifies the login and click
		 driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}
}

