package string;

import java.util.Scanner;

public class Finding_name_diferentplaces {

	public static void main(String[] args) {
		  Scanner scn= new Scanner (System.in);
		    System.out.println("pls enter string ");
		        String name=scn.nextLine();
		        
		         for(int i=0;i<name.length();i++) {
		        	    char ch=name.charAt(i);
		        	    if(ch=='h'&&ch=='a'&&ch=='r'&&ch=='i') {
		        	    	System.out.println("hari is available");
		        	    	
		        	    }else {
		        	    	System.out.println("hari is not available");
		        	    	
		        	    }
		        	   
		         }

	}

}
