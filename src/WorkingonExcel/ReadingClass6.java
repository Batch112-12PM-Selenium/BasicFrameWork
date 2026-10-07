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

public class ReadingClass6 {
	public static WebDriver driver;
  @Test
  public void exceldata()   {
	  
	  try
	  {
	  FileInputStream f = new FileInputStream("fckjherds");
	  }
	  catch(Exception e)
	  {
		  System.out.println("Please Provide a Proper File Name");
	  }
	  System.out.println("The Sum of A and B is : " +78);
	  
  }
	  
	  
  }

