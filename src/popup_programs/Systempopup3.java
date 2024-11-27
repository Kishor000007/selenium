package popup_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for file popup or systempopup(using autoit)
public class Systempopup3 {

	public static void main(String[] args) throws Throwable {
	
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
		
		driver.findElement(By.id("register_Layer")).click();
		
		driver.findElement(By.xpath("//div[@data-val='exp']")).click();
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:/Selenium/Selenium/upload/fileuploadpopup.exe");
}
}
