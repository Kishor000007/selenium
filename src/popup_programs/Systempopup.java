package popup_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for file popup or systempopup
public class Systempopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.naukri.com");
		
		//identifies register button and clicks on it
		driver.findElement(By.id("register_Layer")).click();
		
		//identifies experience and clicks on it
		driver.findElement(By.xpath("//div[@data-val='exp']")).click();
		
		//identifies upload resume button and clicks on it
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(2000);
		
		fileUpload("D:\\Selenium\\Selenium\\upload\\myResume.docx");
		
}
	
	//method to upload the file
	public static void fileUpload(String location) throws AWTException {
		//writes the location into clipboard
		StringSelection s=new StringSelection(location);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//pastes the location into popup
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//press enter button
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
