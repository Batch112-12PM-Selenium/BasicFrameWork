package XPATHPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbsoulteXpathClass {
	public static WebDriver driver;
  @Test
  public void xpathdata() {
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("cypress");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/input")).click();
  }
}
