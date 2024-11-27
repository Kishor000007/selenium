package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T15 {

	@Test
	public void elorusLoginScript(){
		 
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");	
		    WebDriver driver=new ChromeDriver(); 
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.manage().window().maximize();		    
		    driver.get("https://www.facebook.com/");
		    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		    WebElement radbtn = driver.findElement(By.xpath("(//*[@id=\"sex\"])[2]"));
		    radbtn.click();
		    //validates whether the radio btn is selected
		    Assert.assertTrue(radbtn.isSelected());
}
}
