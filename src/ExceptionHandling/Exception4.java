package ExceptionHandling;

import org.testng.annotations.Test;

public class Exception4 {
  @Test
  public void DataCheck() {
	  int a = 17;
	  int b = 0;
	  int c = 51;
	  
	  try
	  {
	  
	  System.out.println("The Division of A and B is : " +(a/b));
	  
	  }
	  catch(Exception e)
	  {	
		  	System.out.println(e.getMessage());
	  }
	  System.out.println("The Division of C and A is : " +(c/a));
  }
}
