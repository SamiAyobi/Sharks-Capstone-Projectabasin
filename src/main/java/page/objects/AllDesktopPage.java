package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AllDesktopPage extends Base {


	public AllDesktopPage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[2]")
	private WebElement desktopTab;
	
	@FindBy (xpath = "//a[text()='Show All Desktops']")
	private WebElement ShowAllDesktops;
		
	@FindBy (tagName= "img")
	private List<WebElement> items;
	
	
		
	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
				}
	
	public void clickOnDesktop() {
		Actions action = new Actions (driver);
		action.moveToElement(desktopTab).build().perform();
		
	}
	
	public void clickOnShowAllDesktops() {
		ShowAllDesktops.click();
	}
	
public List<WebElement> elements(){
	List <WebElement> DesktopsItems = items;
	return DesktopsItems;
}

	///HPLP
	
	  @FindBy(xpath="(//span[text()='Add to Cart'])[3]")
	   private WebElement addToCartOPtion;
	 
		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement quantityField;
	   
	   @FindBy (xpath = "//button[@id='button-cart']")
	   private WebElement addCartOption;
	   
	   @FindBy (xpath = "//div[text()= 'Success: You have added ']")
	   private WebElement successMessageHPLP;
	   
	 
	   public void ClickOnAddToCartOption() {
		   addToCartOPtion.click();
	   }
		
	   public void ClickAddCartOption() {
	   	addCartOption.click();
	}

		public boolean isLogoDisplayed1() {
			if (successMessageHPLP.isDisplayed())
				return true;
			else
				return false; 
	   }

		public void selectQuantity1(String input) {
			quantityField.clear();
			quantityField.sendKeys(input);
			
//EOS5D
		}

@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
private WebElement clickOnCanon;

@FindBy (xpath = "//select[@id='input-option226']")
private WebElement selectdropdown;

@FindBy (xpath = "//option[@value ='15']")
private WebElement selectCollor;

@FindBy(xpath = "//input[@id='input-quantity']")
private WebElement quantityField1;

@FindBy (xpath = "//button[@id='button-cart']")
private WebElement addToCart;

@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
private WebElement successMessage;


public void ClickOnCanon() {
	clickOnCanon.click();
}
public void ClickOnAddToCart() {
	addToCart.click();
}
public void SelectDropdown() {
	selectdropdown.click();
	selectCollor.click();
}
public void selectQuantity(String input) {
	quantityField.clear();
	quantityField.sendKeys(input);
}

public void AddToCartOption(String input) {
	addToCart.clear();
	addToCart.sendKeys(input);
}
public boolean validateSucessMessage() {
	if (successMessage.isDisplayed())
		return true;
	else
		return false;
}
	
//EOS5DReview

@FindBy (xpath = "//a[text() = 'Canon EOS 5D Camera']")
private WebElement clickOnEOS5DCamera;
@FindBy(xpath = "//a[normalize-space()='Write a review']")
private WebElement clickOnWriteAReviewLink;
@FindBy(id = "input-name")
private WebElement yourName;
@FindBy(xpath = "//*[@id='input-review']")
private WebElement reviewTextBox;
@FindBy(xpath = "//input[@name='rating' and @value='5']")
private WebElement ratingRadionButton;
@FindBy(xpath = "//button[@id='button-review']")
private WebElement clickOncontunioButton;
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
private WebElement reviewmessageisdisplay;

public void ClickOnEOS5DCamera () {
	clickOnEOS5DCamera.click();
	
}
public void clickOnWriteAReviewLink() {
	clickOnWriteAReviewLink.click();
}

public void SelectName(String string) {
	yourName.sendKeys("test");

}

public void sendReview(String review) {
	reviewTextBox.sendKeys(review);
}

public void selectRatingRadioButton() {
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
	}
	ratingRadionButton.click();
}

public void clickOncontunioButton() {
	clickOncontunioButton.click();
}

public void reviewmessageisdisplay() {
	reviewmessageisdisplay.isDisplayed();
}
	

}
