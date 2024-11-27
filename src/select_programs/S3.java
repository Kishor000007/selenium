 package select_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//program for getFirstSelectedOption() and getAllSelectedOption()
public class S3 {

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
		driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/select.html");
		
		WebElement listbox = driver.findElement(By.id("KB"));
		
		//creates an object of select class
		Select s=new Select(listbox);
		
		//select the option based on index value
		s.selectByIndex(0);
		
		//select option based on value
		s.selectByValue("K");
		
		//select the option based on text
		s.selectByVisibleText("Lolipop");
		
		Thread.sleep(3000);
		
		//retrives the first selected option
		WebElement fs = s.getFirstSelectedOption();
		System.out.println(fs.getText());
		System.out.println("-------------");
		
		//retrives all the selected option
		List<WebElement> as = s.getAllSelectedOptions();
		for(WebElement lv:as) {
			System.out.println(lv.getText());
		}
		
}
}
