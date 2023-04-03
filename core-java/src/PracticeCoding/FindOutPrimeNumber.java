package PracticeCoding;

public class FindOutPrimeNumber {

	public static void main(String[] args) {
		//what is the mean of prime number is divisble by one or itself
		//number should be greater than 1
		//3 5 7 11 13 like this
		
		     int number=81;		int flag=0;
		     int mid=number/2;
		    		 //find out how many prime number is there
		    		 
		    if(number==0 || number==1) {
		    	  System.out.println("this is not prime number");
		    }
		    else {
		    	      for(int i=2;i<=mid;i++) {
		    	    	  if(number%i==0) {
		    	    		    System.out.println("this is not prime number");
		    	    		    flag=1;
		    	    		    break;
		    	    	  }//if
		    	      }//for
		    	      if(flag==0) {
		    	    	  System.out.println("this is prime number");
		    	      }
		    }
	}

}
