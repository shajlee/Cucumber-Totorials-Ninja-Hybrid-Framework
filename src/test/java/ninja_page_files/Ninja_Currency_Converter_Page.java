package ninja_page_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ninja_Currency_Converter_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyTab;
	
	@FindBy(xpath = "//button[text()='€Euro']")
	private WebElement euroButton;
	
	@FindBy(css = "button.btn.btn-link.dropdown-toggle strong")
	private WebElement euroButtonDisplay;
	
	@FindBy(xpath = "//button[text()='£Pound Sterling']")
	private WebElement poundSterlingButton;
	
	@FindBy(css = "button.btn.btn-link.dropdown-toggle strong")
	private WebElement poundSterlingButtonDisplay;
	
	@FindBy(xpath = "//button[text()='$US Dollar']")
	private WebElement usDollarButton;
	
	@FindBy(css = "button.btn.btn-link.dropdown-toggle strong")
	private WebElement usDollarButtonDisplay;
	
	public Ninja_Currency_Converter_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnCurrencyTab() {
		currencyTab.click();
	}
	public void clickOnEuroButton() {
		euroButton.click();
	}
	public boolean euroSignIsDisplayed() {
		boolean displayStatus = euroButtonDisplay.isDisplayed();
		return displayStatus;
	}
	public void clickOnPoundSterlingButton() {
		poundSterlingButton.click();
	}
	public boolean poundSterlingSignIsDisplayed() {
		boolean displayStatus = poundSterlingButtonDisplay.isDisplayed();
		return displayStatus;
	}
	public void clickOnUSDollarButton() {
		usDollarButton.click();
	}
	public boolean usDollarSignisDIsplayed() {
		boolean displayStatus = usDollarButtonDisplay.isDisplayed();
		return displayStatus;
		
		
	}
	
	
	

}
