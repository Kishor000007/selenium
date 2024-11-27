package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program for isEnabled() and isSelected()
public class w9 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.facebook.com");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000); 
		//identifies the textbox 
		WebElement textBox = driver.findElement(By.name("reg_email__"));
		
		//check wheather textbox is enabled
		System.out.println(textBox.isEnabled());
		
		//identifies the male radio button
		WebElement radioButton = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		
		//check wheather the radio button is selected
		System.out.println(radioButton.isSelected());
		
		//selects the male radio button
		radioButton.click();
		System.out.println(radioButton.isSelected());
		
	}
}
