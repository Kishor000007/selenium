package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eloruslogin {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://app.elorus.com/login/");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		 //identifies the email and enters the data//
		driver.findElement(By.name("email")).sendKeys("selenium89@gmail.com");
		
		 //identifies the password and enters the data//
		driver.findElement(By.name("password")).sendKeys("Selenium@098");
		
		 //identifies the xpath and enters the data//
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		
	     String expectedHomepageTitle = "Elorus";
	     String expectedHomepageUrl = "https://fghhj.elorus.com/";
	     
	     String actualHomepageTitle = driver.getTitle();
	     String actualHomepageUrl = driver.getCurrentUrl();
	     
	     if (expectedHomepageTitle.equals(actualHomepageTitle) && expectedHomepageUrl.equals(actualHomepageUrl)) {
			System.out.println("Pass:Login is Successfull");
		} else {
			System.out.println("Fail:Unable to login");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
