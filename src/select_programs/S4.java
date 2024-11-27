package select_programs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//program for getOptions()
public class S4 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //defines the implicit wait of 10sec
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     //maximizes the window//
	     driver.manage().window().maximize();
	     
	    //It fetches the web application and waits until it is loaded//
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/select.html");
		
		WebElement listbox = driver.findElement(By.id("KB"));
		
		//creates an object of select class
		Select s=new Select(listbox);
		
		ArrayList<String> al=new ArrayList<String>();
		
		//retrives all the options
		List<WebElement> allopt = s.getOptions();
		for(WebElement lv:allopt) {
//			System.out.println(lv.getText());
			al.add(lv.getText());
		}
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}
}
