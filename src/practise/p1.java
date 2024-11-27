package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class p1 {

	public static void main(String[] args) {
		ChromeOptions optns=new ChromeOptions();
		optns.addArguments("--incognito","--start-maximized");
		
		WebDriver driver=new ChromeDriver(optns);
		driver.get("https://www.ajio.com");
	}
}
