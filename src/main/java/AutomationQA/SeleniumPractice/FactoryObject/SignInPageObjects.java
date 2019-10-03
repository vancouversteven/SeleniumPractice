package AutomationQA.SeleniumPractice.FactoryObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public final class SignInPageObjects {
	private WebDriver driver;
	private static WebDriverWait wait;

	public SignInPageObjects(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		
	}
	
	static public void waitEmailVisible()
	{
		wait.until(ExpectedConditions.visibilityOf(EmailAddressInput));
	}
	
	@FindBy(how = How.CSS, using="#email" )
	public static WebElement EmailAddressInput;
	
	@FindBy(how = How.CSS, using="#passwd" )
	public static WebElement PassWordInput;
	
	@FindBy(how = How.CSS, using="#SubmitLogin")
	public static WebElement SignInBttn;
	
	
}
