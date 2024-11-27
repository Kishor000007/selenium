package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class for add contact page
public class elorusAddContact_page1 {

	 //identifies firstname
    @FindBy(name="first_name")
	public WebElement tbFirstName;
    
    //identifies lastname
    @FindBy(name="last_name")
	public WebElement tbLastName;
    
    //identifies company
    @FindBy(name="company")
	public WebElement tbCompany;
    
    //identifies profession
    @FindBy(name="profession")
	public WebElement tbProfession;
    
    //identifies profession
    @FindBy(xpath="//span[text()='Save']/parent::a")
	public WebElement btnSave;
    
    public elorusAddContact_page1(WebDriver driver) {
		//initialises webelements
		PageFactory.initElements(driver, this);
	}
}
