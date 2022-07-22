package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.HomePagePage;
import utilities.WebDriverUtility;

public class HomePageStepDef extends Base {

	HomePagePage homePage = new HomePagePage();
	
	
	
@When("User click on Currency")
public void user_click_on_currency() {
   homePage.clickCurrency();
   logger.info("user click on currency");
   
}
@When("User Chose Euro from dropdown")
public void user_chose_euro_from_dropdown() {
	homePage.clickEuro();
	logger.info("user chose euro from dropdown");
	
}
@Then("currency value should change to Euro")
public void currency_value_should_change_to_euro() {
   Assert.assertTrue(homePage.changeToEuroSuccess());
   logger.info("currency value should change to Euro");
   WebDriverUtility.takeScreenShot();	
}

@When("User click on shopping cart")
public void user_click_on_shopping_cart() {
	homePage.clickShoppingCart();
	logger.info("user click on shopping cart");
}
@Then("“Your shopping cart is empty!” message should display")
public void your_shopping_cart_is_empty_message_should_display() {
	Assert.assertTrue(homePage.shopingCartEmptyMessage());
	logger.info("your shopping cart is empty message should display");
	WebDriverUtility.takeScreenShot();	



}}