package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class for contact page
public class elorusContact_page1 {

	 //identifies add
    @FindBy(xpath="//span[text()='Add']/parent::a")
	public WebElement btnAdd;
    
	 //identifies add
    @FindBy(xpath="//span[text()='Bulk import']/parent::a")
	public WebElement btnBlkImport;
    
    //constructor
    public elorusContact_page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
