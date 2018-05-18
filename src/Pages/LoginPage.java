package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginPage {

	WebDriver driver;
	static int i=0;
	public String url = "http://demo.nopcommerce.com";
	
	public LoginPage()
	{
		i= i+1;
	}
	
	public int Count()
	{
		return i;
	}
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void LoginApplication(String userName, String password)
	{
		driver.get(url);
        WebElement ele = driver.findElement(By.linkText("Log in"));
        ele.click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.name("Password")).sendKeys(password);
	}
}
