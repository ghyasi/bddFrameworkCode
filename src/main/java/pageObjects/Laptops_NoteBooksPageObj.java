package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Laptops_NoteBooksPageObj extends Base {
	
	public  Laptops_NoteBooksPageObj() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	      private WebElement laptopNotbooktab;
	
	//@FindBy(xpath="//a[contains(text(),'Macs (0)')]")
	//private WebElement MacsOpt;
	
	//@FindBy(xpath="//a[contains(text(),'Windows (0)')]")
	//private WebElement windowsOpt;
	
	@FindBy(xpath="//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLaptopNotebookOpt;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")
	private WebElement MacbookImg;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	private WebElement addtoCartNotebookBtn;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]")
	private WebElement Msg;
	
	@FindBy(xpath="//*[@id=\"cart-total\"]")
	private WebElement TotalCartItem;
	
	@FindBy(xpath="//*[@id=\"cart\"]/button")
	private WebElement CartOption;
	
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
	private WebElement removeFromCartBtn;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement ShowEmptyCart;
	
	//*******************************************************************************
	
	public void clicklaptopNotbooktab() {
		WebDriverUtility.clickOnElement(laptopNotbooktab);
	}
	
	public void clickShowAllLaptopNotebookOpt() {
		WebDriverUtility.clickOnElement(ShowAllLaptopNotebookOpt);
	}
	
	public void clickMacbookImg() {
		WebDriverUtility.clickOnElement(MacbookImg);
	}
	
	public void clickaddtoCartNotbookBtn() {
		WebDriverUtility.clickOnElement(addtoCartNotebookBtn);
	}
	public boolean Msg() {
		boolean addTocartMsg=Msg.isDisplayed();
				return addTocartMsg;
	}
	
	public String showTotalCartItem() {
		return WebDriverUtility.getText(TotalCartItem);
	}
	
	public void clickCartOption() {
		WebDriverUtility.clickOnElement(CartOption);
	}
	
	public void clickremoveFromCartBtn() {
		WebDriverUtility.clickOnElement(removeFromCartBtn);
	}
	
	public String ShowEmptyCart() {
		return WebDriverUtility.getText(ShowEmptyCart);
	}
	
	
}
