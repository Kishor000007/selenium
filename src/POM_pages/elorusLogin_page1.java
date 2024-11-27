package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class for login page
public class elorusLogin_page1  {

	//identifies username
	@FindBy(id="id_email")
	public WebElement tbUsername;
	
	//identifies password
	@FindBy(name="password")
	public WebElement tbPassword;
	
	//identifies sign in
	@FindBy(xpath="//input[@value='SIGN IN']")
	public WebElement btnSignIN;
	
	//constructor
	public elorusLogin_page1(WebDriver driver) {
		//initialises webelements
		PageFactory.initElements(driver, this);
	}

}
