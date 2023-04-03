package loop;

public class Find_the_LargestNumber {
         public static void findthelargernumber(int a,int b,int c) {
        	      
        	               int fln=(a>b)?(a>c?a:c):(b>c?b:c);
        	               System.out.println("this is the larger number: "+fln);
         }
	public static void main(String[] args) {
		int x=56;
		int y=88;
		int z=77;
		
		findthelargernumber(x, y, z);
		
		

	}

}
