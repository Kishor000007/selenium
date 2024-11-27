package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class for home page
public class elorusHome_page1 {

	    //identifies invoices
	    @FindBy(xpath="//a[@title='Invoices']")
		public WebElement lnkInvoices;
	    
	    //identifies expenses
	    @FindBy(xpath="//a[@title='Expenses']")
		public WebElement lnkExpenses;
		
		 //identifies username
	    @FindBy(xpath="//a[@title='Projects']")
		public WebElement lnkProjects;
		
		 //identifies time
	    @FindBy(xpath="//a[@title='Time']")
		public WebElement lnkTime;
		
		 //identifies contact
	    @FindBy(xpath="//a[@title='Contacts']")
		public WebElement lnkContact;
		
		 //identifies estimates
	    @FindBy(xpath="//a[@title='Estimates']")
		public WebElement lnkEstimates;
		
		 //identifies usermenu
	    @FindBy(xpath="//a[@title='User menu']")
		public WebElement btnUserMenu;
		
		 //identifies logout
	    @FindBy(xpath="//a[text()='Logout']")
		public WebElement btnLogout;
	    
	    //constructor
	    public elorusHome_page1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
}
