 package step.definitions;

import java.util.List;

import java.util.Map;

import org.junit.Assert;

import core.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.masterthought.cucumber.util.Util;
import page.objects.AllDesktopPage;
import utilities.WebDriverUtility;

public class AllDesktopsStepDef extends Base {
	AllDesktopPage allDesktopPage = new AllDesktopPage();
	
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		allDesktopPage.isLogoDisplayed();
		logger.info("user is on retail website");
		WebDriverUtility.screenShotName();
	}
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		allDesktopPage.clickOnDesktop();
		logger.info("user click on desktop tab");
	}
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		allDesktopPage.clickOnShowAllDesktops();
		logger.info("user click on show all desktops");
		WebDriverUtility.screenShotName();
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		Assert.assertTrue(allDesktopPage.isLogoDisplayed());
		logger.info("user should see all items are present in desktop page");
		WebDriverUtility.screenShotName();	
	}
	@When("User click ADD TO CART option on {string} item")
	public void user_click_add_to_cart_option_on_item(String string) {
		allDesktopPage.ClickOnAddToCartOption();
		}
	//1
	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		allDesktopPage.selectQuantity(string);
		
		}
	
	@Then("User should see a message ‘Success: you have added HP LP {string} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(String string) {
			Assert.assertTrue(allDesktopPage.isLogoDisplayed1());
		logger.info("user should see A message Success: you have added HPLP");
		WebDriverUtility.screenShotName();
	}
	
	//EOS5D
	@When("User click ADD TO CART option on ‘Canon EOS {string} item")
	public void user_click_add_to_cart_option_on_canon_eos_item(String string) {
		allDesktopPage.ClickOnCanon();
		logger.info("user click add To cart option on 'Canon EOS {String} item");
		}
	//2
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		allDesktopPage.SelectDropdown();
	logger.info("user select color from Dropdown 'red'");
		
		}
	//3
	@When("User select quantityy {string}")
	public void user_select_quantityy(String string) {
		allDesktopPage.selectQuantity(string);
		logger.info("user select quantityy");
	 	}
	@When("User click add to Cart button1")
	public void user_click_add_to_cart_button1() {
		allDesktopPage.ClickOnAddToCart();
	logger.info("user CLick add to cart button");
	  
	}
	@Then("User should see a message1 {string}")
	public void user_should_see_a_message1(String expectedmessageValue) throws InterruptedException {

		Assert.assertTrue(allDesktopPage.validateSucessMessage());
		Thread.sleep(2000);

	}
		
	//EOS5DReview	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws InterruptedException {
		allDesktopPage.ClickOnCanon();
		logger.info("User click on Canon EOS 5D item");
		Thread.sleep(2000);
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() throws InterruptedException {
		allDesktopPage.clickOnWriteAReviewLink();
		logger.info("User click on write a review link");
		Thread.sleep(2000);
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> infoList = dataTable.asMaps(String.class, String.class);
		allDesktopPage.SelectName(infoList.get(0).get("youname"));
		allDesktopPage.sendReview(infoList.get(0).get("reviewtext"));
		allDesktopPage.selectRatingRadioButton();
		Thread.sleep(2000);

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() throws InterruptedException {
		allDesktopPage.clickOncontunioButton();
		logger.info("user click on continue Button");
		Thread.sleep(2000);

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) throws InterruptedException {
		allDesktopPage.reviewmessageisdisplay();
		logger.info("user can see the message");
		WebDriverUtility.screenShotName();
		Thread.sleep(2000);
	}
	   
	
}
