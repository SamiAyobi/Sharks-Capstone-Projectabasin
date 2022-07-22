package step.definitions;

import java.util.List;

import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailScenarioPage;
import utilities.WebDriverUtility;

public class RetailScenarioStepDef extends Base {

	RetailScenarioPage retail = new RetailScenarioPage();
	
	//RetialFeature,Background
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
	    retail.clickOnMyAccount();
	    logger.info("user click ON MyAccount");
	}
	@When("User click on Login")
	public void user_click_on_login() {
	    retail.clickOnLogInButton();
	    logger.info("user click on LogIn");
	}
	//1
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String EmailValue , String PasswordValue) throws InterruptedException {
		retail.enterEmail(EmailValue);
		retail.enterPassword(PasswordValue);;
		Thread.sleep(3000);
	  	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLogInButton();
	
			}
	//2
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(retail.accountDashboardPresent());
		logger.info("User is logged into Account Dashboard");
		}	
	
		//RegisterAffiliatedInfo
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.clickOnRegisterLink();
		logger.info("user clicked ON register for an affiliate account link");
		
	}    
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> affiliateinformation = dataTable.asMaps(String.class,String.class);
		retail.enterCompanyName(affiliateinformation.get(0).get("company"));
		retail.enerWebSiteName(affiliateinformation.get(0).get("website"));
		retail.enterTaxId(affiliateinformation.get(0).get("taxID"));
		retail.enterPayeeName(affiliateinformation.get(0).get("paymentMethod"));
		retail.enterPayeeName(affiliateinformation.get(0).get("payeeName"));
		logger.info("user fill affilate form with bellow info");
		WebDriverUtility.takeScreenShot();
		
	}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	    retail.clickOnAboutUs();
	    logger.info("user check ON about us check box");
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    retail.clickOnContinueButton();
	    logger.info("user click on continue button");
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(retail.successMessageNotification());
		logger.info("Success message verified");
		WebDriverUtility.takeScreenShot();
	}
	
	///PaymentMethod
	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	    retail.clickEditAffiliateInfo();
	    logger.info("user click on Edit your affiliate information");
}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.clickOnPayMethodBank();
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> bankInformation = dataTable.asMaps(String.class, String.class);
		retail.enterBankName(bankInformation.get(0).get("bankName"));
		retail.enterBankName(bankInformation.get(0).get("abaNumber"));
		retail.enterBankName(bankInformation.get(0).get("swiftCode"));
		retail.enterBankName(bankInformation.get(0).get("accountName"));
		retail.enterBankName(bankInformation.get(0).get("accountNumber"));
		WebDriverUtility.takeScreenShot();
	}
	@When("User click on Continue buttonn")
	public void user_click_on_continue_buttonn() {
	retail.clickOnContinueButton();
	logger.info("user click on continue BUTTON");
  }
	
	
//	@Then("User should see a success messagee")
//	public void user_should_see_a_success_messagee() {

	///AccountInfoEdit
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retail.clickEditYourAccountInfo();
		logger.info("user Click on edit your account info link");
	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> personalInformation = dataTable.asMaps(String.class, String.class);
		retail.enterfirstName(personalInformation.get(0).get("firstname"));
		retail.enterlastName(personalInformation.get(0).get("lastName"));
		retail.enterEmail1(personalInformation.get(0).get("email"));
		retail.enterTelephone(personalInformation.get(0).get("telephone"));
		WebDriverUtility.takeScreenShot();
	}
	@Then("User should see a messageee Success: Your account has been successfully updated.")
	public void user_should_see_a_messageee_success_your_account_has_been_successfully_updated() {
		Assert.assertTrue(retail.actualSuccessMessage());
		logger.info("user should see a message success Your account has been successfully updated");
	}
	
	@When("User click on continue buttonnn")
	public void user_click_on_continue_buttonnn() {
		retail.clickOnContinueButton();
		logger.info("user click on continue Button");
	}
	
	
	
}
