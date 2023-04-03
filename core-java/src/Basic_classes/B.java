package Basic_classes;

public class B extends A {
	          static int b=m2();// 3rd execute
	          static public int m2() {
	        	   System.out.println("B:b");
	        	   return 20;
	          }
	    static {
	    	           System.out.println("B class is loaded");    	//4th execute          
	    }

	public static void main(String[] args) {
		      System.out.println("B main");
		      System.out.println("B main a: "+a);
		      System.out.println("B main b: "+b);

	}

}
