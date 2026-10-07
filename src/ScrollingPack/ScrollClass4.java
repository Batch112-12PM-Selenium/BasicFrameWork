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

public class ScrollClass4 {
	public static WebDriver driver;
  @Test
  public void myscroll() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(8000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()" , driver.findElement(By.linkText("Seasonal Sales and events")));
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()" , driver.findElement(By.linkText("Seasonal Sales and events")));
		
		
		
		
  }
  
 
}
