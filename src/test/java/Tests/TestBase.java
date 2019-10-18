package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	@Parameters({"browser"})
	public void stratdriver(  String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			

			String DriverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", DriverPath);
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("firfox")) {
			String DriverPath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", DriverPath);
			driver = new FirefoxDriver();
			
		} else {
			String DriverPath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", DriverPath);
			driver = new FirefoxDriver();
		}

		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void dropDriver() {
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
