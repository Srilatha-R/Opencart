package genericUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Reporter.log("Browser is laucnhed",true);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized",true);
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@BeforeMethod
	public void NavigateToApplication() {
		driver.get("https://demo.opencart.com/");
		Reporter.log("Navigated to application",true);
	}
	
	@AfterMethod
	public void LogoutOperation() {
		
	}

}
