
public class PalindromeExample {

	public static void main(String[] args) {
		int r,sum=0,temp;
		
//		Get the number to check for palindrome
//		Hold the number in temporary variable
//		Reverse the number
//		Compare the temporary number with reversed number
//		If both numbers are same, print "palindrome number"
//		Else print "not palindrome number
		
		
		int n=454;// it is the number variable to be checked is it palindrome or not
		
		  temp=n;
		  
		  while(n>0) {
			  r=n%10 ; // getting reminder
			  sum=(sum*10)+r;
			  n=n/10;
		  }
		  if(temp==sum) {
			  System.out.println("it is palindrome");
		  }else {
			  System.out.println("it is not palindrome");
		  }
		  
		

	}

}
