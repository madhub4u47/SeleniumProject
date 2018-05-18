package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://demo.nopcommerce.com/");
        
        WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
        
        Actions action = new Actions(driver);
        action.moveToElement(menu).build().perform();
        Thread.sleep(3000);
        action.click(driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]"))).build().perform();
        
        

	}

}
