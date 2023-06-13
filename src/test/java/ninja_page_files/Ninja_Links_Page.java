package ninja_page_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ninja_Links_Page {
	public WebDriver driver;
	
	@FindBy(linkText = "Desktops")
	private WebElement desktopsLink;
	
	@FindBy(linkText = "Show AllDesktops")
	private WebElement showAlldesktopsButton;
	
	@FindBy(css = "div.col-sm-9 h2")
	private WebElement desktopMessage;
	
	@FindBy(linkText = "Laptops & Notebooks")
	private WebElement laptopsAndNotebooksLink;
	
	@FindBy(linkText = "Show AllLaptops & Notebooks")
	private WebElement showAllLaptopsAndNotebooksButton;
	
	@FindBy(css = "div.col-sm-9 h2")
	private WebElement laptopsAndNotebooksMessage;
	
	@FindBy(linkText = "Components")
	private WebElement componentsLink;
	
	@FindBy(linkText = "Show AllComponents")
	private WebElement showAllcomponentsButton;
	
	@FindBy(css = "div.col-sm-9 h2")
	private WebElement componentsMessage;
	
	@FindBy(linkText = "Tablets")
	private WebElement tabletsLink;
	
	@FindBy(css = "div.col-sm-9 h2")
	private WebElement tabletMessage;
	
	@FindBy(linkText = "Software")
	private WebElement softwareLink;
	
	@FindBy(css = "div.col-sm-9 h2")
	private WebElement softwareMessage;
	
	@FindBy(linkText = "Phones & PDAs")
	private WebElement phonesAndPDAsLink;
	
	@FindBy(css = "div.col-sm-9 h2")
	private WebElement phonesAndPDAsMessage;
	
	@FindBy(linkText = "Cameras")
	private WebElement camerasLink;
	
	@FindBy(css = "div.col-sm-9 h2")
	private WebElement camerasMessage;
	
	@FindBy(linkText = "MP3 Players")
	private WebElement mp3PlayersLink;
	
	@FindBy(linkText = "Show AllMP3 Players")
	private WebElement showAllMp3PlayersButton;
	
	@FindBy(css = "div.col-sm-9 h2")
	private WebElement mp3PlayerMessage;
	
	public Ninja_Links_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	public void clickOnDesktopsLink() {
		desktopsLink.click();
	}
	public void clickOnshowAlldesktopsButton() {
		 showAlldesktopsButton.click();
	}
	public boolean desktopMessageIsDisplayed() {
		boolean displayStatus = desktopMessage.isDisplayed();
		return displayStatus;
	}
	public void clickOnLaptopsAndNotebooksLink() {
		laptopsAndNotebooksLink.click();
	}
	public void clickOnShowAllLaptopsAndNotebooksButton() {
		showAllLaptopsAndNotebooksButton.click();
	}
	public boolean laptopsAndNotebooksMessageIsDisplayed() {
		boolean displayStatus = laptopsAndNotebooksMessage.isDisplayed();
	    return displayStatus;
    }
    public void clickOnComponentsLink() {
    	componentsLink.click();
    }
    public void clickOnShowAllcomponentsButton() {
    	showAllcomponentsButton.click();
    }
    public boolean componentsMessageIsDisplayed() {
    	boolean displayStatus = componentsMessage.isDisplayed();
    	return displayStatus;
    }
    public void clickOntabletsLink() {
    	tabletsLink.click();
    }
    public boolean tabletMessageIsDisplayed() {
    	boolean displayStatus = tabletMessage.isDisplayed();
    	return displayStatus;
    }
    public void clickOnSoftwareLink() {
    	softwareLink.click();
    }
    public boolean softwareMessageIsDisplayed() {
    	boolean displayStatus = softwareMessage.isDisplayed();
    	return displayStatus;
    }
    public void clickOnPhonesAndPDAsLink() {
    	phonesAndPDAsLink.click();
    }
    public boolean phonesAndPDAsMessageIsDisplayed() {
    	boolean displayStatus = phonesAndPDAsMessage.isDisplayed();
    	return displayStatus;
    }
    public void clickOnCamerasLink() {
    	camerasLink.click();
    }
    public boolean camerasMessageIsDisplayed() {
    	boolean displayStatus = camerasMessage.isDisplayed();
    	return displayStatus;
    }
    public void clickOnMP3PlayersLink() {
    	mp3PlayersLink.click();
    }
    public void clickOnShowAllMp3PlayersdesktopButton() {
    	showAllMp3PlayersButton.click();
    }
    public boolean mp3PlayerMessageIsDisplayed() {
    	boolean displayStatus = mp3PlayerMessage.isDisplayed();
    	return displayStatus;
    }

	    	
	}
	

	
	


