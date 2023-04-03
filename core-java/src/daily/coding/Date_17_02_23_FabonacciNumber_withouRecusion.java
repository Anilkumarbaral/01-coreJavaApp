package daily.coding;

public class Date_17_02_23_FabonacciNumber_withouRecusion {

	public static void main(String[] args) {
		
		//without using recursion method //fabonacci means current number is sum of two previous number
		//ex  0,1,1,2,3,5...
		//im declaring variables
		int n1=0,n2=1,n3,count=10;
		System.out.println(n1+"      "+n2);
		//using for loop
		System.out.println();
		
		     for( int i=0;i<count;i++) {
		    	 
		    	    n3=n1+n2;
		    	    System.out.print("  "+n3);
		    	    n1=n2;
		    	    n2=n3;
		    	 
		     }
	}

}
