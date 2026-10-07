package ParallelPack;

import org.testng.annotations.Test;

public class MyParallel1 {
  @Test
  public void Adding() throws InterruptedException {
	  System.out.println("Adding : Running Track : " +Thread.currentThread().getId());
	  int a = 16;
	  int b = 8;
	  System.out.println("The Sum of A and B is : " +(a+b));
	  Thread.sleep(7000);
  }
  
  @Test
  public void Division() throws InterruptedException {
	  int a = 16;
	  System.out.println("Division : Running Track : " +Thread.currentThread().getId());
	  int b = 8;
	  System.out.println("The division of A and B is : " +(a/b));
	  Thread.sleep(5000);
  }
  
  @Test
  public void Product() throws InterruptedException {
	  System.out.println("Product : Running Track : " +Thread.currentThread().getId());
	  int a = 16;
	  int b = 8;
	  System.out.println("The Multiplication of A and B is : " +(a*b));
	  Thread.sleep(8000);
  }
  
  
  @Test
  public void Substract() throws InterruptedException {
	  System.out.println("Substract : Running Track : " +Thread.currentThread().getId());
	  int a = 16;
	  int b = 8;
	  System.out.println("The Difference of A and B is : " +(a-b));
	  Thread.sleep(3000);
  }
}
