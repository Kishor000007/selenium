 package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program to close only facebook window
public class w7 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		//identifies and clicks on follow all button//
		driver.findElement(By.id("followall")).click();
		
		//pauses for 3 sec//
		Thread.sleep(3000);
		
		//returns the references the all the windows//
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		for (String lv : allWindows) {
			//switches the control to the specified window//
			driver.switchTo().window(lv);
			
			String title = driver.getTitle();
			
			if (title.contains("Facebook")) {
				
			//closes the window//
			driver.close();
			}
			Thread.sleep(1000);
			
			}
	}
}
