package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*program for to handle multiple tabs*/
public class w9 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://app.elorus.com/login/");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		//identifies and clicks on Terms of use
		driver.findElement(By.linkText("Terms of use")).click();
		
		Thread.sleep(3000);
		
		multipleTabs(driver);
		
	}
	/*method to handle multiple tabs*/
	  public static void multipleTabs(WebDriver driver) {
		  
			String mainTab = driver.getWindowHandle();
			
			Set<String> allTabs = driver.getWindowHandles();
			
			 for(String lv:allTabs) {
				 driver.switchTo().window(lv);
				 if(lv.equals(mainTab)) {
				 driver.close();
			 }
				
	  }
	  }}
