package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*program for css selector*/
public class w3 {

	public static void main(String[] args) {
		//sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		//It launches the Chrome browser//
		WebDriver driver=new ChromeDriver();

		//It fetches the web application and waits until it is loaded//
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/selenium3.html");

		//maximizes the window//
		driver.manage().window().maximize();

		//identifies the first textbox and enters the data//
		driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("Java");

		//identifies the second textbox and enters the data//
		driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("Selenium");

	}
}

