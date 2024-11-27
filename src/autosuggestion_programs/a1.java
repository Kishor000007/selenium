package autosuggestion_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//program to click on selenium webdriver in the autosuggestion
public class a1 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Selenium\\drivers\\geckodriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new FirefoxDriver();
				
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(1000);
		
       List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		//clicks on selenium webdriver
		for(WebElement lv:autosuggestions) {
			String text = lv.getText();
			if(text.equals("selenium rich foods")) {
				lv.click();
			   break;
		}
	}
}
}
