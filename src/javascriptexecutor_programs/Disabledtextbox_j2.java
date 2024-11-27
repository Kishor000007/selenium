package javascriptexecutor_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabledtextbox_j2 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
//		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/selenium7.html");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		//converts the object from webdriver to javascriptexecutor
		JavascriptExecutor j = (JavascriptExecutor) driver;
	
		//enters the data into disabled textbox
		j.executeScript("document.getElementById('i1').value='Selenium'");
		
	}
}
