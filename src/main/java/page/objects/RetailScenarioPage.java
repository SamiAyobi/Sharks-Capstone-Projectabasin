package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class RetailScenarioPage extends Base {

	public RetailScenarioPage () {
		PageFactory.initElements(driver, this);
	}
	//log in Background
	@FindBy (xpath = "//a[text() = 'My Account']")
	private WebElement myAccount;
	
	@FindBy (xpath = "//a[text() = 'Login']")
	private WebElement login;
	
	@FindBy (xpath = "//input[@id = 'input-email']")
	private WebElement emailInput;
	
	@FindBy (xpath = "//input[@id = 'input-password']")
	private WebElement passwordlInput;
	
	@FindBy (xpath = "//input[@value = 'Login']")
	private WebElement logInButton;
	
	
	public void clickOnMyAccount() {
	myAccount.click();
	}
		public void enterEmail(String EmailValue) {
		emailInput.sendKeys(EmailValue);
	}
		public void enterPassword(String PasswordValue) {
		passwordlInput.sendKeys(PasswordValue);
	}
		public void clickOnLogInButton() {
		logInButton.click();
	}
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement actual;
		
	public boolean accountDashboardPresent() {
	String expected = "Edit your account information";
	if(expected.equals(actual.getText()))
				return true;
			else
				return false;
	}
	
	//RegisterAffiliatedInfo
	@FindBy (xpath = "//a[text () = 'Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;
	
	@FindBy(id = "input-company")
	private WebElement CompanyNameInput;
	
	@FindBy(id = "input-website")
	private WebElement webSiteInput;
	
	@FindBy(id = "input-tax")
	private WebElement taxID;
	
	@FindBy(xpath = "//label[normalize-space()='Cheque']")
	private WebElement paymentMethodCheque;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUsCheckBox;
	
	@FindBy(id = "input-cheque")
	private WebElement payeeNameInput;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy (xpath = "//div[@class= 'alert alert-success alert-dismissible']")
	private WebElement successMessage;
	

public void clickOnRegisterLink() {
	registerForAnAffiliateAccount.click();
}
public void enterCompanyName(String companyNameValue) {
	CompanyNameInput.sendKeys(companyNameValue);
}
public void enerWebSiteName(String webSiteNameValue) {
	webSiteInput.sendKeys(webSiteNameValue);
}
public void enterTaxId(String taxIDValue) {
	taxID.sendKeys(taxIDValue);
}
public void selectPaymentMethod(String PaymentType) {
if (PaymentType.equalsIgnoreCase("cheque"))
	paymentMethodCheque.click();
else if (PaymentType.equalsIgnoreCase("paypal"))
	paymentMethodCheque.click();
else
	paymentMethodCheque.click();
}
public void enterPayeeName(String payeeNameValue) {
	payeeNameInput.sendKeys(payeeNameValue);
}
public void clickOnAboutUs() {
	aboutUsCheckBox.click();
}
public void clickOnContinueButton() {
continueButton.click();
}

public boolean successMessageNotification() {
	if (successMessage.isDisplayed())
		return true;
	else
		return false;
}
//AffiliatedInfortion
@FindBy (xpath = "//a [text() = 'Edit your affiliate information']")
private WebElement EditAffiliateInformation;

@FindBy(xpath = "//input[@value='bank']")
private WebElement paymentMethodBankTransfer;

@FindBy(id = "input-bank-name")
private WebElement bankName;

@FindBy(id = "input-bank-branch-number")
private WebElement abaBranchName;

@FindBy(id = "input-bank-swift-code")
private WebElement swiftCode;

@FindBy(id = "input-bank-account-name")
private WebElement accountName;

@FindBy(id = "input-bank-account-number")
private WebElement accountNumber;





public void clickEditAffiliateInfo() {
	EditAffiliateInformation.click();
}
public void clickOnPayMethodBank() {
	paymentMethodBankTransfer.click();
}
public void enterBankName(String bankNameValue) {
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("input-bank-name"))); 
	bankName.sendKeys(bankNameValue);
}
public void enterabaBranchName(String BranchNameValue) {
	abaBranchName.sendKeys(BranchNameValue);
}
public void enterswiftCode(String swiftCodeValue) {
	swiftCode.sendKeys(swiftCodeValue);
}
public void enteraccountName(String accountNameValue) {
	accountName.sendKeys(accountNameValue);
}
public void enteraccountNumber(String accountNumberValue) {
	accountNumber.sendKeys(accountNumberValue);
}

@FindBy (xpath = "//a[text ()= 'Edit your account information']")
private WebElement editYourAccountInfo;

@FindBy(id = "input-firstname")
private WebElement firstNameInput;

@FindBy(id = "input-lastname")
private WebElement lasttNameInput;

@FindBy(id = "input-email")
private WebElement emailInput1;

@FindBy(id ="input-telephone")
private WebElement telephoneInput;

@FindBy (xpath = "//div[@class= 'alert alert-success alert-dismissible']")
private WebElement successMessage1;


public void clickEditYourAccountInfo() {
	editYourAccountInfo.click();
}

public void enterfirstName(String firstNameValue) {
	firstNameInput.clear();
	firstNameInput.sendKeys(firstNameValue);
	
}
public void enterlastName(String lastNameValue) {
	lasttNameInput.clear();
	lasttNameInput.sendKeys(lastNameValue);
}
public void enterEmail1(String emailValue) {
	emailInput1.clear();
	emailInput1.sendKeys(emailValue);
}
public void enterTelephone(String telephoneValue) {
	telephoneInput.clear();
	telephoneInput.sendKeys(telephoneValue);

}

public boolean actualSuccessMessage() {
	if(successMessage1.isDisplayed())
	return true;
	else
	return false;
	



}
}