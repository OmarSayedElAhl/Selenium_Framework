package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Register")
	WebElement registerlink;
	
	@FindBy(linkText="Log in")
	WebElement Loginlink;
	
	public void ClickOnRegisterLink() {
ClickButton(registerlink);		
	}
 
	public void ClickOnLoginLink() {
ClickButton(Loginlink);		
	}



}
