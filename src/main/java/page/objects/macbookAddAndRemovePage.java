package page.objects;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class macbookAddAndRemovePage extends Base{

		public macbookAddAndRemovePage() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//a[normalize-space()='TEST ENVIRONMENT']")
		private WebElement retailWebsite;

		@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
		private WebElement clickLaptopsNotebooks;
		
		@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
		private WebElement clickShowAllLaptops;
		
		@FindBy(xpath = "//a[text()='MacBook']")
		private WebElement clickMacBookItem;//done
		
		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement clickAddtoCartButton;//done
		
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement successMessageIsDisplayed;//done
		
		@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
		private WebElement itemDisplayedonCart;//done
		
		@FindBy(xpath ="//*[@id=\"cart\"]/button")
		private WebElement clickOnCart;//done
		
		@FindBy(xpath = "//button[@title='Remove']")
		private WebElement clickOnXButton;//done
		
		@FindBy(xpath = "//*[@id=\"cart-total\"]")
		private WebElement itemRemovedDisplayed;//done
		
		public boolean isLogoDisplayed() {
			if (retailWebsite.isDisplayed())
				return true;
			else
				return false;
		}

		
		
		public void clickLaptopsNotebooks() {
			clickLaptopsNotebooks.click();
		}
		
		public void clickShowAllLaptops() {
			clickShowAllLaptops.click();
		}

		public void clickMacBookItem() {
			clickMacBookItem.click();
		}
		
		public void clickAddtoCartButton() throws TimeoutException, InterruptedException {
			Thread.sleep(5000);
			clickAddtoCartButton.click();
		}
		
		public boolean successMessageIsDisplayed() {
			if(successMessageIsDisplayed.isDisplayed())
				return true;
			else
				return false;
		}
		
		public boolean itemDisplayedonCart() {
			if(itemDisplayedonCart.isDisplayed())
				return true;
			else 
				return false;
		}
		
		public void clickOnCart() {
			clickOnCart.click();
		}
		
		public void clickOnXButton() {
			clickOnXButton.click();
		}
		
		public boolean itemRemovedDisplayed() {
			if(itemRemovedDisplayed.isDisplayed())
				return true;
			else 
				return false;
		}
		
}