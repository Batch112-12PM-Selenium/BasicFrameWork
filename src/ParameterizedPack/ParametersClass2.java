package ParameterizedPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass2 {
	public static WebDriver driver;
	
  @Parameters({"Bro", "UN", "PWD"})
  @Test
  public void Login(String Bro, String UN, String PWD) {
	  	  
	  if(Bro.equals("Ed"))
	  {
	  System.setProperty("webdriver.edge.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(UN);
		driver.findElement(By.name("txtPassword")).sendKeys(PWD);
		driver.findElement(By.name("Submit")).click();
	  }
	  
	  if(Bro.equals("Ch"))
	  {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(UN);
		driver.findElement(By.name("txtPassword")).sendKeys(PWD);
		driver.findElement(By.name("Submit")).click();
	  }
  }
}
