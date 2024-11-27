package apache_programs;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a7 {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream f=new FileInputStream("./Data/ElorusData.properties");
		Properties p=new Properties();
		p.load(f);
		
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
	     
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	    //It fetches the web application and waits until it is loaded//
		driver.get(p.getProperty("url"));
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		 //identifies the email and enters the data//
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(p.getProperty("username"));
		
		 //identifies the password and enters the data//
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p.getProperty("password"));
		
		 //identifies the xpath and enters the data//
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	}
}
