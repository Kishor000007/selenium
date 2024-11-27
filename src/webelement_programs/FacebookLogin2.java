package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin2 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.facebook.com");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		 //identifies the email and enters the data//
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Kishor");
		 
		 //identifies the password enters the data//
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123456");
		 
		 //identifies the login and click//
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}
}
