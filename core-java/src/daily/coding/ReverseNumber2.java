package daily.coding;

public class ReverseNumber2 {

	public static void main(String[] args) {
		   int number=1234;
		   int reverse=0;
		   
		   while(number!=0) {
			   // first is find out reminder
			   
			   int reminder=number%10;
			   reverse=reverse*10+reminder;
			   
			   number=number/10;
			   
		   }
		   System.out.println("after reversed :"+reverse);

	}

}
