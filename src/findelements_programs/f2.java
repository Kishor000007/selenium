package findelements_programs;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program to print all the iphones in the search result of ammazon
public class f2 {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
//		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //maximizes the window//
	     driver.manage().window().maximize();
		
	     //It fetches the web application and waits until it is loaded//
	     driver.get("https://www.amazon.in");
	     
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
	     
	     driver.findElement(By.id("nav-search-submit-button")).submit();
	     
	     Thread.sleep(2000);
	     
	     //identifies the title of all the iphones
	    List<WebElement> titles = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	    
	    //prints the titles of all the phones
	    for(WebElement lv:titles) {
	    	String title = lv.getText();
	    	System.out.println(title);
	    }
	    List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/../../../..//span[@class='a-price-whole']"));
	    
	    for(WebElement lv:prices) {
	    	String price = lv.getText();
	    	System.out.println(price);
	    }
	    
	    System.out.println("---------------------------------------");
	    //iterates the both the list to print title and price
	       Iterator<WebElement> itr1 = titles.iterator();
	       Iterator<WebElement> itr2 = prices.iterator();
	       while(itr1.hasNext()&&itr2.hasNext()) {
	    	   String title = itr1.next().getText();
	    	   String price = itr2.next().getText();
	    	   
	    	   System.out.println(title+"  =  "+price);
	       }
	       System.out.println("---------------------------------------");
	       
	     //iterates the both the list to print title and price
	      ListIterator<WebElement> ltr1 = titles.listIterator();
	      ListIterator<WebElement> ltr2 = prices.listIterator();
	      while(ltr1.hasNext()&&ltr2.hasNext()) {
	    	  String title = ltr1.next().getText();
	    	  String price = ltr2.next().getText();
	    	  
	    	  System.out.println(title+"  =  "+price);
	      }
	      
	      System.out.println("---------------------------------------");
	      
	      //iterates the both the list to print title and price
	     for (int i = 0; i < titles.size(); i++) {
	              String title = titles.get(i).getText();
	             String price = prices.get(i).getText();
			System.out.println(title+"  =  "+price);
		}
	       //closes the browser  
		   driver.quit(); 
	}
}
