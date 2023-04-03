package daily.coding;

import java.util.Scanner;

public class Date_11_02_Findout_Odd_Even {

	public static void main(String[] args) {
		      Scanner scn=new Scanner(System.in);
		      System.out.println("pls enter number:  ");
		      int number=scn.nextInt();
		      
		      //find out the number is odd or even
		      
		      if(number%2==0) {
		    	  System.out.println(number+"   this number is even");
		      }
		      else
		    	  System.out.println("this is odd number");
		      
		      System.out.println();
		      String output=number%2==0?"this is even number ":"this is odd number";
		      System.out.println(output);
	}

}
