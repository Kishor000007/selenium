package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program to close all the child windows//
public class w8 {

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
		
         multipleWindows(driver);
         
         System.out.println(driver.getTitle());
		
	}
	/*method to close all the child windows*/
	public static void multipleWindows(WebDriver driver) throws InterruptedException {
		//returns reference of the main window//
		String mainWindow = driver.getWindowHandle();
		//returns reference of the all the windows//
		Set<String> allWindows = driver.getWindowHandles();
		
		/*closes all the child windows*/
		for(String lv:allWindows) {
			driver.switchTo().window(lv);
			if (!lv.equals(mainWindow)) {
				driver.close();
			}
			Thread.sleep(1000);
		}
		/*switches the control to the main window*/ 
		driver.switchTo().window(mainWindow);
	}
	}
