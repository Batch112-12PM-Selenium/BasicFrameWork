package Waiting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlywaitClass1 {
	public static WebDriver driver;
  @Test
  public void xpathdata() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("cypress");
		
		WebElement L = new WebDriverWait(driver, Duration.ofSeconds(17)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
		L.click();
  }
}
