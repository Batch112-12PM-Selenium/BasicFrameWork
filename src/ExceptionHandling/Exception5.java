package ExceptionHandling;

import org.testng.annotations.Test;

public class Exception5 {
  @Test
  public void DataCheck() throws InterruptedException {
	  int a = 17;
	  int b = 2;
	  int c = 51;
	  
	  System.out.println("The Division of A and B is : " +(a/b));
	  Thread.sleep(3000);
	  System.out.println("The Division of C and A is : " +(c/a));
  }
}
