package MySkipPack;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Fruits1 {
	
  @Test
  public void mango() {
	  System.out.println("Hai I am mango test case");
  }
  
  @Test
  public void Grapes() {
	  System.out.println("Hai I am Grapes test case");
  }
  
  
  @Test (enabled = false)
  public void banana() {
	  System.out.println("Hai I am banana test case");
  }
  
  
  @Test
  public void Watermelon() {
	  System.out.println("Hai I am Watermelon test case");
  }
  
  
  @Test
  public void dragonFruit() {
	  
	  throw new SkipException("Don't Run with method name as Dragon-Fruit");
	  
  }
  
  
  @Test
  public void chico() {
	  System.out.println("Hai I am chico test case");
  }
  
  
  @Test
  public void Kiwi() {
	  System.out.println("Hai I am Kiwi test case");
  }
  
  
  @Test
  public void Blueberry() {
	  System.out.println("Hai I am Blueberry test case");
  }
  
  
  @Test
  public void orange() {
	  System.out.println("Hai I am orange test case");
  }
  
  @Test
  public void driverage()
  {
	  int age = 16;
	  if(age < 18)
	  {
		  throw new SkipException("Driver is NOT ELIGIBLE for DRIVING TEST");
	  }
  }
  @Test
  public void strawBerry() {
	  System.out.println("Hai I am strawBerry test case");
  }
  
  
  @Test
  public void cherry() {
	  System.out.println("Hai I am cherry test case");
  }
  
  
  @Test
  public void Pomogrante() {
	  System.out.println("Hai I am Pomogrante test case");
  }
  
  
  @Test
  public void Papaya() {
	  System.out.println("Hai I am Papaya test case");
  }
  
  
  
}
