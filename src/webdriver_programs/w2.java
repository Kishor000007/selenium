package webdriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for get(),getTitle(),getCurrentUrl()and getPageSource() methods//
public class w2 {

	public static void main(String[] args) {
		       //sets the path for chromrdriver.exe//
				System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
				//It launches the chrome browser//
				WebDriver driver=new ChromeDriver();
				
				//It fetches the web application and waits until it is loaded//
				driver.get("https://www.facebook.com");
				//writing https is mandatory if we dont write we get invalidargumentexception//
				
				//retrives the title of the webpage//
				String title = driver.getTitle();
				System.out.println(title);
				
				//retrives the url of the webpage//
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				//retrives the page source code of the web page//
				String ps=driver.getPageSource();
				System.out.println(ps);
	}
}
