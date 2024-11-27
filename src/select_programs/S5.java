package select_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//program for dropdown
public class S5 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select s1=new Select(daydropdown);
		s1.selectByValue("13");
		
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select s2=new Select(monthdropdown);
		s2.selectByValue("5");
		
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select s3=new Select(yeardropdown);
		s3.selectByValue("2002");
	}
}
