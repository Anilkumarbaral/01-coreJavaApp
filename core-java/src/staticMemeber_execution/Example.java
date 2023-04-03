package staticMemeber_execution;

public class Example {

	static int a=m1();
	
	   static int m1() {
		      System.out.println("SV: a");
		      System.out.println(10+10);
		      int a=30;
		      int b=70;
		      int c=a+b;
		      System.out.println(c);
		      
		      return 10;
	   }
	
	public static void main(String[] args) {
		     System.out.println("main");
             m1();
          //   public int x=20;
             final int x=20;
	}

}
