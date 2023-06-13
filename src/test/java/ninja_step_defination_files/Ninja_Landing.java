package ninja_step_defination_files;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ninja_factory.Ninja_Driver_Factory;
import ninja_page_files.Ninja_Landing_Page;

public class Ninja_Landing {
	public WebDriver driver;

	@Given("I open the the page")
	public void i_open_the_the_page() {
		driver = Ninja_Driver_Factory.getNinjaDriver();

	}

	@Then("I get a valid product advertisement displayed")
	public void i_get_a_valid_product_advertisement_displayed() {
		Ninja_Landing_Page landingPageObj = new Ninja_Landing_Page(driver);
		Assert.assertTrue(landingPageObj.featureAdvertisementIsDisplayed());
	}

}
