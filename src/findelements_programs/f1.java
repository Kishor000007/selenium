package findelements_programs;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class f1 {

	public static void main(String[] args) {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //maximizes the window//
	     driver.manage().window().maximize();
		
	     //It fetches the web application and waits until it is loaded//
	     driver.get("https://www.facebook.com");
		
	     //identifies the all links//
	    List<WebElement> links = driver.findElements(By.xpath("//a"));
	    System.out.println(links.getClass().getName());
	    System.out.println(links.size());
	    System.out.println("----------------");
	    
	    for(WebElement lv:links) {
	    	System.out.println(lv.getText());
	    }
	    System.out.println("----------------");
	    
	   Iterator<WebElement> itr = links.iterator();
	   while(itr.hasNext()) {
		   String s = itr.next().getText();
		   System.out.println(s); 
	   }
	   System.out.println("----------------");
	   
		  ListIterator<WebElement> ltr = links.listIterator();
		  while(ltr.hasNext()) {
			  String s1 = ltr.next().getText();
			  System.out.println(s1);
		
	   }
	}
}
