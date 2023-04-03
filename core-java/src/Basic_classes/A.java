package Basic_classes;

public class A {
	       static int a=m1();// 1 st execute
	       
   static public int m1() {
	                System.out.println("A:a");
	                return 10;
   }
   static {
	              System.out.println("A class is loaded");// 2nd execute
   }
	public static void main(String[] args) {
		System.out.println("A main");// 

	}

}
