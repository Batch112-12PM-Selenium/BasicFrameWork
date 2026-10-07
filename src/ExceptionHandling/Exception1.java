package ExceptionHandling;

import org.testng.annotations.Test;

public class Exception1 {
  @Test
  public void DataCheck() {
	  int a = 17;
	  int b = 3;
	  int c = 51;
	  
	  System.out.println("The Division of A and B is : " +(a/b));
	  System.out.println("The Division of C and A is : " +(c/a));
  }
}
