package DataProviderPack;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class MyDataApp1 {
	public static WebDriver driver;
		
  @Test(dataProvider = "readingdata")
  public void TestCase(String n, String s) {
	  System.setProperty("webdriver.edge.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(n);
		driver.findElement(By.name("txtPassword")).sendKeys(s);
		driver.findElement(By.name("Submit")).click();
	  
  }
  
     

  @DataProvider
  public String[][] readingdata() {
	  String[][] A = new String[2][2];
			  
		A[0][0] = "selenium";
		A[0][1] = "cypress";
		A[1][0] = "good";
		A[1][1] = "bad";
		return A;
    
  }
  

}
