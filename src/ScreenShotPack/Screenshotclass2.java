package ScreenShotPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshotclass2 {
	public static WebDriver driver;
  @Test
  public void screenshotpro() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		ss("Home_Page");
		Thread.sleep(3000);
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("cypress");
		
		ss("Usename_Password");
		Thread.sleep(3000);
				
		driver.findElement(By.name("Submit")).click();
		ss("After_Login");
		Thread.sleep(3000);
  }
  
  public void ss(String q) throws IOException
  {
	  	File S3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T3 = new File("C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\MyProofs\\" +q +".jpg");
		FileHandler.copy(S3, T3);
  }
}
