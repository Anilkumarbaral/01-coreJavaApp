package daily.coding;

public class FindThePrimeNumber {

	public static void main(String[] args) {
		//find the prime number
		
		
		   //means which number is divisble by 1 and itslef is callled prime number
		//greater than 1 and 2     
		int m=0;
		int flag=0;
		int number =13;
		m=number/2;
		
		if(number==1 || number ==2) {
			 System.out.println("this is not prime number");
		}
		else {
			   
			  for(int i=2;i<=m;i++) {
				  if(number%i==0) {
					  System.out.println("this number is not  prime number");
					  flag=1;
					  break;
				  }
			  }//for
		
		
		}//else
		
		if(flag==0) {
			System.out.println("this number is prime number");
		}

	}

}
