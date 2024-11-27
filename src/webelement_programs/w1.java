package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w1 {

	/*program for findelement()*/
	public static void main(String[] args) {
		
		       //sets the path for chromrdriver.exe//
				System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
						
				//It launches the Chrome browser//
			     WebDriver driver=new ChromeDriver();
						
			    //It fetches the web application and waits until it is loaded//
				driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/selenium1.html");
				
				//maximizes the window//
				driver.manage().window().maximize();
				
				//identifies the web element with id =i1// 
				//WebElement link = driver.findElement(By.id("i1"));
				
				//identifies the web element using class=c1//
				//WebElement link = driver.findElement(By.className("c1"));
				
				//identifies the web element using  name=n1//
				//WebElement link = driver.findElement(By.name("n1"));
				
				//identifies the web element using tag name=a//
				//WebElement link = driver.findElement(By.tagName("a"));
				
				//identifies the web element using text=Faceboook//
				//WebElement link = driver.findElement(By.linkText("Facebooook"));
				
				//identifies the web element using partial text=Face//
				WebElement link = driver.findElement(By.partialLinkText("Face"));
				
				//clicks on the web element// 
				link.click();
				
	}
}
