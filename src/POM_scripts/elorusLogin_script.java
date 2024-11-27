package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_pages.elorusLogin_page1;

public class elorusLogin_script {

	public static void main(String[] args) {
		
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
	     
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://app.elorus.com/login/");
		
		//creates object of elorusLogin page1
		elorusLogin_page1 ob=new elorusLogin_page1(driver);
		
		//enters the username
		ob.tbUsername.sendKeys("selenium91@gmail.com");
		
		//enters the password
		ob.tbPassword.sendKeys("Selenium@098");
		
		//clicks on sign in
		ob.btnSignIN.click();
		
	}
}
