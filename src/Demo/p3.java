package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p3 {
   public static void main(String[] args) {
	
	 //sets the path for geckodriver.exe//
	System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Selenium\\drivers\\geckodriver.exe");
			
	//It launches the firefox browser//
     WebDriver driver=new FirefoxDriver();
			
    //It fetches the web application and waits until it is loaded//
	driver.get("https://www.facebook.com");
	
	//maximizes the window//
	driver.manage().window().maximize();
	
	 //identifies the email and enters the data//
	 driver.findElement(By.name("email")).sendKeys("Dhoni");
	 
	 //identifies the password enters the data//
	 driver.findElement(By.id("pass")).sendKeys("12344567");
	 
	 //identifies the login and click//
	 driver.findElement(By.name("login")).click();
}
}