package daily.coding;

public class Date_17_02_23_FabonacciNumber_WithRecursion {
	static int n1=0,n2=1,n3=0;
		static void fabonacci(int count) {
			if(count>0) {
			     n3=n1+n2;
			     n1=n2;
			     n2=n3;
			     System.out.println(" "+n3);
			     fabonacci(count-1);
			}//if
			     
		}//static method
	public static void main(String[] args) {
	int count=10;
		fabonacci(count-2);
		
             
	}

}
