package upskillutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpDrivers {
	
	public static WebDriver driver;
	public static void setupChromeDriver() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-- start maximized");
		options.addArguments("--disabled -notification");
		options.addArguments("--headless");
		
		
		
		driver = new ChromeDriver(options);
		
		driver.get("https://www.ebay.com/");
	}

	/*public static void setupFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}*/

	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDownDriver() {
		driver.quit();
	}


}
