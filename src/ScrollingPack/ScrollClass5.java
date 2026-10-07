package ScrollingPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScrollClass5 {
	public static WebDriver driver;
  @Test
  public void myscroll() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].value='selenium'" , driver.findElement(By.name("txtUserName")) );
		
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].value='cypress'" , driver.findElement(By.name("txtPassword")));
		
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()" , driver.findElement(By.name("Submit")));
		
		
		
		
  }
  
 
}
