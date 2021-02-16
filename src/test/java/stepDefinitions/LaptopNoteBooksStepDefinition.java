package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Laptops_NoteBooksPageObj;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base {
	
	Laptops_NoteBooksPageObj laptops=new Laptops_NoteBooksPageObj();


	@When("^User click on Laptop &NoteBooktab$")
	public void user_click_on_Laptop_NoteBooktab() throws Throwable {
		laptops.clicklaptopNotbooktab();
		logger.info("user click on Laptops and notebook tabs");
	    WebDriverUtility.screenShot();

	}

	@When("^User click on Show all Laptop &NoteBookoption$")
	public void user_click_on_Show_all_Laptop_NoteBookoption() throws Throwable {
	 laptops.clickShowAllLaptopNotebookOpt();
	 logger.info("User click on show all Laptops and Notebooks");
	 WebDriverUtility.screenShot();
	}

	@When("^User click on MacBook  item$")
	public void user_click_on_MacBook_item() throws Throwable {
	    laptops.clickMacbookImg();
	    logger.info("user click on MacBook image");
	    WebDriverUtility.screenShot();
	}

	@When("^User click at add to Cart button$")
	public void user_click_at_add_to_Cart_button() throws Throwable {
	    laptops.clickaddtoCartNotbookBtn();
	    logger.info("user click on at add to cart button");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	    
	}
	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
	    laptops.Msg();
	    logger.info("you have added MacBook to your cart");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^User should see ‘(\\d+)tem\\(s\\)-(\\d+)\\.(\\d+)’showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(int arg1, int arg2, int arg3) throws Throwable {
	   laptops.showTotalCartItem();
	   logger.info("total cart items");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
	    laptops.clickCartOption();
	    logger.info("user click on cart option");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
	    laptops.clickremoveFromCartBtn();
	    logger.info("user click remove button to remove the item from cart");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^item should be removed and cartshould show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cartshould_show_item_s(int arg1) throws Throwable {
	   laptops.ShowEmptyCart();
	   logger.info("cart should be empty");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}
}
