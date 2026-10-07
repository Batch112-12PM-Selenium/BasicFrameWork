package ScannerPack;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Scanclass2 {
  @Test
  public void myinfo() {
	  
	  Scanner T = new Scanner(System.in);
	    
	  int sonage =  T.nextInt();
	  
	  
	  int fatherage = 24 + sonage;
	  
	  System.out.println("The Son age is : " +sonage);
	  System.out.println("The Father age is : "+fatherage);
	  
  }
}
