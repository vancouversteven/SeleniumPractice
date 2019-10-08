package AutomationQA.SeleniumPractice.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public final class SeleniumPracticeUtility {
	
	public static void SignIn(WebElement EmailAddressInput, WebElement PasswordInput, WebElement SignInBttn, String emailAddress, String passwordSth)
	{
		EmailAddressInput.clear();
		EmailAddressInput.sendKeys(emailAddress);
		PasswordInput.clear();
		PasswordInput.sendKeys(passwordSth);
		SignInBttn.click();
		
		
		
	}

}
