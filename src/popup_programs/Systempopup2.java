package popup_programs;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Systempopup2 {

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
				driver.get("https://www.timesjobs.com/");
				
				driver.findElement(By.xpath("//a[text()='Register']")).click();
				
				driver.findElement(By.xpath("//span[@class='upload-file-btn']")).click();
				
				Thread.sleep(2000);
				
				Systempopup.fileUpload("D:\\Selenium\\Selenium\\upload\\myResume.docx");
	}
}
