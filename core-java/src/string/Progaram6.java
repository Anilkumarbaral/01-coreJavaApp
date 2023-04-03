package string;

import java.util.Scanner;

public class Progaram6 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	    
	        
	   while(true) {
		   System.out.println("pls enter name: ");
		   String s=scn.nextLine();
		   if(s.isEmpty()) {
			  System.out.println("name is required : ");
			  continue;
		   }else {
			   String rename=s.trim();
			      if(rename.isEmpty()) {
			    	  System.out.println("need to enter name: ");
			    	  continue;
			      }
			      System.out.println("Hi.."+s);
			      System.out.println("welcome to nareshIT");
			      break;
		   }
	   }
	   
	}

}
