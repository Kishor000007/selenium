package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	
	public static void main(String[] args) throws InterruptedException {
		//sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		                                             //instead of writing full path we can write "./drivers/chromedriver.exe"
		
		ChromeDriver driver = new ChromeDriver();
		ChromeDriver driver1 = new ChromeDriver();
		ChromeDriver driver2 = new ChromeDriver();
		
		driver.close();
		Thread.sleep(1000);
		driver1.close();
		Thread.sleep(1000);
		driver2.close();
	}

}
