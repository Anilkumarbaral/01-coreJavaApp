package loop;

public class Find_the_LargestNumber2 {
       public static int findthelargernumber(int x,int y,int z) {
    	     
    	   if(x>=y && x>=z) {
    		     return x;
    	   }
    	   else if(y>=x && y>=z) {
    		   return y;
    	   }
    	   else {
    		   return z;
    	   }	   
       }
	public static void main(String[] args) {
	
		int a,b,c,largernumber;
		
		a=22;b=39;c=32;
		
		  largernumber=findthelargernumber(a, b, c);
		  System.out.println(largernumber);
	}

}
