package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for frame
public class f5 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/page2.html");
		
		//maximizes the window//
		driver.manage().window().maximize();
		 
		//identifies the textbox t2 and enters the data
		 driver.findElement(By.id("t2")).sendKeys("Java");
		
		//switches the control to the specified frame
       driver.switchTo().frame(0);
		
		//identifies the textbox t1 and enters the data
		 driver.findElement(By.id("t1")).sendKeys("Selenium");
		 
		 //pauses for 4 sec
		 Thread.sleep(4000);
		 
		//identifies the textbox t1 and clears the data
		 driver.findElement(By.id("t1")).clear();
		 
		//switches the control to the main frame
		 driver.switchTo().defaultContent();
		 
		//identifies the textbox t2 and clears the data
		 driver.findElement(By.id("t2")).clear();
}
}
