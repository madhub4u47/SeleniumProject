package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Workspace\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='footer-upper']/div/ul/li/a"));
		int count = list.size();
		
		for(int i=1;i<=3;i++)
		{
			int divCount= driver.findElements(By.xpath("//div[@class='footer-upper']/div["+i+"]/ul/li/a")).size();
			
			for(int j=1;j<=divCount;j++)
			{
				String item = driver.findElement(By.xpath("//div[@class='footer-upper']/div["+i+"]/ul/li["+j+"]/a")).getText();
				System.out.println(item);
			}
		}

	}

}
