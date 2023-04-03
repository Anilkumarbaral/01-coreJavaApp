package PracticeCoding;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
	   Scanner scn=new Scanner(System.in);
		    int m,flag=0;
		    
		    System.out.println("pls enter check number");
		    
		    int n=scn.nextInt();
		    m=n/2;
		    
		      if(n==0||n==1) {
		    	  
		    	  System.out.println("this is not prime number");
		      }
		      else {
		    	  for(int i=2;i<=m;i++) {
		    		  
		    		      if(n%i==0) {
		    		    	  System.out.println("this is not prime number");
		    		    	  flag=1;
		    		    	  break;
		    		      }//if
		    	  }//for
		    	  if(flag==0) {
		    		  System.out.println(n+"  is a prime number");
		    	  }
		      }
	}

}
