//program to avoid overwriting captured screenshots
package practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class d2 {

	WebDriver driver;
//	we are using this to avoid screenshot overwriting
	static int screenshotCounter=1;
	
	@BeforeMethod
	public void launch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 1)
	public void execute() {
		driver.get("https://www.ajio.com");
		String title = driver.getTitle();
		
		TakesScreenshot screenShot=(TakesScreenshot) driver;
		File src1 = screenShot.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./Screenshots/"+title+"_"+ screenshotCounter++ +".png");
		try {
	    FileUtils.copyFile(src1, dest1);
	   }catch(Exception e) {
		
	}
	}
		@Test(priority = 2)
		public void screenShot2() {
			driver.get("https://www.ajio.com");
			String title = driver.getTitle();
			
		TakesScreenshot screenShot=(TakesScreenshot) driver;
	    driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("shooes");
	    driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).submit();
	    File src2 = screenShot.getScreenshotAs(OutputType.FILE);
	    File dest2=new File("./Screenshots/"+title+"_"+ screenshotCounter++ +".png");
	    try {
			FileUtils.copyFile(src2, dest2);
		} catch (IOException e) {
			
		}
		}

	@AfterMethod
	public void close() {
		driver.close();
	}
}