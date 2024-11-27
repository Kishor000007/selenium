package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//program  for DataProvider
public class T12 {

	@DataProvider(parallel = true)
	public Object[][] fbLoginData() {
		Object[][] data =new Object[4][3];
		data[0][0]="https://www.facebook.com";
		data[0][1]="Dhoni";
		data[0][2]="0007";
		
		data[1][0]="https://www.facebook.com";
		data[1][1]="Kohli";
		data[1][2]="0018";
		
		data[2][0]="https://www.facebook.com";
		data[2][1]="Rohit";
		data[2][2]="0045";
		
		data[3][0]="https://www.facebook.com";
		data[3][1]="Suresh";
		data[3][2]="0006";
		return data;
		
	}
	@Test(dataProvider = "fbLoginData")
	public void fbLoginScript(String url,String un,String pwd) {
		 
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");	
		    WebDriver driver=new ChromeDriver(); 
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.manage().window().maximize();		    
			driver.get(url);			 
		    driver.findElement(By.name("email")).sendKeys(un);		
			driver.findElement(By.id("pass")).sendKeys(pwd);			
			driver.findElement(By.name("login")).click();
			driver.quit();
	}
}
