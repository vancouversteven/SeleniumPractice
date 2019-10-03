package AutomationQA.SeleniumPractice.FactoryObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPageObjects {
	@FindBy(how = How.CSS, using="#summary_products_quantity")
	public static WebElement SummaryProductsQuantity;
	
	@FindBy(how = How.CSS, using="#product_1_1_0_139460 > td.cart_product > a > img")
	public static WebElement Product_FradedShortSleeveTshirts;
	
	@FindBy(how = How.CSS, using="#product_1_1_0_139460 > td.cart_description > p > a")
	public static WebElement ProductDescription_FradedShortSleeveTshirts;
	
	@FindBy(how = How.CSS, using="#product_price_1_1_139460 > span")
	public static WebElement FradeShortsSleeveTshirts_unitprice;
	
	@FindBy(how = How.CSS, using="#product_1_1_0_139460 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey")
	public static WebElement FradeShortsSleeveTshirts_Qty;
	
	@FindBy(how = How.CSS, using="#total_product_price_1_1_139460")
	public static WebElement FradeShortsSleeveTshirts_Total;
	
	@FindBy(how = How.CSS, using="#total_product")
	public static WebElement TotalProducts;
	
	@FindBy(how = How.CSS, using="#total_shipping")
	public static WebElement TotalShipping;
	
	@FindBy(how = How.CSS, using="#total_price_without_tax")
	public static WebElement TotalPriceWithoutTax;
	
	@FindBy(how = How.CSS, using="#total_tax")
	public static WebElement TotalTax;
	
	@FindBy(how = How.CSS, using="#total_price")
	public static WebElement TotalPrice;
	
	@FindBy(how = How.CSS, using="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	public static WebElement ProceedToCheckoutBttn;
	
	@FindBy(how = How.CSS, using="#center_column > form > p > button")
	public static WebElement ProceedToCheckoutBttnInAddress;
	
	@FindBy(how = How.CSS, using="#form > p > button")
	public static WebElement ProceedToCheckoutBttnInShipping;
	
	@FindBy(how = How.CSS, using="#cgv")
	public static WebElement TermOfServiceCheckBox;
	
	@FindBy(how = How.CSS, using="#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
	public static WebElement PayByBankWireLink;
	
	@FindBy(how = How.CSS, using="#HOOK_PAYMENT > div:nth-child(2) > div > p > a")
	public static WebElement PayByCheckLink;
	
	@FindBy(how = How.CSS, using="#cart_navigation > button")
	public static WebElement IConfirmMyOrder;
	
	@FindBy(how = How.CSS, using="#center_column > div > p > strong")
	public static WebElement YourOrderOnMyStoreIsCompleteString;
}

