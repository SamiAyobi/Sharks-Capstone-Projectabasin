package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNoteBooksPage extends Base {
	
public LaptopAndNoteBooksPage () {
	PageFactory.initElements(driver, this);
}
//Product Comparison
@FindBy (id = "'//div [@id = 'logo']")
private WebElement logo;

public boolean IsLogoDisplayed() {
if(logo.isDisplayed())
		return true;
		else
		return false;
}

@FindBy (xpath = "//a[text () = 'Laptops & Notebooks']")
private WebElement laptopAndNoteBook;

public void LaptopAndNoteBook() {
	laptopAndNoteBook.click();
}

@FindBy (xpath = "//a[text () = 'Show All Laptops & Notebooks']")
private WebElement showAllLaptopAndNoteBooks;

public void ShowAllLaptopAndNoteBooks() {
	showAllLaptopAndNoteBooks.click();
}

@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
private WebElement macBookComparisonButton;

public void clickOnMacBookComparison() {
	macBookComparisonButton.click();
}

@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
private WebElement macBookAirComparisonButton;

public void ClickOnMacBookAirComparison() {
	macBookAirComparisonButton.click();
}

@FindBy(xpath = "//div[@class= 'alert alert-success alert-dismissible']")
private WebElement successMessageComparison;

public boolean SuccessMessageComparison() {
if (successMessageComparison.isDisplayed())
		return true;
	else
		return false;
}

@FindBy (xpath = "//a[text()='product comparison']")
private WebElement productComparison;

public void ProductComparison() {
	productComparison.click();
}

@FindBy (id = "//div[@id= 'content']")
private List<WebElement> productComparisonChart;

public List<WebElement>ProductComparisonChart(){
	List<WebElement>ProductComparison = productComparisonChart;
	return ProductComparison;
}
//addingItemToWishList

@FindBy (xpath = "(//button[@type = 'button'][@data-original-title= 'Add to Wish List'])[5]")
private WebElement sonyVaIOAddToWishList;

public void SonyVaIOAddToWishList() {
sonyVaIOAddToWishList.click();
}

@FindBy (xpath = "//div[@class= 'alert alert-success alert-dismissible']")
private WebElement loginCreateAccoutSonyVAIOIsdisplayed;

public boolean LoginCreateAccoutSonyVAIOIsdisplayed() {
if (loginCreateAccoutSonyVAIOIsdisplayed.isDisplayed())
		return true;
	else 
		return false;
}

//ValidatePrice


@FindBy (xpath = "//a[text () = 'MacBook Pro']" )
private WebElement macBookPro;

public void MacBookPro() {
macBookPro.click();	
}
@FindBy (xpath = "//div[@id= 'product-product']")
private WebElement priceTagmacBookPro;

public boolean PriceTagmacBookPro() {
if (priceTagmacBookPro.isDisplayed())
	return true;
else
	return false;
}



}