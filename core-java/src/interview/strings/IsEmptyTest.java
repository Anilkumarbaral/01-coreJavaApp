package interview.strings;

import java.util.Scanner;

//wAP to read the name from kwboard 
//if is empty then display error and ask to enter again name if it give correct name then display hi with name
public class IsEmptyTest {

	public static void main(String[] args) {
		     Scanner scn=new Scanner(System.in);
		     
		     //im using while loop
		         while(true) {
		        	      //read the inputs
		        	 System.out.println("pls enter name");
		        	 String name=scn.nextLine();
		        	     if(name.isEmpty() ||name.isBlank()) {
		        	    	 System.out.println("name is required");
		        	    	 continue;
		        	     }//if
		        	     else {
//		        	    	  String rename=name.trim();
//		        	    	 if(rename.isEmpty()) {
//		        	    		 System.out.println("name is required");
//		        	    		 continue;
//		        	    	 }//nested if
		        	    	
		        	    		 System.out.println("Hi "+name);
		        	    		 System.out.println("welcome to NareshIT");
		        	    		 break;
		        	    	 }// else
		        	     }//while
		         }
	}


