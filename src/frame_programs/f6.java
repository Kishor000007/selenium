package frame_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/page2.html");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("Hello...");
		//defaultcontent: it goes main page or webpage
		driver.switchTo().defaultContent();
		driver.switchTo().frame("f2");
		driver.close();
		
	}
}
