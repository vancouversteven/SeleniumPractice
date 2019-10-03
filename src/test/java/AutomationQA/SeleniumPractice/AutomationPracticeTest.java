package AutomationQA.SeleniumPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AutomationQA.SeleniumPractice.FactoryObject.*;
import AutomationQA.SeleniumPractice.FactoryObject.IndexPageObjects;
import AutomationQA.SeleniumPractice.FactoryObject.SignInPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.PageFactory;
import AutomationQA.SeleniumPractice.Utility.*;

public class AutomationPracticeTest {
	public static String baseURL = "http://automationpractice.com";
	public static WebDriver driver;
	
	
	public static String emailAddress = "sli6@hotmail.com";
	public static String passwordSth = "asdf1234";
  
  @BeforeClass
  public void setUp() {
	  //setup the chromedriver using WebDriverManager
      WebDriverManager.chromedriver().setup();

      //Create driver object for Chrome
      driver = new ChromeDriver();
	  
		
      driver.get(baseURL);
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
  }
  
  
  
  @Test
	public void VerifyIndexPage()
	{	
	    // initialize index page UI 
	  	PageFactory.initElements(driver, IndexPageObjects.class);
	  	// verify login hyper link is displaying
		Assert.assertEquals(IndexPageObjects.loginLink.isDisplayed(), true);
		// verify woman hyper link is displaying
		Assert.assertEquals(IndexPageObjects.WOMENLink.isDisplayed(), true);
		// verify dress hyper link is displaying
		Assert.assertEquals(IndexPageObjects.DRESSLink.isDisplayed(), true);
		// verify t-shirt hyper link is displaying
		Assert.assertEquals(IndexPageObjects.TSHIRTSLink.isDisplayed(), true);
		// verify shopping cart is showing 'empty'
		Assert.assertEquals(IndexPageObjects.cartDisplay.getText().contains("empty"), true);
		
		
	}
  
  @Test
	public void VerifyLogIn()
	{
	  	// initialie Index Page UI
		PageFactory.initElements(driver, IndexPageObjects.class);
		// Click Login hyper link
		IndexPageObjects.loginLink.click();
		// Verify sign in page is displaying. Initialize sign in page UI
		PageFactory.initElements(driver, SignInPageObjects.class);
		// Verify email address input field is displaying
		Assert.assertEquals(SignInPageObjects.EmailAddressInput.isDisplayed(), true);
		// Verify password input field is displaying
		Assert.assertEquals(SignInPageObjects.PassWordInput.isDisplayed(), true);
		// verify sign in button is displaying
		Assert.assertEquals(SignInPageObjects.SignInBttn.isDisplayed(), true);

		
		// call sigin in utility method, pass credential to it.
		SeleniumPracticeUtility.SignIn(SignInPageObjects.EmailAddressInput, 
				SignInPageObjects.PassWordInput,
				SignInPageObjects.SignInBttn,
				emailAddress, passwordSth);
		
		
		// after sign in, my account page will be initialized
		PageFactory.initElements(driver, MyAccountPageObjects.class);
		// Verify customer account name display after sign in.
		Assert.assertEquals(MyAccountPageObjects.customAccount.getText().contains("Steven Li"), true);
		// Verify sign out button display after sign in
		Assert.assertEquals(MyAccountPageObjects.SignOutBttn.isDisplayed(), true);
		// Verify my account links after sign in
		Assert.assertEquals(MyAccountPageObjects.OrderHistoryAndDetails.isDisplayed(), true);
		// Verify my wish list is displaying
		Assert.assertEquals(MyAccountPageObjects.MyWishlists.isDisplayed(), true);
		// Verify my credit slips element is displaying
		Assert.assertEquals(MyAccountPageObjects.MyCreditSlips.isDisplayed(), true);
		// Verify my address element is displaying
		Assert.assertEquals(MyAccountPageObjects.MyAddresses.isDisplayed(), true);
		// Verify my personal information is displaying
		Assert.assertEquals(MyAccountPageObjects.MyPersonalInformaiton.isDisplayed(), true);
		
		
		
	}
  
