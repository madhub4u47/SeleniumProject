package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\lib\\jk\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        //parent window
        String originalWindow = driver.getWindowHandle();

        driver.switchTo().frame("footer");
        driver.findElement(By.linkText("Privacy Policy")).click();
        
        //child window
        Set<String> windows = driver.getWindowHandles();
        
        for(String window:windows)
        {
        	driver.switchTo().window(window);
        }
        driver.manage().window().maximize();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("where")));
    	
    	Thread.sleep(5000);
        WebElement ele = driver.findElement(By.id("where"));
    	 Select select = new Select(ele);
         select.selectByVisibleText("PhoneBanking");
         
         Set<String> childwindows = driver.getWindowHandles();
         
         for(String window1 :childwindows)
         {
        	 String windowTitle = driver.switchTo().window(window1).getTitle();
        	 
        	 if(windowTitle.contains("HDFC Bank PhoneBanking"))
        	 {
        		 break;
        	 }
         }
         driver.manage().window().maximize();
         Thread.sleep(4000);
         Select state = new Select(driver.findElement(By.id("state")));
         state.selectByValue("Hyderabad");
         
         driver.findElement(By.id("display")).click();
         
	}

}
