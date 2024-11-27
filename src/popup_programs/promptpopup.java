package popup_programs;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//program for javascript popup(prompt pop up)
public class promptpopup {
	
	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/prompt.html");
		
		//identifies and clicks on try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//creates an object of webdriver wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//waits until the javascript popup is loaded
		wait.until(ExpectedConditions.alertIsPresent());
		
		//switches the control from webpage to javascript popup
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		
		//enters a data into the popup
		a.sendKeys("Kishor");
		String text = a.getText();
		System.out.println(text);
		
		//clicks on ok button
		a.accept();
	}
}
