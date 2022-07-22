package step.definitions;
import core.Base;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.LaptopAndNoteBooksPage;
import utilities.WebDriverUtility;

public class LaptopAndNoteBooksStepDef extends Base {
	LaptopAndNoteBooksPage laptopAndNoteBooksPage = new LaptopAndNoteBooksPage();

//PorductComparison
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	laptopAndNoteBooksPage.ShowAllLaptopAndNoteBooks();
	logger.info("user click ON show all laptop and NoteBook option");
	WebDriverUtility.takeScreenShot();
}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
	laptopAndNoteBooksPage.clickOnMacBookComparison();
	logger.info("user click On product comparison icom on {String}");
	Thread.sleep(2000);
}
@When("User click on product comparison icon on ‘MacBook Air")
public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
	laptopAndNoteBooksPage.ClickOnMacBookAirComparison();
	logger.info("user click on product comparison icom on MACBOOKAIR");
	Thread.sleep(2000);
}
@Then("User should see a message {string}")
public void user_should_see_a_message(String string) throws InterruptedException {
Assert.assertTrue(laptopAndNoteBooksPage.SuccessMessageComparison());
	logger.info("user should see A message 'SUCCESS'");
	Thread.sleep(2000);
}
@Then("User click on Product comparison link")
public void user_click_on_product_comparison_link() throws InterruptedException {
	laptopAndNoteBooksPage.ProductComparison();
	logger.info("user click ON product comparison link");
	Thread.sleep(2000);
}
//1
@Then("User should see Product Comparison Chart")
public void user_should_see_product_comparison_chart() {
	laptopAndNoteBooksPage.ProductComparisonChart();
	logger.info("user should SEE product comparison chart");
	
}	
//Adding Item To whishlist
//@When("User click on Show all Laptop &NoteBook option")
//public void user_click_on_show_all_laptop_note_book_optionn() {
//	laptopAndNoteBooksPage.SonyVaIOAddToWishList();
//	logger.info("user click on show ALL laptop and notebook Option");
		

@When("User click on heart icon to add {string} laptop to wish list")
public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	laptopAndNoteBooksPage.SonyVaIOAddToWishList();
 logger.info("user click on heart icom to ADD Sony VAIO laptop to wish list");
}
@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws Throwable {
Assert.assertTrue(laptopAndNoteBooksPage.LoginCreateAccoutSonyVAIOIsdisplayed());
logger.info ("user should get a message 'You must login or create an account to save Sony VAIO to your wish list");
Thread.sleep(2000);
}
//ValidatePrice
@When("User click on ‘MacBook Pro’ item")
public void user_click_on_mac_book_pro_item() {
	laptopAndNoteBooksPage.MacBookPro();
	logger.info("user click on macBook pro Item");
}
@Then("User should see {string} price tag is present on UI.")
public void user_should_see_price_tag_is_present_on_ui(String string) {
	Assert.assertTrue(laptopAndNoteBooksPage.PriceTagmacBookPro());
	logger.info("user should see price tag is present on UI");
	WebDriverUtility.takeScreenShot();
}

}


