package screenshot_programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for capture a screenshot
public class s1 {

	public static void main(String[] args) throws IOException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	    //It fetches the web application and waits until it is loaded//
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//converts the object from webdriver to Takesscreenshot type
		TakesScreenshot t=(TakesScreenshot) driver;
		
		//captures the screenshot and returns it in the form of java file class object
		File src = t.getScreenshotAs(OutputType.FILE);
		
		//creates an object of java File class. The object points towards the physical file
		File dest = new File("./Screenshots/p1.png");
		
		//copies the content from src to dest
		FileUtils.copyFile(src, dest);
	}
}
