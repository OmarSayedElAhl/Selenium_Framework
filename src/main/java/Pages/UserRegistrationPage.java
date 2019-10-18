package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "gender-male")
	WebElement gendermale;

	@FindBy(id = "gender-female")
	WebElement genderfemale;

	@FindBy(id = "FirstName")
	WebElement firstnametxt;

	@FindBy(id = "LastName")
	WebElement lastnametxt;


	@FindBy(id = "Email")
	WebElement emailtxt;

	@FindBy(id = "Password")
	WebElement passtxt;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmpasstxt;

	@FindBy(id = "register-button")
	WebElement registerbutton;
	
	@FindBy(css = "div.result")
	public WebElement messagesucess;

	@FindBy(linkText = "Log out")
	public WebElement logoutlink;
	
	public void userRegisteration(String firstname, String lastname, String email, String pass, String confirmpass) {
		
	ClickButton(gendermale);
	SendKeys(firstnametxt, firstname);
	SendKeys(lastnametxt, lastname);
	SendKeys(emailtxt, email);
	SendKeys(passtxt, pass);
	SendKeys(confirmpasstxt, confirmpass);
	ClickButton(registerbutton);
	
		 

	}
	public void LogOut() {
		ClickButton(logoutlink);
		
	}
	
	

}
