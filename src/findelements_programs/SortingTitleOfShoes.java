package findelements_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program to print all the woodland shoes titles in the search result of flipkart in the sorting order
public class SortingTitleOfShoes {

	public static void main(String[] args) throws InterruptedException {
		 //sets the path for chromrdriver.exe//
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
				
		//It launches the Chrome browser//
	     WebDriver driver=new ChromeDriver();
				
	     //maximizes the window//
	     driver.manage().window().maximize();
		
	     //It fetches the web application and waits until it is loaded//
	     driver.get("https://www.flipkart.com/");
	     
	     //identifies the search box and enters the data
	     driver.findElement(By.name("q")).sendKeys("woodland shoes");
	     
	     //identifies the search button and enters the data
	     driver.findElement(By.className("_2iLD__")).click();
	     
	     Thread.sleep(2000);
	     
	     //identifies the title of the school
	    List<WebElement> titles = driver.findElements(By.xpath("//a[@class='WKTcLC' or @class='WKTcLC BwBZTg']"));
	    
	    //identifies the prices of the shooes
	   List<WebElement> prices = driver.findElements(By.xpath("//a[@class='WKTcLC' or @class='WKTcLC BwBZTg']/..//div[@class='Nx9bqj']"));
	   
	   //iterates the both the list to print title and price
       Iterator<WebElement> itr1 = titles.iterator();
       Iterator<WebElement> itr2 = prices.iterator();
       
       ArrayList<String[]> al = new ArrayList<String[]>();
       while(itr1.hasNext()&&itr2.hasNext()) {
    	   String title = itr1.next().getText();
    	   String price = itr2.next().getText();
    	   String[] temp= {title,price};
    	   al.add(temp);
       }
       Collections.sort(al,new shoetitlecomparator());
       
       for(String[] lv:al) {
    	   System.out.println(lv[0]+" = "+lv[1]);
}
       driver.quit();
	}
}
