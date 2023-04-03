package daily.coding;

public class _02_swapTwoNumber {

	public static void swaptwonumbers(int a, int b) {
		// taking third variable //this is 1sp approach
		System.out.println("before swaiping a: " + a + " and  b : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("after swaping a: " + a + " and b :   " + b);
	}
	public static void main(String[] args) {
		// swaping two number by using third type variables
		int a =9;
		int b = 5;
		//swaptwonumbers(a, b);
		
		swapnumberapproach2(a, b);
	}
	
	// using second approach without using third type variable
      
	     public static void swapnumberapproach2(int m,int n) {
	    	 System.out.println("before it ws "+ m+"  n: "+n);
	    	 //m=9, n=5
	    	  m=m-n; //suppose 9-5=4
	    	//use differnces
	    	  n=m+n ;   //4+5=9
	    	
	    	 m=n-m; //9-4=5
	    	 
	    	 System.out.println("value of m: "+m+"value of n: "+n);
	    	 
	     }

}
