package ninja_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Ninja_Driver_Factory {
	public static WebDriver driver;
	public static ChromeOptions optionsC;
	public static FirefoxOptions optionsF;
	public static EdgeOptions optionsE;
	
	public static void initializeBrowser(String browserName) {
		if(browserName.equals("chrome")) {
			 optionsC = new ChromeOptions();
			 optionsC.addArguments("--incognito");
			 driver = new ChromeDriver(optionsC);
		}else if(browserName.equals("firefox")){
			optionsF = new FirefoxOptions();
			optionsF.addArguments("--incognito");
			driver = new FirefoxDriver(optionsF);
			}else if(browserName.equals("edge")) {
				optionsE = new EdgeOptions();
				optionsE.addArguments("--incognito");
				driver = new EdgeDriver(optionsE);
	

}
	}
	public static WebDriver getNinjaDriver() {
		return driver;

}
}
