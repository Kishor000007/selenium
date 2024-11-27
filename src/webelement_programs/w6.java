package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*program for getTagname(),getText()and getAttribute()*/
public class w6 {
	
		public static void main(String[] args)  {
			 //sets the path for chromrdriver.exe//
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
					
			//It launches the Chrome browser//
		     WebDriver driver=new ChromeDriver();
					
		    //It fetches the web application and waits until it is loaded//
			driver.get("file:///C:/Users/kisho/OneDrive/Attachments/Desktop/selenium1.html");
			
			//maximizes the window//
			driver.manage().window().maximize();
			
			//identifies the link
			WebElement link = driver.findElement(By.id("i1"));
			
			//retrives the tagname
			String tagname = link.getTagName();
			System.out.println(tagname);
			System.out.println("--------------");
			
			//retrives the text
			String text = link.getText();
			System.out.println(text);
			System.out.println("--------------");
			
			//retrives the attributes
			String attribute1 = link.getAttribute("class");
			String attribute2 = link.getAttribute("id");
			String attribute3 = link.getAttribute("href");
			String attribute4 = link.getAttribute("name");
			System.out.println(attribute1);
			System.out.println(attribute2);
			System.out.println(attribute3);
			System.out.println(attribute4);
	}
}
