package PracticeCoding;

import java.util.Scanner;

public class wap_verifylength {

	public static void main(String[] args) {
		   //1 verify is the blank or empty
		//2. is it should be length between 8 to 16
		//3.it should be only digit
		
		
		Scanner scn=new Scanner(System.in);
		             
		             while(true) {
		            	 System.out.println("pls enter password");
		            	 String password=scn.nextLine();
		            	    if(password.isBlank()&&password.isEmpty()) {
		            	    	             System.out.println("password shoudnt empty or blank:");
		            	    	             continue;
		            	    }
		            	      if(password.length()>=8 && password.length()<=16) {
		            	    	      System.out.println("sucessfully registred: ");
		            	    	      break;
		            	      }else {
		            	    	              System.out.println("pssword should in between 8 to 16: ");
		            	    	              continue;
		            	      }
		            	        
		            	        
		             }

	}

}
