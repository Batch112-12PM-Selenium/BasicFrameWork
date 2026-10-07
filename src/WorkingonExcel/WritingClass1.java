package WorkingonExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingClass1 {
  @Test
  public void exceldata() throws IOException {
	  
	  FileInputStream f = new FileInputStream("C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\MyData\\Employees.xlsx");
	  
	  XSSFWorkbook w = new XSSFWorkbook(f);
	  XSSFSheet sht = w.getSheet("Evening");
	  
	
	  XSSFRow r0 = sht.createRow(0);
	  XSSFCell r0c0 = r0.createCell(0);
	  
	  r0c0.setCellValue("Today is not holiday");
	  
	  FileOutputStream fo = new FileOutputStream("C:\\My Personal\\Batches\\Batch112_12PM_Selenium\\MyData\\Employees.xlsx");
	  
	  
	  w.write(fo);
	  
	  
  }
}
