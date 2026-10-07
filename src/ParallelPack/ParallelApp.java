package ParallelPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelApp {
	public static WebDriver driver;
  @Test
  public void Google() throws InterruptedException {
	  System.out.println("Google : --> " +Thread.currentThread().getId());
	  
	  	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			Thread.sleep(3000);
  }
  
  @Test
  public void OranegHRM() throws InterruptedException {
	  System.out.println("OrangeHRM : --> " +Thread.currentThread().getId());
	  Thread.sleep(2000);
	  	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("selenium");
			driver.findElement(By.name("txtPassword")).sendKeys("cypress");
			driver.findElement(By.name("Submit")).click();
			
			Thread.sleep(3000);
  }
}
