package PracticeCoding;

public class palinodrome1 {

	public static void main(String[] args) {
		//palindrome means 121 and madam like this  after reversing same like before was
		
		int number=121;
		int sum=0;
		int temp;
		int remider;
		
		temp=number;
		
		//reverse will work
		
		   while(number>0) {
			   
			       remider=number%10;
			       sum=(sum*10)+remider;
			       number=number/10;
		   }
		   if(temp==sum) {
			    System.out.println("this is palinodrome number");
		   }

	}

}
