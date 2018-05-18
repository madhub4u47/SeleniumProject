package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Workspace\\lib\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LoginPage login = new LoginPage();
		login.url.length();
		login.LoginApplication("user@gmail.com", "password");
		
		

	}

}
