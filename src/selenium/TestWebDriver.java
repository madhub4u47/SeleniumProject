package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestWebDriver {
		
	static WebDriver driver;
	
	public static void main(String args[])
	{
		TestWebDriver test = new TestWebDriver();
		driver = test.OpenBrowser("chrome", "E:\\Selenium Workspace\\lib\\chromedriver.exe");
		driver.get("http://google.com");
	}
	
	public WebDriver OpenBrowser(String browserName , String driverPath)
	{
		if(browserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", driverPath);
			driver = new InternetExplorerDriver();
		}
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}
		
		return driver;
	}
}
