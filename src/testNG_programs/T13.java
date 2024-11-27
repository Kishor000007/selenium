 package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_pages.initialisePages;

public class T13 {

	@Test(dataProviderClass = SampleDataProviders.class,dataProvider="elorusAddContactData")
	public void elorusAddContactScript(String url,String un,String pwd,String fn,String ln,String comp,String prof) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
	     
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get(url);

		initialisePages pages=new initialisePages(driver);
		
		pages.elorusLogin.setUserName(un);
		
		pages.elorusLogin.setPassword(pwd);
		
		pages.elorusLogin.clickSignIn();
		
		pages.elorusHome.clickContact();
		
		pages.elorusContact.clickAdd();
		
		pages.elorusAddContact.firstName(fn);
		
		pages.elorusAddContact.lastname(ln);
		
		pages.elorusAddContact.company(comp);
		
		pages.elorusAddContact.profession(prof);
		
		pages.elorusAddContact.clickSave();
	}
}
