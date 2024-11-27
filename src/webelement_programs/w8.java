package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program for getCssValue() and isDisplayed() 
public class w8 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://app.elorus.com/login/");
		
		//identifies the welcome text
		WebElement welcometext = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		
		String css1 = welcometext.getCssValue("font-size");
		String css2 = welcometext.getCssValue("font-family");
		System.out.println(css1);
		System.out.println(css2);
		
		System.out.println("--------------");
		
		//checks wheather the welcome text is displayed
		System.out.println(welcometext.isDisplayed());
		
		//validates wheather the login page is loaded
		if(welcometext.isDisplayed()) {
			System.out.println("Login page is loaded");
		}
		else {
			System.out.println("Unable to load the login page");
		}
		
	}
}
