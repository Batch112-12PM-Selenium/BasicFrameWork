package WorkingonExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingClass5 {
	public static WebDriver driver;
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream f = new FileInputStream("C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\MyData\\Employees.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(f);
	  XSSFSheet sht = w.getSheet("OrangeHRM");
	  
	  String UN = sht.getRow(1).getCell(0).getStringCellValue();
	  String PWD = sht.getRow(1).getCell(1).getStringCellValue();
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\SeleniumSoftwares\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
	  }
	  
	  
  }

