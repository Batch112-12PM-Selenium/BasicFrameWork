package PriorityPack;

import org.testng.annotations.Test;

public class Fruits2 {
	
  @Test (priority = 2)
  public void mango() {
	  System.out.println("Hai I am mango test case - 2");
  }
  
  @Test (priority = 4)
  public void Grapes() {
	  System.out.println("Hai I am Grapes test case - 4");
  }
  
  
  @Test (priority = 15)
  public void banana() {
	  System.out.println("Hai I am banana test case - 15");
  }
  
  
  @Test (priority = -18)
  public void Watermelon() {
	  System.out.println("Hai I am Watermelon test case - -18");
  }
  
   
  @Test (priority = 1)
  public void dragonFruit() {
	  System.out.println("Hai I am dragonFruit test case - 1");
  }
  
  
  @Test (priority = 17)
  public void chico() {
	  System.out.println("Hai I am chico test case - 17");
  }
  
  
  @Test (priority = 22)
  public void Kiwi() {
	  System.out.println("Hai I am Kiwi test case  - 22");
  }
  
  
  @Test(priority = 28)
  public void Blueberry() {
	  System.out.println("Hai I am Blueberry test case - 28");
  }
  
  
  @Test(priority = -3)
  public void orange() {
	  System.out.println("Hai I am orange test case - -3");
  }
  
  @Test(priority = 30)
  public void strawBerry() {
	  System.out.println("Hai I am strawBerry test case - 30");
  }
  
  
  @Test(priority = 31)
  public void cherry() {
	  System.out.println("Hai I am cherry test case - 31");
  }
  
  
  @Test (priority = 33)
  public void Pomogrante() {
	  System.out.println("Hai I am Pomogrante test case - 33");
  }
  
  
  @Test (priority = 11)
  public void Papaya() {
	  System.out.println("Hai I am Papaya test case - 11");
  }
  
  
  
}
