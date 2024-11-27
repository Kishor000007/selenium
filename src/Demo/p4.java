package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p4 {

	  public static void main(String[] args) {
			
			 //sets the path for edgedriver.exe//
			System.setProperty("webdriver.edge.driver","D:\\Selenium\\Selenium\\drivers\\msedgedriver.exe");
					
			//It launches the edge browser//
		     WebDriver driver=new EdgeDriver();
					
		    //It fetches the web application and waits until it is loaded//
			driver.get("https://www.facebook.com");
			
			//maximizes the window//
			driver.manage().window().maximize();
			
			 //identifies the email and enters the data//
			 driver.findElement(By.name("email")).sendKeys("Dhoni");
			 
			 //identifies the password enters the data//
			 driver.findElement(By.id("pass")).sendKeys("12344567");
			 
			 //identifies the login and click//
			 driver.findElement(By.name("login")).click();
		}
}
