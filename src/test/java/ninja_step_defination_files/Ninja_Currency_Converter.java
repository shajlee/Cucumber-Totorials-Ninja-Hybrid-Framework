package ninja_step_defination_files;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ninja_factory.Ninja_Driver_Factory;
import ninja_page_files.Ninja_Currency_Converter_Page;

public class Ninja_Currency_Converter {
	public WebDriver driver;

	@Given("I open the designated webpage")
	public void i_open_the_designated_webpage() {
		driver = Ninja_Driver_Factory.getNinjaDriver();

	}

	@When("I click the currency tab")
	public void i_click_the_currency_tab() throws Exception {
		Ninja_Currency_Converter_Page currencyConverterOBJ = new Ninja_Currency_Converter_Page(driver);
		currencyConverterOBJ.clickOnCurrencyTab();
		Thread.sleep(2000);

	}

	@And("I click the Euro button")
	public void i_click_the_euro_button() throws Exception {
		Ninja_Currency_Converter_Page currencyConverterOBJ = new Ninja_Currency_Converter_Page(driver);
		currencyConverterOBJ.clickOnEuroButton();
		Thread.sleep(2000);

	}

	@Then("I see the Euro sign")
	public void i_see_the_euro_sign() {
		Ninja_Currency_Converter_Page currencyConverterOBJ = new Ninja_Currency_Converter_Page(driver);
		Assert.assertTrue(currencyConverterOBJ.euroSignIsDisplayed());

	}

	@When("I click the Pound Sterling button")
	public void i_click_the_pound_sterling_button() throws Exception {
		Ninja_Currency_Converter_Page currencyConverterOBJ = new Ninja_Currency_Converter_Page(driver);
		currencyConverterOBJ.clickOnPoundSterlingButton();
		Thread.sleep(2000);

	}

	@Then("I see the Pound Sterling Sign")
	public void i_see_the_pound_sterling_sign() {
		Ninja_Currency_Converter_Page currencyConverterOBJ = new Ninja_Currency_Converter_Page(driver);
		Assert.assertTrue(currencyConverterOBJ.poundSterlingSignIsDisplayed());
		;

	}

	@When("I click the US Dollar button")
	public void i_click_the_us_dollar_button() throws Exception {
		Ninja_Currency_Converter_Page currencyConverterOBJ = new Ninja_Currency_Converter_Page(driver);
		currencyConverterOBJ.clickOnUSDollarButton();
		Thread.sleep(2000);

	}

	@Then("I see the US Dollar sign")
	public void i_see_the_us_dollar_sign() {
		Ninja_Currency_Converter_Page currencyConverterOBJ = new Ninja_Currency_Converter_Page(driver);
		Assert.assertTrue(currencyConverterOBJ.usDollarSignisDIsplayed());

	}

}
