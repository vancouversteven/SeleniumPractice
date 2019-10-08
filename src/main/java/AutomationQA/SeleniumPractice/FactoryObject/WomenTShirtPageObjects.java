package AutomationQA.SeleniumPractice.FactoryObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenTShirtPageObjects {
	
	private WebDriver driver;
	private static WebDriverWait wait;
	

	public WomenTShirtPageObjects(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		
	}
	
	static public void waitAddToCartLinkVisible()
	{
		wait.until(ExpectedConditions.visibilityOf(AddToCartLink));
	}
	
	static public void waitProductCountVisible()
	{
		wait.until(ExpectedConditions.visibilityOf(PrductCount));
	}
	
	static public void waitProceedToCheckOutBttnVisible()
	{
		wait.until(ExpectedConditions.visibilityOf(ProceedToCheckOutBttn));
	}
	
	@FindBy(how = How.CSS, using="#center_column > div.content_sortPagiBar.clearfix > div.top-pagination-content.clearfix > div.product-count")
	public static WebElement PrductCount;
	
	@FindBy(how = How.CSS, using="#center_column > ul > li > div > div.right-block > h5 > a")
	public static WebElement FadedShortSleeveTShirts;

	@FindBy(how = How.CSS, using="#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	public static WebElement AddToCartLink;
	
	@FindBy(how = How.CSS, using="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	public static WebElement ProceedToCheckOutBttn;

}
