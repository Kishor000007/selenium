package actions_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://app.elorus.com/login/");
		
		//maximizes the window//
		driver.manage().window().maximize();
		
		WebElement resetpassword = driver.findElement(By.xpath("//a[text()='Reset password.']"));
		
		Actions a=new Actions(driver);
		
		//right clicks on reset password
		a.contextClick(resetpassword).perform();
		
		Robot r=new Robot();
		
	/*	//press W key
		r.keyPress(KeyEvent.VK_W);
		
		//Release W key
		r.keyRelease(KeyEvent.VK_W);  */
		
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
	}
}
