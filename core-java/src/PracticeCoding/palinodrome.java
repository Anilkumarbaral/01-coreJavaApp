package PracticeCoding;

public class palinodrome {

	public static void main(String[] args) {
		    //taking variable
		int r,sum=0,temp=0;		
		
		int n=545;
		temp=n;
	  while(n>0) {
		  
		  r=n%10;// getting reminder
		  
		  sum=(sum*10)+r;
		  n=n/10;		  		  
		      
	  }//while
	  if(temp==sum) {
		   System.out.println( "   this is palindrome number ");
	  }
	  else {
		  System.out.println("   this is not palindrome number");
	  }

	}

}
