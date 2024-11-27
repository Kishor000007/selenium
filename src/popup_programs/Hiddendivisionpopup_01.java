package popup_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivisionpopup_01 {

	public static void main(String[] args)  {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.online.citibank.co.in/");
		
		//identifies and clicks on close button1
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		
		//identifies and clicks on close button2
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		
		//identifies and clicks on close button3
//		driver.findElement(By.xpath("//a[@class='newclose3']")).click();
	}
}
