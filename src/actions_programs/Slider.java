package actions_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/");
		WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		System.out.println("Loction of slider before moving");
		System.out.println(slider.getLocation());
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(slider, 150, 0).perform();
		System.out.println("Location of the slider after moving");
		System.out.println(slider.getLocation());
	}
}
