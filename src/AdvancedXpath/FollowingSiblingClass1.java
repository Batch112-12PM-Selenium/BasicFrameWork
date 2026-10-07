package AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FollowingSiblingClass1 {
	public static WebDriver driver;
  @Test
  public void xpathdata() {
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//table[@cellpadding = '3']//following-sibling::input")).sendKeys("selenium");
		driver.findElement(By.xpath("//table[@cellpadding = '3']//following-sibling::input//following::input[1]")).sendKeys("cypress");
		driver.findElement(By.xpath("//table[@cellpadding = '3']//following-sibling::input//following::input[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//li[text()='Welcome selenium']")).getText());
  }
}
