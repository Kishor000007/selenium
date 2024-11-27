package apache_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5 {
	
 public static void main(String[] args) {
	 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
	     
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("(getData(./Data/ElorusData.xlsx, ElorusLogin, 1, 0)");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		 //identifies the email and enters the data//
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("selenium92@gmail.com");
		
		 //identifies the password and enters the data//
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@098");
		
		 //identifies the xpath and enters the data//
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
}
}
