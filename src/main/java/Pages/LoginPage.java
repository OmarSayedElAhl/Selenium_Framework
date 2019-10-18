package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id ="Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement pass;
	
	@FindBy(css = "input.button-1.login-button")
	WebElement button;
		
	

	
	public void Login(String emailvalue,String passvalue) {
	
		SendKeys(email, emailvalue);
		SendKeys(pass, passvalue);
		ClickButton(button); 
		
		
	}
	
	
	
	
	
	

}
