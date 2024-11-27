package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program for text box//
public class w2 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/selenium2.html");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		//identifies the web element with id =i1// 
		 WebElement textbox = driver.findElement(By.id("i1"));
		 
		 //Enters the data in textfield
		 textbox.sendKeys("Dhoni");
		 
		 //pauses for 3 sec
		 Thread.sleep(3000);
		 
		 //clears the from the textbox
		 textbox.clear();
		 

	}
}
