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

public class Screenshotclass1 {
	public static WebDriver driver;
  @Test
  public void screenshotpro() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		//screenshot1
		File S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T1 = new File("C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\MyProofs\\Homepage.jpg");
		FileHandler.copy(S1, T1);
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("cypress");
		
		//screenshot2
		File S2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T2 = new File("C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\MyProofs\\Usernamepassword.jpg");
		FileHandler.copy(S2, T2);
		
		
		driver.findElement(By.name("Submit")).click();
		
		//screenshot3
		File S3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T3 = new File("C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\MyProofs\\AfterLogin.jpg");
		FileHandler.copy(S3, T3);
  }
}
