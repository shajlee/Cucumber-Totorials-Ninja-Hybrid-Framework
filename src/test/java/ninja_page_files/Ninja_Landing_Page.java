package ninja_page_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ninja_Landing_Page {
	public WebDriver driver;
	
	@FindBy(css = "div#content")
	private WebElement featuredAdvertisement;
	
	public Ninja_Landing_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean featureAdvertisementIsDisplayed() {
		boolean displayStatus = featuredAdvertisement.isDisplayed();
		return displayStatus;
		
	}
	}
	
	
	
	
	
	


