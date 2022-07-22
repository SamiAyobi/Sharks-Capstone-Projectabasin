package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePagePage extends Base {

	
	public HomePagePage() {
		PageFactory.initElements(driver, this);
	}

//homePage
	
@FindBy (xpath = "//span[text() = 'Currency']")
private WebElement currency;

@FindBy (xpath = "//button[@name = 'EUR']")
private WebElement euroSing;

@FindBy (xpath = "(//p[@class = 'price'])[1]")
private WebElement changeToEuro;

//ShopingCart

@FindBy (xpath = "//span[text() = 'Shopping Cart']")
private WebElement shoppingCart;

@FindBy (xpath = "(//p[text() = 'Your shopping cart is empty!'])[2]")
private WebElement shoppingCartEmptyMessage;

public void clickCurrency () {
	currency.click();
}
public void clickEuro() {
	euroSing.click();
}
public boolean changeToEuroSuccess() {
	if (changeToEuro.isDisplayed())
		return true;
		else 
	    return false;
}

public void clickShoppingCart() {
	shoppingCart.click();
		
}

public boolean shopingCartEmptyMessage() {
	if (shoppingCartEmptyMessage.isDisplayed())
			return true;
	else 
		return false;

}

}
