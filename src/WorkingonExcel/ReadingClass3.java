package WorkingonExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingClass3 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream f = new FileInputStream("C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\MyData\\Employees.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(f);
	  XSSFSheet sht = w.getSheet("Good");
	  
	  int rcount = sht.getLastRowNum();
	  
	  System.out.println("The Number of rows in the given excel is : "+rcount);
	  
//	  for(int i = 0 ; i <= 270 ; i++)
//	  {
//	  String H = sht.getRow(i).getCell(0).getStringCellValue();
//	  
//	  System.out.println(H);
//	  
//	  }
	  
	  
  }
}
