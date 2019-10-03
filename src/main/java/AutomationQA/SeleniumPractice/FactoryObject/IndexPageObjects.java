package AutomationQA.SeleniumPractice.FactoryObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.*;

public final class IndexPageObjects {
	@FindBy(how = How.CSS, using="#header > div.nav > div > div > nav > div.header_user_info > a" )
	public static WebElement loginLink;
	
	@FindBy(how = How.CSS, using="#block_top_menu > ul > li:nth-child(1) > a" )
	public static WebElement WOMENLink;
	
	@FindBy(how = How.CSS, using="#block_top_menu > ul > li:nth-child(2) > a" )
	public static WebElement DRESSLink;
	
	@FindBy(how = How.CSS, using="#block_top_menu > ul > li:nth-child(3) > a" )
	public static WebElement TSHIRTSLink;
	
	@FindBy(how = How.CSS, using="#search_query_top" )
	public static WebElement SearchInputField;
	
	@FindBy(how = How.CSS, using="#searchbox > button")
	public static WebElement SubmitSearchButton;
	
	@FindBy(how = How.CSS, using="#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a > span.ajax_cart_no_product")
	public static WebElement cartDisplay;

	
}
