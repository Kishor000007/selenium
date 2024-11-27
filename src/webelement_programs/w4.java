package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program for size()
public class w4 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
					
			//It launches the Chrome browser//
		     WebDriver driver=new ChromeDriver();
					
		    //It fetches the web application and waits until it is loaded//
			driver.get("https://app.elorus.com/login/");
			
			//maximizes the window//
			driver.manage().window().maximize();
			
	        WebElement username = driver.findElement(By.id("id_email"));
	        
	       WebElement password = driver.findElement(By.id("id_password"));
	       
	     //retrives height and width of username
	     int h1 = username.getSize().getHeight();    
	     int w1 = username.getSize().getWidth();

	     //retrives height and width of password
	     int h2 = password.getSize().getHeight();
	     int w2 = password.getSize().getWidth();
	     
	     //validates wheather username and password of same dimensions
	     if (h1==h2&&w1==w2) {
			System.out.println("Elements are of the same dimension");
		} else {
			System.out.println("Elements are not of the same dimension");
		}
	}
}
