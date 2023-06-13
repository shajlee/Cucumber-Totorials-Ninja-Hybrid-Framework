package ninja_step_defination_files;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ninja_factory.Ninja_Driver_Factory;
import ninja_page_files.Ninja_Search_Page;

public class Ninja_Search {
	public WebDriver driver;

	@Given("I navigate to the url")
	public void i_navigate_to_the_url() {
		driver = Ninja_Driver_Factory.getNinjaDriver();

	}

	@Then("I enter the valid product name {string} in the search field")
	public void i_enter_the_valid_product_name_in_the_search_field(String validProductText) {
		Ninja_Search_Page ninjaSearchObj = new Ninja_Search_Page(driver);
		ninjaSearchObj.validProductSearchBox(validProductText);

	}

	@When("I click the search button")
	public void i_click_the_search_button() {
		Ninja_Search_Page ninjaSearchObj = new Ninja_Search_Page(driver);
		ninjaSearchObj.clickOnSearchButton();

	}

	@Then("I get a valid product displayed")
	public void i_get_a_valid_product_displayed() {
		Ninja_Search_Page ninjaSearchObj = new Ninja_Search_Page(driver);
		Assert.assertTrue(ninjaSearchObj.validProductisDisplayed());

	}

	@Then("I enter the invalid product name {string} in the search field")
	public void i_enter_the_invalid_product_name_in_the_search_field(String invalidProductText) {
		Ninja_Search_Page ninjaSearchObj = new Ninja_Search_Page(driver);
		ninjaSearchObj.invalidPrductSearchBox(invalidProductText);

	}

	@Then("I get an invalid product message")
	public void i_get_an_invalid_product_message() {
		Ninja_Search_Page ninjaSearchObj = new Ninja_Search_Page(driver);
		Assert.assertTrue(ninjaSearchObj.invalidProductMessage());

	}

}
