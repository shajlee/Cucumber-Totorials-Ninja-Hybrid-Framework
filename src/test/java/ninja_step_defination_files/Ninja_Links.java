package ninja_step_defination_files;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ninja_factory.Ninja_Driver_Factory;
import ninja_page_files.Ninja_Links_Page;

public class Ninja_Links {
	public WebDriver driver;

	@Given("I navigate to the webpage")
	public void i_navigate_to_the_webpage() {
		driver = Ninja_Driver_Factory.getNinjaDriver();

	}

	@Then("I click the Desktops link")
	public void i_click_the_desktops_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnDesktopsLink();

	}

	@When("I click the Show AllDesktops link")
	public void i_click_the_show_all_desktops_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnshowAlldesktopsButton();

	}

	@Then("I see all the desktops")
	public void i_see_all_the_desktops() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		Assert.assertTrue(ninjaLinksObj.desktopMessageIsDisplayed());

	}

	@Given("I click the Laptops & Notebooks link")
	public void i_click_the_laptops_notebooks_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnLaptopsAndNotebooksLink();

	}

	@When("I click the Show AllLaptops & Notebooks link")
	public void i_click_the_show_all_laptops_notebooks_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnShowAllLaptopsAndNotebooksButton();

	}

	@Then("I see all the Laptops & Notebooks")
	public void i_see_all_the_laptops_notebooks() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		Assert.assertTrue(ninjaLinksObj.laptopsAndNotebooksMessageIsDisplayed());

	}

	@Given("I click the Components link")
	public void i_click_the_components_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnComponentsLink();

	}

	@When("I click the Show AllComponents link")
	public void i_click_the_show_all_components_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnShowAllcomponentsButton();

	}

	@Then("I see all the Components")
	public void i_see_all_the_components() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		Assert.assertTrue(ninjaLinksObj.componentsMessageIsDisplayed());

	}

	@Given("I click the Tablets link")
	public void i_click_the_tablets_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOntabletsLink();

	}

	@Then("I see all the Tablets")
	public void i_see_all_the_tablets() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		Assert.assertTrue(ninjaLinksObj.tabletMessageIsDisplayed());

	}

	@Given("I click the Software link")
	public void i_click_the_software_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnSoftwareLink();

	}

	@Then("I see all the Software")
	public void i_see_all_the_software() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		Assert.assertTrue(ninjaLinksObj.softwareMessageIsDisplayed());

	}

	@Given("I click the Phones & PDAs link")
	public void i_click_the_phones_pd_as_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnPhonesAndPDAsLink();

	}

	@Then("I see all the Phones & PDAs")
	public void i_see_all_the_phones_pd_as() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		Assert.assertTrue(ninjaLinksObj.phonesAndPDAsMessageIsDisplayed());

	}

	@Given("I click the Cameras link")
	public void i_click_the_cameras_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnCamerasLink();

	}

	@Then("I see all the Cameras")
	public void i_see_all_the_cameras() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		Assert.assertTrue(ninjaLinksObj.camerasMessageIsDisplayed());

	}

	@Given("I click the MP3 Players link")
	public void i_click_the_mp3_players_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnMP3PlayersLink();

	}

	@When("I click the Show AllMP3 Players link")
	public void i_click_the_show_all_mp3_players_link() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		ninjaLinksObj.clickOnShowAllMp3PlayersdesktopButton();

	}

	@Then("I see all the MP3 Players")
	public void i_see_all_the_mp3_players() {
		Ninja_Links_Page ninjaLinksObj = new Ninja_Links_Page(driver);
		Assert.assertTrue(ninjaLinksObj.mp3PlayerMessageIsDisplayed());

	}

}
