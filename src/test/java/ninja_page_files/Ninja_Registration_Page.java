package ninja_page_files;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ninja_Registration_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;
	
	@FindBy(linkText = "Register")
	private WebElement registrationLink;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameTextBox;

	@FindBy(id = "input-lastname")
	private WebElement lastNameTextBox;

	@FindBy(id = "input-email")
	private WebElement emailTextBox;

	@FindBy(id = "input-telephone")
	private WebElement telephoneTextBox;

	@FindBy(id = "input-password")
	private WebElement passwordTextBox;

	@FindBy(id = "input-confirm")
	private WebElement passwordConfirmationTextBox;

	@FindBy(name = "agree")
	private WebElement privacyPolicyAgreement;

	@FindBy(css = "input.btn.btn-primary")
	private WebElement continueButton;

	@FindBy(css = "div#content h1")
	private WebElement successfulAccountCreationMessage;

	@FindBy(name = "newsletter")
	private List<WebElement> radioButton;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement duplicatedAccountCreationMessage;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement privacyPolicyWarningMessage;
	
	@FindBy(xpath = "//div[text()=\"First Name must be between 1 and 32 characters!\"]")
	private WebElement firsNameWarningMessage;
	
	@FindBy(xpath = "//div[text()=\"Last Name must be between 1 and 32 characters!\"]")
	private WebElement lastNameWarningMessage;
	
	@FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
	private WebElement emailWarningMessage;
	
	@FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
	private WebElement telephoneWarningMessage;
	
	@FindBy(xpath = "//div[text()='Password must be between 4 and 20 characters!']")
	private WebElement passwordWarningMessage;
	
	public Ninja_Registration_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyAccountLink() {
		 myAccountLink.click();
	}
	public void clickOnregistrationLink() {
		registrationLink.click();
	}
	public void enterFirstName(String firstNameText) {
		firstNameTextBox.sendKeys(firstNameText);
	}
	public void enterLastNameTextBox(String lastNameText) {
		lastNameTextBox.sendKeys(lastNameText);
	}
	public void enterEmailTextBox(String validEmailText) {
		emailTextBox.sendKeys(validEmailText);
	}
	public void enterTelephoneNumber(String telephoneNumber) {
		telephoneTextBox.sendKeys(telephoneNumber);
	}
	public void enterPassword(String validPasswordText) {
		passwordTextBox.sendKeys(validPasswordText);
	}
	public void enterPasswordConfirmation(String validPasswordConfirmationText) {
		 passwordConfirmationTextBox.sendKeys(validPasswordConfirmationText);
	}
	public void clickOnPrivacyPolicyAgreement() {
		privacyPolicyAgreement.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public boolean successfulAccountCreationMessage() {
		boolean displaystatus = successfulAccountCreationMessage.isDisplayed();
		return displaystatus;
	}
	public List <WebElement> radioButton() {
		return radioButton;
	}
	public boolean duplicateAccountCreationMessage() {
		boolean displayStatus = duplicatedAccountCreationMessage.isDisplayed();
		return displayStatus;
	}
	public boolean privacyPolicyWarningMessage() {
		boolean displayStatus = privacyPolicyWarningMessage.isDisplayed();
		return displayStatus;
	}
    public boolean firsNameWarningMessage() {
    	boolean displayStatus = firsNameWarningMessage.isDisplayed();
    	return displayStatus;
    }
    public boolean lastNameWarningMessage() {
    	boolean displayStatus = lastNameWarningMessage.isDisplayed();
    	return displayStatus;
    }
    public boolean emailWarningMessage() {
    	boolean displayStatus = emailWarningMessage.isDisplayed();
    	return displayStatus;
    }
    public boolean telephoneWarningMessage() {
    	boolean displayStatus = telephoneWarningMessage.isDisplayed();
    	return displayStatus;
    }
    public boolean passwordWarningMessage() {
    	boolean displayStatus = passwordWarningMessage.isDisplayed();
    	return displayStatus;
    }
}
