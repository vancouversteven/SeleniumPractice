package AutomationQA.SeleniumPractice.FactoryObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPageObjects {
	
	private WebDriver driver;
	private static WebDriverWait wait;

	public MyAccountPageObjects(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		
	}
	
	static public void waitWomanLinkVisible()
	{
		wait.until(ExpectedConditions.visibilityOf(WOMENLink));
	}
	
	static public void waitWomanTShirtLinkVisible()
	{
		wait.until(ExpectedConditions.visibilityOf(WomenTShitLink));
	}
	
	@FindBy(how = How.CSS, using="#header > div.nav > div > div > nav > div:nth-child(1) > a > span" )
	public static WebElement customAccount;
	
	@FindBy(how = How.CSS, using = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
	public static WebElement SignOutBttn;
	
	@FindBy(how = How.CSS, using = "#center_column > div > div:nth-child(1) > ul > li:nth-child(1) > a > span")
	public static WebElement OrderHistoryAndDetails;
	
	@FindBy(how = How.CSS, using = "#center_column > div > div:nth-child(2) > ul > li > a > span")
	public static WebElement MyWishlists;
	
	@FindBy(how = How.CSS, using = "#center_column > div > div:nth-child(1) > ul > li:nth-child(2) > a > span")
	public static WebElement MyCreditSlips;
	
	@FindBy(how = How.CSS, using = "#center_column > div > div:nth-child(1) > ul > li:nth-child(3) > a > span")
	public static WebElement MyAddresses;
	
	@FindBy(how = How.CSS, using = "#center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a > span")
	public static WebElement MyPersonalInformaiton;
	
	@FindBy(how = How.CSS, using="#block_top_menu > ul > li:nth-child(1) > a" )
	public static WebElement WOMENLink;
	
	@FindBy(how = How.CSS, using="#block_top_menu > ul > li:nth-child(2) > a" )
	public static WebElement DRESSLink;
	
	@FindBy(how = How.CSS, using="#block_top_menu > ul > li:nth-child(3) > a" )
	public static WebElement TSHIRTSLink;
	
	@FindBy(how = How.CSS, using="#block_top_menu > ul > li:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
	public static WebElement WomenTShitLink;
	
	@FindBy(how = How.CSS, using="#block_top_menu > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
	public static WebElement WomenTopsLink;

}
