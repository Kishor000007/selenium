package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_pages.initialisePages;

//script for adding contact
public class elorusContact_script3 {

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

		initialisePages pages=new initialisePages(driver);
		
		pages.elorusLogin.setUserName("selenium91@gmail.com");
		
		pages.elorusLogin.setPassword("Selenium@098");
		
		pages.elorusLogin.clickSignIn();
		
		pages.elorusHome.clickContact();
		
		pages.elorusContact.clickAdd();
		
		pages.elorusAddContact.firstName("Suresh");
		
		pages.elorusAddContact.lastname("Raina");
		
		pages.elorusAddContact.company("crichero");
		
		pages.elorusAddContact.profession("Cricketer");
		
		pages.elorusAddContact.clickSave();
			   
}
}
