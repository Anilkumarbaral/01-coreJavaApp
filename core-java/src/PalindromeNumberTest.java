import java.util.Scanner;

public class PalindromeNumberTest {

	public static void main(String[] args) {
	    // i want perform palindrome number as dynamic
		//palindrome means that a number after reverse it showing as same mean 121,454
		Scanner scn=new Scanner(System.in);
		System.out.println("pls enter ur number: ");
		int n=scn.nextInt();
		// im taking more variable for 
		int r,sum=0,temp;
		
		temp=n;//further comparing
		
		while(n>0) {
			r=n%10;// getting reminder
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("it is palindrome number");
		}else {
			System.out.println("it is not palindrome number");
		}
		

	}

}
