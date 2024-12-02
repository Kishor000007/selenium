package actions_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover3 {

	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		/* launches the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* defines an implicit wait of 30 sec */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/* maximizes the window */
		driver.manage().window().maximize();
		/* fetches the web app and waits until it is loaded */
		driver.get("https://www.vtiger.com/");
		/*identifies all the elements*/
		List<WebElement> elements = driver.findElements
				(By.xpath("//a[@class='nav-link dropdown-toggle text-dark custom-nav-bar-heading-font-size']"));
	
		/*creates an Object of Actions class*/
		Actions a=new Actions(driver);
	
		/*mouseovers on all the elements*/
		for(WebElement lv:elements)
		{
			
			a.moveToElement(lv).perform();
			String text = lv.getText();
			
			System.out.println("-------------"+text+"--------------");
			if(text.contains("Features"))
			{  
				List<WebElement> sugg = driver.findElements(By.xpath("//a[@data-toggle='dropdown1']"));
			    for(WebElement x1:sugg)
			    {
			    	System.out.println(x1.getText());
			    }
			    System.out.println("-----------------------");
			}
			else if(text.contains("Solutions"))
			{  
				List<WebElement> sugg = driver.findElements(By.xpath("//a[contains(text(),'Solutions')]/../descendant::a[@class='list-link']"));
			    for(WebElement x1:sugg)
			    {
			    	System.out.println(x1.getText());
			    }
			    System.out.println("-----------------------");
			}
			else if(text.contains("Resources"))
			{  
				List<WebElement> sugg = driver.findElements(By.xpath("//a[contains(text(),'Resources')]/../descendant::a[@class='list-link']"));
			    for(WebElement x1:sugg)
			    {
			    	System.out.println(x1.getText());
			    }
			    System.out.println("-----------------------");
			}
			else if(text.contains("Company"))
			{  
				List<WebElement> sugg = driver.findElements(By.xpath("//a[contains(text(),'Company')]/../descendant::a[@class='list-link']"));
			    for(WebElement x1:sugg)
			    {
			    	System.out.println(x1.getText());
			    }
			    System.out.println("-----------------------");
			}
			Thread.sleep(2000);
		}
		driver.quit();
		 }
	
	}

