package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.elorusAddContact_page1;
import POM_pages.elorusContact_page1;
import POM_pages.elorusHome_page1;
import POM_pages.elorusLogin_page1;

//script for adding contact
public class elorusContact_script {

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
		
	  elorusLogin_page1 ob1=new elorusLogin_page1(driver);
		
	  //enters the data
		ob1.tbUsername.sendKeys("selenium91@gmail.com");
		//enters the password
		ob1.tbPassword.sendKeys("Selenium@098");
		//clicks on sign in
		ob1.btnSignIN.click(); 
		
		//creates the object of elorusHome page1
		elorusHome_page1 ob2=new elorusHome_page1(driver);
		
		ob2.lnkContact.click();
		
		//creates the object of eloruscontact page1
		elorusContact_page1 ob3=new elorusContact_page1(driver);
		
		ob3.btnAdd.click();
		
		//creates the object of elorusAddContact page1
		elorusAddContact_page1 ob4=new elorusAddContact_page1(driver);
		
		//enters firstname
		ob4.tbFirstName.sendKeys("Mahendra singh");
		
		//enters lastname
		ob4.tbLastName.sendKeys("Dhoni");
		
		//enters company
		ob4.tbCompany.sendKeys("cric");
		
		//enters profession
		ob4.tbProfession.sendKeys("Cricketer");
		
		//clicks on save
		ob4.btnSave.click();
}
}