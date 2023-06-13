package ninja_hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ninja_factory.Ninja_Driver_Factory;
import ninja_utilities.Ninja_Utils;


public class Ninja_Hooks {
	public WebDriver driver;
	public Properties prop;
	
	@Before
	public void setUp() throws Exception {
		prop = Ninja_Utils.initializeProperties();
		Ninja_Driver_Factory.initializeBrowser(prop.getProperty("browser1"));
		driver = Ninja_Driver_Factory.getNinjaDriver();
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Ninja_Utils.IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Ninja_Utils.PAGELOAD_TIME));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Ninja_Utils.SCRIPT_TIME));
		driver.manage().deleteAllCookies();
	}
	@After
	public void tearDown() {
		driver.quit();
		}
		
		
		
	}
	


