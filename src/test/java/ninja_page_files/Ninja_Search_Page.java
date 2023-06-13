package ninja_page_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ninja_Search_Page {
	public WebDriver driver;
	
	@FindBy(name = "search")
	private WebElement validProductSearchBox;
	
	@FindBy(name = "search")
	private WebElement invalidProductSearchBox;
	
	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement searchButton;
	
	@FindBy(linkText = "MacBook")
	private WebElement validProduct;
	
	@FindBy(css = "input#button-search+h2+p")
	private WebElement invalidProductMessage;
	
	public Ninja_Search_Page(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	
	}
	public void validProductSearchBox(String validProductText) {
		validProductSearchBox.sendKeys(validProductText);
		
	}
	public void invalidPrductSearchBox(String invalidProductText) {
		invalidProductSearchBox.sendKeys(invalidProductText);
		
		
	}
	public void clickOnSearchButton() {
		searchButton.click();
	
	}
	public boolean validProductisDisplayed() {
		boolean displayStatus = validProduct.isDisplayed();
		return displayStatus;
	}
	public boolean invalidProductMessage() {
		 boolean displayStatus = invalidProductMessage.isDisplayed();
		 return displayStatus;

}
}
	
