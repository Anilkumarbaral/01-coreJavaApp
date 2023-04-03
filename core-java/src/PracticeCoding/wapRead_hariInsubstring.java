package PracticeCoding;

import java.util.Scanner;

public class wapRead_hariInsubstring {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		  System.out.println("pls enter string ");
		  String name=scn.nextLine();
		  
		        boolean result =  searchingstring(name);
		        if(result ==true) {
		        	 System.out.println("hari is available");
		        }
		        else {
		        	System.out.println("hari is not available");
		        }

	}
	static boolean searchingstring(String name) {
		       if(   name.indexOf("hari")!=-1) {
		    	    return true;
		       }
		  return false;
	}

}
