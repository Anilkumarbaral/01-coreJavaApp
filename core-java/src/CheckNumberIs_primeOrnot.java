import java.util.Scanner;

public class CheckNumberIs_primeOrnot {

	public static void main(String[] args) {
	   int i,m=0,flag=0;
	   Scanner scn=new Scanner(System.in);
	   System.out.println("pls enter ur number: ");
	       int n=scn.nextInt();//input number to be checked it is prime or not?
	       
	       m=n/2;//further condition checking quotient value
	       
	       if(n==0||n==1) {
	    	   System.out.println("this is not prime numer ");
	       }else {
	    	   for(i=2;i<=m;i++) {
	    		    if(n%i==0) {
	    		    	   System.out.println(" is not prime number");
	    		    	   flag=1;
	    		    	   break;
	    		    }//if
	    		    	
	    		    }//for
	    	   if(flag==0) {
		    		System.out.println("it is prime number");
		    	}
	    	   }
	       }	    		   
	}


