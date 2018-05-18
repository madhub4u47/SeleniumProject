package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://loadergenerator.com/example");
        driver.findElement(By.xpath("//input[@value='LOAD EXAMPLE']")).click();
        
        Wait wait = new FluentWait(driver).
        		withTimeout(30, TimeUnit.SECONDS).
        		pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        
        Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				
				System.out.println("Waiting for the Element ");
				WebElement element = driver.findElement(By.xpath("//div[text()='Here is the result of the ajax request']"));
				
				return element;
			}
		};
		
		wait.until(function);
	}

}
