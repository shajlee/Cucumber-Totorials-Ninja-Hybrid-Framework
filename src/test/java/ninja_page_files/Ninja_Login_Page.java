package ninja_page_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ninja_Login_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;
	
	@FindBy(linkText = "Login")
	private WebElement loginLink;
	
	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	
	@FindBy(id = "input-password")
	private WebElement passwordTextBox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement SuccessfulLoginLink;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement invalidCredentialsWarning;
	
	public Ninja_Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}
	public void clicOnLoginLink() {
		loginLink.click();
	}
	public void enterEmail(String validEmailText) {
		emailTextBox.sendKeys(validEmailText);
	}
	public void enterPassword(String validPasswordText) {
		passwordTextBox.sendKeys(validPasswordText);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public boolean successfulLogiinLinkIsDisplayed() {
		boolean displayStatus = SuccessfulLoginLink.isDisplayed();
		return displayStatus;
	}
	public boolean invalidCredentialsWarningIsDisplayed() {
		boolean displayStatus = invalidCredentialsWarning.isDisplayed();
		return displayStatus;
		
		
	}
	
	
	

}
