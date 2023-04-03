package interview.strings;

import java.util.Scanner;

public class Tocheck_Hari_is_availableOrNot {

	public static void main(String[] args) {
		     
                       Scanner scn=new Scanner(System.in);
                       while(true) {
                    	        System.out.println("pls enter string");
                    	                String s1=scn.next();
                    	                String s2=s1.toLowerCase();
                    	                boolean available=s2.contains("hari");
                    	                if(available) {
                    	                	int startwith=s2.indexOf("hari");
                    	                	int endwith=startwith+4;
                    	                	String name=s1.substring(startwith,endwith);
                    	                	System.out.println(name+"   is available");
                    	                	  
                    	                }else
                    	                {
                    	                	System.out.println("not available");
                    	                }
                    	                
                    	   
                    	   
                       }
	}

}
  