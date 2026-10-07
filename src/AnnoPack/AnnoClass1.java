package AnnoPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnoClass1 {
  @Test
  public void TestCase() {
	  System.out.println("---------Hai I am Original Test Case-------");
  }
  
  @AfterSuite
  public void as() {
	  System.out.println("--------Hai I am After Suite----------");
  }
 
  

  @BeforeClass
  public void bc() {
	  System.out.println("--------Hai I am Before Class----------");
  }

  @AfterClass
  public void ac() {
	  System.out.println("--------Hai I am After Class----------");
  }

  

  @AfterTest
  public void at() {
	  System.out.println("--------Hai I am After Test----------");
  }

  @BeforeSuite
  public void bs() {
	  System.out.println("--------Hai I am Before Suite----------");
  }

  @AfterMethod
  public void am() {
	  System.out.println("--------Hai I am After Method----------");
  }

  @BeforeMethod
  public void bm() {
	  System.out.println("--------Hai I am Before Method----------");
  }
  @BeforeTest
  public void bt() {
	  System.out.println("--------Hai I am Before Test----------");
  }

}
