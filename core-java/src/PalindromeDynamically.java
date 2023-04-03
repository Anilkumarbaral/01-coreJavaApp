import java.util.Scanner;

public class PalindromeDynamically {

	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner scn=new Scanner(System.in);
		  System.out.println("pls enter number");
		    int n=scn.nextInt();
		    temp=n;
		    
		    while(n>0) {
		    	  r=n%10;// getting reminder
		    	  sum=(sum*10)+r;
		    	  n=n/10;
		    	      	  
		    }
		    if(temp==sum) {
		    	System.out.println("this is palindrome number");
		    }else {
		    	  System.out.println("this is not palindrome number");
		    }

	}

}
