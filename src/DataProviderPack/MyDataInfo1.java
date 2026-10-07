package DataProviderPack;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class MyDataInfo1 {
		
  @Test(dataProvider = "readingdata")
  public void TestCase(String n, String s) {
	  System.out.println("N --> " +n);
	  System.out.println("S --> " +s);
	  
  }
  
     

  @DataProvider
  public String[][] readingdata() {
	  String[][] A = new String[2][2];
			  
		A[0][0] = "ZeroZero";
		A[0][1] = "ZeroOne";
		A[1][0] = "OneZero";
		A[1][1] = "OneOne";
		return A;
    
  }
  

}
