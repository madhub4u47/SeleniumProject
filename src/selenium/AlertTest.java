package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
        driver.findElement(By.xpath("//img[@alt='continue']")).click();
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        
        driver.findElement(By.name("fldLoginUserId")).sendKeys("234234");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("footer");
        driver.findElement(By.linkText("Privacy Policy")).click();

	}

}
