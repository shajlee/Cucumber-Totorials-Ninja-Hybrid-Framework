package ninja_step_defination_files;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ninja_factory.Ninja_Driver_Factory;
import ninja_page_files.Ninja_Login_Page;

public class Ninja_Login {
	public WebDriver driver;

	@Given("user navigates to the login page")
	public void user_navigates_to_the_login_page() {
		driver = Ninja_Driver_Factory.getNinjaDriver();
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		loginpage.clickOnMyAccountLink();
		loginpage.clicOnLoginLink();

	}

	@And("user enters valid email {string} in email field")
	public void user_enters_valid_email_in_email_field(String validEmailText) {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		loginpage.enterEmail(validEmailText);

	}

	@And("user enters valid password {string} in password field")
	public void user_enters_valid_password_in_password_field(String validPasswordText) {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		loginpage.enterPassword(validPasswordText);

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		loginpage.clickOnLoginButton();

	}

	@Then("user gets successfully logged in")
	public void user_gets_successfully_logged_in() {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		Assert.assertTrue(loginpage.successfulLogiinLinkIsDisplayed());

	}

	@And("user enters invalid email in email field")
	public void user_enters_invalid_email_in_email_field() {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		loginpage.enterEmail(getEmailWithTimeStamp());

	}

	@And("user enters invalid password {string} in password field")
	public void user_enters_invalid_password_in_password_field(String invalidPasswordText) {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		loginpage.enterPassword(invalidPasswordText);

	}

	@Then("user gets credentials mismatch warning message")
	public void user_gets_credentials_mismatch_warning_message() {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		Assert.assertTrue(loginpage.invalidCredentialsWarningIsDisplayed());

	}

	@And("user keeps email field blank")
	public void user_keeps_email_field_blank() {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		loginpage.enterEmail("");

	}

	@And("user keeps password field blank")
	public void user_keeps_password_field_blank() {
		Ninja_Login_Page loginpage = new Ninja_Login_Page(driver);
		loginpage.enterPassword("");

	}

	private String getEmailWithTimeStamp() {
		Date date = new Date();
		String emailTimeStamp = date.toString().replace("", "_").replace(":", "_");
		return "chowdhurygs" + emailTimeStamp + "@gmail.com";

	}

}