  @Test
	public void Verify_BuyWomenTShit()
	{
	  	// Initialize index page UI elements
		PageFactory.initElements(driver, IndexPageObjects.class);
		// Click login hyper link
		IndexPageObjects.loginLink.click();
		// wait for the sign in page initialize
		PageFactory.initElements(driver, SignInPageObjects.class);
		// wait for email address input is visible
		SignInPageObjects.waitEmailVisible();
		
		
		// Call sign in utility method
		SeleniumPracticeUtility.SignIn(SignInPageObjects.EmailAddressInput, 
				SignInPageObjects.PassWordInput,
				SignInPageObjects.SignInBttn,
				emailAddress, passwordSth);
		

		// initialize my account page 
		PageFactory.initElements(driver, MyAccountPageObjects.class);
		// wait for the woman link  is visible
		MyAccountPageObjects.waitWomanLinkVisible();
		// Verify women link is visible
		Assert.assertEquals(MyAccountPageObjects.WOMENLink.isDisplayed(), true);
		// Initialize a action
		Actions builder = new Actions(driver);
		// click on women link 
		builder.moveToElement(MyAccountPageObjects.WOMENLink).build().perform();
		// wait for woman t-shirt link is visible
		MyAccountPageObjects.waitWomanTShirtLinkVisible();
		// verify woman t-shirt link is visible
		Assert.assertEquals(MyAccountPageObjects.WomenTShitLink.isDisplayed(), true);
		// click on the women t-shirt link
		MyAccountPageObjects.WomenTShitLink.click();
		
		// initialize woen t-shirt elements
		PageFactory.initElements(driver, WomenTShirtPageObjects.class);
		// wait until product count element visible
		WomenTShirtPageObjects.waitProductCountVisible();
		// verify product count is displaying
		Assert.assertEquals(WomenTShirtPageObjects.PrductCount.isDisplayed(), true);
		// click on FadedShortsSleeveTshirt element
		builder.moveToElement(WomenTShirtPageObjects.FadedShortSleeveTShirts).build().perform();
		
		// wait add to cart hyper link is visible
		WomenTShirtPageObjects.waitAddToCartLinkVisible();
		// verify add to cart link is displaying
		Assert.assertEquals(WomenTShirtPageObjects.AddToCartLink.isDisplayed(), true);
		// click on add to cart link 
		WomenTShirtPageObjects.AddToCartLink.click();
		
		
		// wait proceed to checkout button visible
		WomenTShirtPageObjects.waitProceedToCheckOutBttnVisible();
		// verify women t-shirt page proceedToCheckOut button is displaying
		Assert.assertEquals(WomenTShirtPageObjects.ProceedToCheckOutBttn.isDisplayed(), true);
		// click on Proceed To CheckOut button
		WomenTShirtPageObjects.ProceedToCheckOutBttn.click();
		
		
		
		PageFactory.initElements(driver, ShoppingCartPageObjects.class);
		Assert.assertEquals(ShoppingCartPageObjects.SummaryProductsQuantity.getText().contains("1 Product"), true);
		Assert.assertEquals(ShoppingCartPageObjects.ProductDescription_FradedShortSleeveTshirts.getText().contains("Faded Short Sleeve T-shirts"), true);
		Assert.assertEquals(ShoppingCartPageObjects.FradeShortsSleeveTshirts_unitprice.getText().contains("$16.51"), true);
		Assert.assertEquals(ShoppingCartPageObjects.FradeShortsSleeveTshirts_Qty.getText().contains(""), true);
		Assert.assertEquals(ShoppingCartPageObjects.TotalPrice.getText().contains("$18.51"), true);
		Assert.assertEquals(ShoppingCartPageObjects.ProceedToCheckoutBttn.isDisplayed(),true);
		
		ShoppingCartPageObjects.ProceedToCheckoutBttn.click();
		
		
		ShoppingCartPageObjects.ProceedToCheckoutBttnInAddress.click();
		
		
		ShoppingCartPageObjects.TermOfServiceCheckBox.click();
		ShoppingCartPageObjects.ProceedToCheckoutBttnInShipping.click();
		
		
		Assert.assertEquals(ShoppingCartPageObjects.PayByBankWireLink.isDisplayed(), true);
		Assert.assertEquals(ShoppingCartPageObjects.PayByCheckLink.isDisplayed(), true);
		ShoppingCartPageObjects.PayByBankWireLink.click();
		
		
		ShoppingCartPageObjects.IConfirmMyOrder.click();
		
		
		Assert.assertEquals(ShoppingCartPageObjects.YourOrderOnMyStoreIsCompleteString.getText().contains("Your order on My Store is complete."), true);
	}
  

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
