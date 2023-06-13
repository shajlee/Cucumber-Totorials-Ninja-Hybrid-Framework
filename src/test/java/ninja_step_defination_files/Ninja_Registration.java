package ninja_step_defination_files;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ninja_factory.Ninja_Driver_Factory;
import ninja_page_files.Ninja_Registration_Page;

public class Ninja_Registration {
	public WebDriver driver;

	@Given("I navigate to the Register Page")
	public void i_navigate_to_the_register_page() {
		driver = Ninja_Driver_Factory.getNinjaDriver();
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		registrationPageObj.clickOnMyAccountLink();
		registrationPageObj.clickOnregistrationLink();

	}

	@When("I enter the details into below fields with duplicate email")
	public void i_enter_the_details_into_below_fields_with_duplicate_email(DataTable dataTable) {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		registrationPageObj.enterFirstName(dataMap.get("firstname"));
		registrationPageObj.enterLastNameTextBox(dataMap.get("lastname"));
		registrationPageObj.enterEmailTextBox(dataMap.get("email"));
		registrationPageObj.enterTelephoneNumber(dataMap.get("telephone"));
		registrationPageObj.enterPassword(dataMap.get("password"));
		registrationPageObj.enterPasswordConfirmation(dataMap.get("passwordConfirmation"));

	}

	@When("I enter the details into below fields")
	public void i_enter_the_details_into_below_fields(DataTable dataTable) {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		registrationPageObj.enterFirstName(dataMap.get("firstname"));
		registrationPageObj.enterLastNameTextBox(dataMap.get("lastname"));
		registrationPageObj.enterEmailTextBox(getEmailWithTimeStamp());
		registrationPageObj.enterTelephoneNumber(dataMap.get("telephone"));
		registrationPageObj.enterPassword(dataMap.get("password"));
		registrationPageObj.enterPasswordConfirmation(dataMap.get("passwordConfirmation"));

	}

	@And("I click the Privacy Policy checkbox")
	public void i_click_the_privacy_policy_checkbox() {
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		registrationPageObj.clickOnPrivacyPolicyAgreement();

	}

	@When("I click the Continue button")
	public void i_click_the_continue_button() {
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		registrationPageObj.clickOnContinueButton();

	}

	@Then("I get a succssfull account creation message")
	public void i_get_a_succssfull_account_creation_message() {
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		Assert.assertTrue(registrationPageObj.successfulAccountCreationMessage());

	}

	@And("I select Yes for Newsletter")
	public void i_select_yes_for_newsletter() {
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		List<WebElement> radioButton = registrationPageObj.radioButton();
		for (int i = 0; i < radioButton.size(); i++) {
			if (radioButton.get(i).getAttribute("value").equalsIgnoreCase("1")) {
				radioButton.get(i).click();
				break;
			}
		}

	}

	@Then("I get a duplicated account warning message")
	public void i_get_a_duplicated_account_warning_message() {
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		Assert.assertTrue(registrationPageObj.duplicateAccountCreationMessage());

	}

	@When("I do not enter any field")
	public void i_do_not_enter_any_field() {

	}

	@And("I click on the continue button")
	public void i_click_on_the_continue_button() {
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		registrationPageObj.clickOnContinueButton();

	}

	@Then("I get warning message for each field")
	public void i_get_warning_message_for_each_field() {
		Ninja_Registration_Page registrationPageObj = new Ninja_Registration_Page(driver);
		Assert.assertTrue(registrationPageObj.privacyPolicyWarningMessage());
		Assert.assertTrue(registrationPageObj.firsNameWarningMessage());
		Assert.assertTrue(registrationPageObj.lastNameWarningMessage());
		Assert.assertTrue(registrationPageObj.emailWarningMessage());
		Assert.assertTrue(registrationPageObj.telephoneWarningMessage());
		Assert.assertTrue(registrationPageObj.passwordWarningMessage());

	}

	private String getEmailWithTimeStamp() {
		Date date = new Date();
		String emailTimeStamp = date.toString().replace("", "_").replace(":", "_");
		return "chowdhurygs" + emailTimeStamp + "@gmail.com";

	}
}
