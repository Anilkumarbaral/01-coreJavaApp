package daily.coding;

public class FindOutThePrimeNumber {

	public static void main(String[] args) {
	// finding the prime nubmber means 
		// the number is divible by 2 and itself mean 3 5 7 11
		
		  /// im taking number is 10 is prime number not checking
		
		   int number=9;
		   
		       // im using if else loop
		   
		      if(number==1||number==2) {
		    	  if(number%2==0) {
		    		  System.out.println("this is not prime number");
		    	  }
		      }//if
		      else {
		    	   if(number%2==0) {
		    		   System.out.println("this number is not prime number   "+number);
		    	   }
		    	   else {
		    		   System.out.println("this  is prime number   "+number);
		    	   }
		    	  
		      }
	}

}
