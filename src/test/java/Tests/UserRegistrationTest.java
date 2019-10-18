package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {

	HomePage homepageobject;
	UserRegistrationPage registerpageobject;
	LoginPage loginpageobject;

	@Test(priority = 1)
	public void UserCanRegisterSucess() {

		homepageobject = new HomePage(driver);
		registerpageobject = new UserRegistrationPage(driver);
		homepageobject.ClickOnRegisterLink();
		registerpageobject.userRegisteration("omar", "alaa", "Alssffss@gmail.com", "123456dd666", "123456dd666");
		assertTrue(registerpageobject.messagesucess.getText().contains("Your registration completed"));

	}

	@Test(dependsOnMethods = "UserCanRegisterSucess")
	public void UserCanLogOut() {

		registerpageobject.LogOut();

	}

	@Test(dependsOnMethods = "UserCanLogOut")
	public void UserCanLogin() {

		loginpageobject = new LoginPage(driver);

		homepageobject.ClickOnLoginLink();
		loginpageobject.Login("Alssffss@gmail.com", "123456dd666");

	}

}
