package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;

	public PageBase(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	protected static void ClickButton(WebElement element) {
		element.click();

	}

	protected static void SendKeys(WebElement element, String value)

	{
		element.sendKeys(value);

	}
}
