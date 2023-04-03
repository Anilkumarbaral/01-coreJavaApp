package interview.strings;

import java.util.Scanner;

public class TestIndexOf_findingPosition {

	public static void main(String[] args) {
		     
		      Scanner scn=new Scanner (System.in);
		      System.out.println("pls enter only string");
		           String s1=scn.next();
		           
		           boolean bo=searchin(s1);
		           if(bo==true) {
		        	     System.out.println(s1+"    is available");
		           }
		           else
		        	   System.out.println(s1+"  is not availble");

	
	}
	public static boolean searchin(String s1) {
		if(  s1.indexOf("anil")!=-1) 
			  return true;
		else 
			return false;
		
	}

}
