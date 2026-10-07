package ScannerPack;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Scanclass3 {
  @Test
  public void myinfo() {
	  
	  Scanner G = new Scanner(System.in);
	  System.out.print("Please enter starting number to print next 100 consequtive numbers : " );
	  int firstint = G.nextInt();
	  
	 for(int a = firstint ; a <= firstint+100 ; a++)
	 {
		   System.out.println(a);
	 }
  }
}
