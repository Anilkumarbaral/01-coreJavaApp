package interview.strings;

import java.util.Scanner;

public class MobileNumberValidation {

	public static void main(String[] args) {
		 // 1. check the number is empty or blank
		//2.all arer digit existed or not
		//3. is it realy mobile number or not send otp to mobile no
		  
		            Scanner scn=new Scanner(System.in);
                   
		            while(true) {
		            	System.out.println("pls enter mobile num");
		            	         String number=scn.next();
		            	         
		            	         if(number.isBlank() || number.isEmpty()) {
		            	        	    System.out.println("mobile number should be not blank or empty");
		            	        	                      continue;
		            	         }
		            	         else {
		            	        	  try {
		            	        	          Long mn=Long.parseLong(number);
		            	        	          if(number.length()!=10) {
		            	        	        	System.out.println("pls enter 10 digit number");   
		            	        	        	continue;
		            	        	          }
		            	        	          else {
		            	        	        	  System.out.println("Activation key has been send to ur number");
		            	        	        	  System.out.println("enter the activation key ");
		            	        	        	  break;
		            	        	          }
		            	          }catch(NumberFormatException  nfe) {
		            	        	   System.out.println("pls enter digit only");
		            	        	   continue;
		            	          }
		            	         }
		            	        
		            	                  
		            	        	        
		            	        	        	
		            	        	        }//while
	            	
		            }//main
		             
	}//class


