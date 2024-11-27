package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.elorusAddContact_page2;
import POM_pages.elorusContact_page2;
import POM_pages.elorusHome_page2;
import POM_pages.elorusLogin_page2;

//script for adding contact
public class elorusContact_script2 {

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
		
		//creates an object of elorus login page2
	   elorusLogin_page2 ob1=new elorusLogin_page2(driver);
	   
	   //enters username
	   ob1.setUserName("selenium91@gmail.com");
	   
	   //enters password
	   ob1.setPassword("Selenium@098");
	   
	   //clicks on sign in
	   ob1.clickSignIn();
	   
	   //creates an object of elorus home page2
	   elorusHome_page2 ob2 =new elorusHome_page2(driver);
	   
	   //clicks on contact
	   ob2.clickContact();
	   
	   //crates an object of elorus contact page2
      elorusContact_page2 ob3 =new elorusContact_page2(driver);
      
      //clicks on add
      ob3.clickAdd();
      
      //creates an objec of elorusAdd contact page2
      elorusAddContact_page2 ob4=new elorusAddContact_page2(driver);
      
      //enters firstname
      ob4.firstName("Suresh");
      
      //enters lastname
      ob4.lastname("Raina");
      
      //enters company
      ob4.company("crichero");
      
      //enters profession
      ob4.profession("Cricketer");
      
      //clicks on save button
      ob4.clickSave();
      
	   
	   
}
}