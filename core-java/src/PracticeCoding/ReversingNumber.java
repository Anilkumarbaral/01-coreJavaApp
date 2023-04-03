package PracticeCoding;

public class ReversingNumber {

	public static void main(String[] args) {
		   //reversing number means 12345 that reverse 54321
		
	         //given number 54321
		//out put=12345
		
		int number=54321;
		int reverse=0;
		
		  while(number!=0) {
			  
			       int reminder=number%10;
			       reverse=reverse*10+reminder;
			       number=number/10;
		  }
		  
		      System.out.println("after reverse : "+reverse);
    }
}