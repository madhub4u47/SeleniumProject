package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp");
		
		//Fill Data in gmail account set up 
		driver.findElement(By.id("FirstName")).sendKeys("Divyesh");
		driver.findElement(By.id("LastName")).sendKeys("Patel");
		driver.findElement(By.id("GmailAddress")).sendKeys("DivyeshPatelTesting");
		driver.findElement(By.id("Passwd")).sendKeys("Tru$ted123");
		driver.findElement(By.id("PasswdAgain")).sendKeys("Tru$ted123");
		//div[4] = April  ..... //span[@id = 'BirthMonth']/div[2]/div[4]/div
	
		
		driver.findElement(By.xpath("//span[@id = 'BirthMonth']/div")).sendKeys("April");
		driver.findElement(By.id("BirthDay")).sendKeys("17");
		driver.findElement(By.id("BirthYear")).sendKeys("1977");
		

		driver.findElement(By.xpath("//div[@id = 'Gender']/div")).sendKeys("Male");
		
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("7737916623");
	
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("divyera@gmail.com");
		
//		driver.findElement(By.id("submitbutton")).click();
	}

}
