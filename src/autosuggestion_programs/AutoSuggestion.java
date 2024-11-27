package autosuggestion_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program to print all the autosuggestions
public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(1000);
		//identifies the autosuggestions
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		//prints the autosuggestions
		for(WebElement lv:autosuggestions) {
			String text = lv.getText();
			System.out.println(text);
		}
		
	}
}
